package com.realbarrel.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import com.realbarrel.unitconverter.adapters.QuantitiesAdapter;
import com.realbarrel.unitconverter.adapters.UnitsAdapter;
import com.realbarrel.unitconverter.dataProviders.UnitAreaDataProvider;
import com.realbarrel.unitconverter.dataProviders.UnitLengthDataProvider;
import com.realbarrel.unitconverter.dataProviders.UnitTemperatureDataProvider;
import com.realbarrel.unitconverter.dataProviders.UnitWeightDataProvider;
import com.realbarrel.unitconverter.models.DataItemQuantities;
import com.realbarrel.unitconverter.models.DataItemUnits;

import java.util.List;
import java.util.Objects;

public class UnitsActivity extends AppCompatActivity {

    public DataItemQuantities itemQuantities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);
        Toolbar toolbar = findViewById(R.id.toolbar_units);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        itemQuantities = Objects.requireNonNull(getIntent().getExtras()).
                getParcelable(QuantitiesAdapter.ITEM_KEY);

        if (itemQuantities == null) {
            throw new AssertionError("Null data item received!");
        } else {
            unitsRecyclerViews();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return false;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void unitsRecyclerViews() {
        RecyclerView unitsRV = findViewById(R.id.rv_units);

        //todo Update after adding a quantity
        switch (itemQuantities.getId()) {
            case "quantities_length":
                List<DataItemUnits> dataItemUnitLengthList = UnitLengthDataProvider.dataItemUnitsList;
                UnitsAdapter unitsAdapter = new UnitsAdapter(this, dataItemUnitLengthList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_area":
                List<DataItemUnits> dataItemUnitAreaList = UnitAreaDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitAreaList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_weight":
                List<DataItemUnits> dataItemUnitWeightList = UnitWeightDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitWeightList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_volume":
                break;
            case "quantities_temperature":
                List<DataItemUnits> dataItemUnitTemperatureList = UnitTemperatureDataProvider.dataItemUnitsList;
                unitsAdapter = new UnitsAdapter(this, dataItemUnitTemperatureList, itemQuantities);
                unitsRV.setAdapter(unitsAdapter);
                break;
            case "quantities_time":
                break;
            case "quantities_speed":
                break;
            case "quantities_digital":
                break;
            case "quantities_age":
                break;
            case "quantities_binary":
                break;
            case "quantities_angle":
                break;
            case "quantities_pressure":
                break;
            case "quantities_voltage":
                break;
            case "quantities_current":
                break;
            case "quantities_power":
                break;
            case "quantities_flow":
                break;
            case "quantities_frequency":
                break;
            case "quantities_illuminance":
                break;
            case "quantities_energy":
                break;
            case "quantities_storage":
                break;
            case "quantities_force":
                break;
            case "quantities_sound":
                break;
            case "quantities_resistance":
                break;
            case "quantities_luminance":
                break;
            case "quantities_capacitance":
                break;
            case "quantities_surface_tension":
                break;
            case "quantities_density":
                break;
            case "quantities_torque":
                break;
        }
    }
}