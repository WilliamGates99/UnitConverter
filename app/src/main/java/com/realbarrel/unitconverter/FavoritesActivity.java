package com.realbarrel.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import com.realbarrel.unitconverter.adapters.FavoritesAdapter;
import com.realbarrel.unitconverter.database.DataSource;
import com.realbarrel.unitconverter.models.DataItemQuantities;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class FavoritesActivity extends AppCompatActivity {

    private DataSource mDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        Toolbar toolbar = findViewById(R.id.toolbar_favorites);
        setSupportActionBar(toolbar);
        mDataSource = new DataSource(this);
        mDataSource.open();
        favoritesRecyclerViews();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onPause() {
        super.onPause();
        mDataSource.close();
    }

    @Override
    public void onResume() {
        super.onResume();
        mDataSource.open();
    }

    @Override
    public boolean onSupportNavigateUp() {
        MainActivity.BACK_FROM_CHILD_KEY = "favorites_fragment";
        return super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        MainActivity.BACK_FROM_CHILD_KEY = "favorites_fragment";
        super.onSupportNavigateUp();
    }


    private void favoritesRecyclerViews() {
        List<DataItemQuantities> dataItemQuantitiesList = mDataSource.getAllItems(false);

        Collections.sort(dataItemQuantitiesList, (o1, o2) ->
                getString(o1.getTitle()).compareTo(getString(o2.getTitle())));

        FavoritesAdapter favoritesAdapter = new FavoritesAdapter(this, dataItemQuantitiesList);
        RecyclerView favoritesRV = findViewById(R.id.rv_favorites);
        favoritesRV.setAdapter(favoritesAdapter);
    }
}