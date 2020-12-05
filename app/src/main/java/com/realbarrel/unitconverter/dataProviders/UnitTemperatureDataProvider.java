package com.realbarrel.unitconverter.dataProviders;

import com.realbarrel.unitconverter.R;
import com.realbarrel.unitconverter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitTemperatureDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_temperature_celsius", R.string.string_units_list_temperature_celsius, "[ °C ]", "quantities_temperature", "ic_quantities_temperature.png"));
        addItem(new DataItemUnits("unit_temperature_fahrenheit", R.string.string_units_list_temperature_fahrenheit, "[ °F ]", "quantities_temperature", "ic_quantities_temperature.png"));
        addItem(new DataItemUnits("unit_temperature_kelvin", R.string.string_units_list_temperature_kelvin, "[ °K ]", "quantities_temperature", "ic_quantities_temperature.png"));
        addItem(new DataItemUnits("unit_temperature_rankine", R.string.string_units_list_temperature_rankine, "[ °R ]", "quantities_temperature", "ic_quantities_temperature.png"));
        addItem(new DataItemUnits("unit_temperature_newton", R.string.string_units_list_temperature_newton, "[ °N ]", "quantities_temperature", "ic_quantities_temperature.png"));
        addItem(new DataItemUnits("unit_temperature_reaumur", R.string.string_units_list_temperature_reaumur, "[ °Ré ]", "quantities_temperature", "ic_quantities_temperature.png"));
        addItem(new DataItemUnits("unit_temperature_romer", R.string.string_units_list_temperature_romer, "[ °Rø ]", "quantities_temperature", "ic_quantities_temperature.png"));
        addItem(new DataItemUnits("unit_temperature_delisle", R.string.string_units_list_temperature_delisle, "[ °De ]", "quantities_temperature", "ic_quantities_temperature.png"));
    }

    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}