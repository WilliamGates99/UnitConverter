package com.realbarrel.unitconverter.dataProviders;

import com.realbarrel.unitconverter.R;
import com.realbarrel.unitconverter.models.DataItemMore;

import java.util.ArrayList;
import java.util.List;

public class MoreSupportDataProvider {

    public static List<DataItemMore> dataItemMoreList;

    static {
        dataItemMoreList = new ArrayList<>();

//        addItem(new DataItemMore("support_donate", R.string.string_more_list_support_donate));
        addItem(new DataItemMore("support_rate", R.string.string_more_list_support_rate));
        addItem(new DataItemMore("support_feedback", R.string.string_more_list_support_feedback));
        addItem(new DataItemMore("support_invite", R.string.string_more_list_support_invite));
    }

    private static void addItem(DataItemMore item) {
        dataItemMoreList.add(item);
    }
}