package com.realbarrel.unitconverter.dataProviders;

import com.realbarrel.unitconverter.R;
import com.realbarrel.unitconverter.models.DataItemMore;

import java.util.ArrayList;
import java.util.List;

public class MoreAboutDataProvider {

    public static List<DataItemMore> dataItemMoreList;

    static {
        dataItemMoreList = new ArrayList<>();

        addItem(new DataItemMore("about_disclaimer", R.string.string_more_list_about_disclaimer));
        addItem(new DataItemMore("about_twitter", R.string.string_more_list_about_twitter));
        addItem(new DataItemMore("about_instagram", R.string.string_more_list_about_instagram));
        addItem(new DataItemMore("about_telegram", R.string.string_more_list_about_telegram));
    }

    private static void addItem(DataItemMore item) {
        dataItemMoreList.add(item);
    }
}