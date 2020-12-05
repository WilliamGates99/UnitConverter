package com.realbarrel.unitconverter.database;

public class QuantitiesTable {
    static final String TABLE_QUANTITIES = "quantities";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_IMAGE = "image";
    public static final String COLUMN_FAVORITE = "favorite";

    static final String[] ALL_IDS = {COLUMN_ID};
    static final String[] ALL_COLUMNS =
            {COLUMN_ID, COLUMN_TITLE, COLUMN_IMAGE, COLUMN_FAVORITE};

    static final String SQL_CREATE =
            "CREATE TABLE " + TABLE_QUANTITIES + "(" +
                    COLUMN_ID + " TEXT PRIMARY KEY," +
                    COLUMN_TITLE + " INTEGER," +
                    COLUMN_IMAGE + " TEXT," +
                    COLUMN_FAVORITE + " INTEGER" + ");";
}