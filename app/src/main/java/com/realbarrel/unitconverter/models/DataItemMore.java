package com.realbarrel.unitconverter.models;

import androidx.annotation.NonNull;

public class DataItemMore {

    private String id;
    private int title;

    public DataItemMore() {
    }

    public DataItemMore(String id, int title) {
        this.id = id;
        this.title = title;
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

    @NonNull
    @Override
    public String toString() {
        return "ItemMore{" +
                "id='" + id + '\'' +
                ", title=" + title +
                '}';
    }
}