package com.realbarrel.unitconverter.models;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

import com.realbarrel.unitconverter.database.QuantitiesTable;

public class DataItemQuantities implements Parcelable {

    private String id;
    private int title;
    private String image;
    private boolean favorite;

    public DataItemQuantities() {
    }

    public DataItemQuantities(String id, int title, String image, boolean favorite) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.favorite = favorite;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public ContentValues toValues() {
        ContentValues values = new ContentValues(4);

        values.put(QuantitiesTable.COLUMN_ID, id);
        values.put(QuantitiesTable.COLUMN_TITLE, title);
        values.put(QuantitiesTable.COLUMN_IMAGE, image);
        values.put(QuantitiesTable.COLUMN_FAVORITE, favorite);

        return values;
    }

    @NonNull
    @Override
    public String toString() {
        return "DataItemUnits{" +
                "id='" + id + '\'' +
                ", title=" + title +
                ", image='" + image + '\'' +
                ", favorite=" + favorite +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeInt(this.title);
        dest.writeString(this.image);
        dest.writeByte(this.favorite ? (byte) 1 : (byte) 0);
    }

    private DataItemQuantities(Parcel in) {
        this.id = in.readString();
        this.title = in.readInt();
        this.image = in.readString();
        this.favorite = in.readByte() != 0;
    }

    public static final Creator<DataItemQuantities> CREATOR = new Creator<DataItemQuantities>() {
        @Override
        public DataItemQuantities createFromParcel(Parcel source) {
            return new DataItemQuantities(source);
        }

        @Override
        public DataItemQuantities[] newArray(int size) {
            return new DataItemQuantities[size];
        }
    };
}