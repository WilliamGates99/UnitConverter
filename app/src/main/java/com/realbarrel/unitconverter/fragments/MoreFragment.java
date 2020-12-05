package com.realbarrel.unitconverter.fragments;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.realbarrel.unitconverter.R;
import com.realbarrel.unitconverter.adapters.MoreAdapter;
import com.realbarrel.unitconverter.dataProviders.MoreAboutDataProvider;
import com.realbarrel.unitconverter.dataProviders.MoreSupportDataProvider;
import com.realbarrel.unitconverter.models.DataItemMore;

import java.util.List;

public class MoreFragment extends Fragment {

    private View view;
    private Context context;

    private final List<DataItemMore> dataItemMoreSupportList = MoreSupportDataProvider.dataItemMoreList;
    private final List<DataItemMore> dataItemMoreAboutList = MoreAboutDataProvider.dataItemMoreList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_more, container, false);
        context = view.getContext();
        moreRecyclerViews();
        languageOnClick();
        nightSwitchOnChecked();

        return view;
    }

    private void moreRecyclerViews() {
        MoreAdapter supportAdapter = new MoreAdapter(context, dataItemMoreSupportList);
        MoreAdapter aboutAdapter = new MoreAdapter(context, dataItemMoreAboutList);

        RecyclerView supportRV = view.findViewById(R.id.rv_more_support);
        RecyclerView aboutRV = view.findViewById(R.id.rv_more_about);

        supportRV.setAdapter(supportAdapter);
        aboutRV.setAdapter(aboutAdapter);
    }

    private void languageOnClick() {
//        TextView languageTV = view.findViewById(R.id.tv_more_settings_language);
//        languageTV.setOnClickListener(v ->
//                startActivity(new Intent(context, LanguageActivity.class)));
    }

    private void nightSwitchOnChecked() {
//        SwitchCompat nightSwitch = view.findViewById(R.id.switch_more_settings_night);
//        nightSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
//            if (isChecked) {
//                Toast.makeText(context, "Checked", Toast.LENGTH_SHORT).show();
//            } else {
//                Toast.makeText(context, "Unchecked", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}