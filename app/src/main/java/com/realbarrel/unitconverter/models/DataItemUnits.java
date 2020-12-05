package com.realbarrel.unitconverter.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

import java.util.UUID;

public class DataItemUnits implements Parcelable {

    private String id;
    private int title;
    private String symbol;
    private String category;
    private String image;

    public DataItemUnits() {
    }

    public DataItemUnits(String id, int title, String symbol, String category, String image) {

        if (id == null) {
            id = UUID.randomUUID().toString();
        }

        this.id = id;
        this.title = title;
        this.symbol = symbol;
        this.category = category;
        this.image = image;
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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @NonNull
    @Override
    public String toString() {
        return "DataItemUnits{" +
                "id='" + id + '\'' +
                ", title=" + title +
                ", symbol='" + symbol + '\'' +
                ", category='" + category + '\'' +
                ", image='" + image + '\'' +
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
        dest.writeString(this.symbol);
        dest.writeString(this.category);
        dest.writeString(this.image);
    }

    private DataItemUnits(Parcel in) {
        this.id = in.readString();
        this.title = in.readInt();
        this.symbol = in.readString();
        this.category = in.readString();
        this.image = in.readString();
    }

    public static final Parcelable.Creator<DataItemUnits> CREATOR = new Parcelable.Creator<DataItemUnits>() {
        @Override
        public DataItemUnits createFromParcel(Parcel source) {
            return new DataItemUnits(source);
        }

        @Override
        public DataItemUnits[] newArray(int size) {
            return new DataItemUnits[size];
        }
    };
}