package com.realbarrel.unitconverter.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import com.realbarrel.unitconverter.models.DataItemQuantities;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    private SQLiteDatabase mDatabase;
    private final SQLiteOpenHelper mDbHelper;

    public DataSource(Context context) {
        mDbHelper = new DBHelper(context);
        mDatabase = mDbHelper.getWritableDatabase();
    }

    public void open() {
        mDatabase = mDbHelper.getWritableDatabase();
    }

    public void close() {
        mDbHelper.close();
    }

    private void createItem(DataItemQuantities item) {
        ContentValues values = item.toValues();
        mDatabase.insert(QuantitiesTable.TABLE_QUANTITIES, null, values);

    }

    public void updateFavorite(DataItemQuantities item) {
        String[] ids = {item.getId()};

        ContentValues values = new ContentValues();
        values.put(QuantitiesTable.COLUMN_ID, item.getId());
        values.put(QuantitiesTable.COLUMN_TITLE, item.getTitle());
        values.put(QuantitiesTable.COLUMN_IMAGE, item.getImage());
        values.put(QuantitiesTable.COLUMN_FAVORITE, item.isFavorite());

        mDatabase.update(QuantitiesTable.TABLE_QUANTITIES, values,
                QuantitiesTable.COLUMN_ID + "=?", ids);
    }

    public List<DataItemQuantities> getAllItems(boolean favoriteFilter) {
        List<DataItemQuantities> dataItemQuantitiesList = new ArrayList<>();

        Cursor cursor;
        if (favoriteFilter) {
            String[] favorites = {"1"};
            cursor = mDatabase.query(QuantitiesTable.TABLE_QUANTITIES,
                    QuantitiesTable.ALL_COLUMNS, QuantitiesTable.COLUMN_FAVORITE + "=?",
                    favorites, null, null, null);
        } else {
            cursor = mDatabase.query(QuantitiesTable.TABLE_QUANTITIES,
                    QuantitiesTable.ALL_COLUMNS, null, null, null,
                    null, null);
        }

        while (cursor.moveToNext()) {
            DataItemQuantities item = new DataItemQuantities();
            item.setId(cursor.getString(cursor.getColumnIndex(QuantitiesTable.COLUMN_ID)));
            item.setTitle(cursor.getInt(cursor.getColumnIndex(QuantitiesTable.COLUMN_TITLE)));
            item.setImage(cursor.getString(cursor.getColumnIndex(QuantitiesTable.COLUMN_IMAGE)));
            item.setFavorite(cursor.getInt(cursor.getColumnIndex(QuantitiesTable.COLUMN_FAVORITE)) > 0);
            dataItemQuantitiesList.add(item);
        }

        cursor.close();
        return dataItemQuantitiesList;
    }

    private boolean quantityExist(String quantityId) {
        String[] quantitiesId = {quantityId};
        Cursor cursor = mDatabase.query(QuantitiesTable.TABLE_QUANTITIES, QuantitiesTable.ALL_IDS,
                QuantitiesTable.COLUMN_ID + "=?", quantitiesId, null, null,
                QuantitiesTable.COLUMN_TITLE);

        boolean exists = (cursor.getCount() > 0);
        cursor.close();
        return exists;
    }

    public void seedDataBase(List<DataItemQuantities> dataItemQuantitiesList) {
        for (DataItemQuantities item : dataItemQuantitiesList) {
            try {
                boolean quantityExists = quantityExist(item.getId());
                if (!quantityExists) {
                    createItem(item);
                }
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
        }
    }
}