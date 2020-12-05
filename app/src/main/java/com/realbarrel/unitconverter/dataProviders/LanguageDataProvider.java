package com.realbarrel.unitconverter.dataProviders;

import com.realbarrel.unitconverter.R;
import com.realbarrel.unitconverter.models.DataItemMore;

import java.util.ArrayList;
import java.util.List;

public class LanguageDataProvider {

    public static List<DataItemMore> dataItemMoreList;

    static {
        dataItemMoreList = new ArrayList<>();

        addItem(new DataItemMore("language_english", R.string.string_language_list_english));
        addItem(new DataItemMore("language_persian", R.string.string_language_list_persian));
    }

    private static void addItem(DataItemMore item) {
        dataItemMoreList.add(item);
    }
}