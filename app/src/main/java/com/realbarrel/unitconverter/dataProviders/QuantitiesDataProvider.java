package com.realbarrel.unitconverter.dataProviders;

import com.realbarrel.unitconverter.R;
import com.realbarrel.unitconverter.models.DataItemQuantities;

import java.util.ArrayList;
import java.util.List;

public class QuantitiesDataProvider {

    public static List<DataItemQuantities> dataItemQuantitiesList;

    static {
        dataItemQuantitiesList = new ArrayList<>();

        addItem(new DataItemQuantities("quantities_length", R.string.string_quantities_list_length, "ic_quantities_length.png", false));
        addItem(new DataItemQuantities("quantities_area", R.string.string_quantities_list_area, "ic_quantities_area.png", false));
//        addItem(new DataItemQuantities("quantities_weight", R.string.string_quantities_list_weight, "ic_quantities_weight.png", false));
//        addItem(new DataItemQuantities("quantities_volume", R.string.string_quantities_list_volume, "ic_quantities_volume.png", false));
        addItem(new DataItemQuantities("quantities_temperature", R.string.string_quantities_list_temperature, "ic_quantities_temperature.png", false));
//        addItem(new DataItemQuantities("quantities_time", R.string.string_quantities_list_time, "ic_quantities_time.png", false));
//        addItem(new DataItemQuantities("quantities_speed", R.string.string_quantities_list_speed, "ic_quantities_speed.png", false));
//        addItem(new DataItemQuantities("quantities_digital", R.string.string_quantities_list_digital, "ic_quantities_digital.png", false));
//        addItem(new DataItemQuantities("quantities_age", R.string.string_quantities_list_age, "ic_quantities_age.png", false));
//        addItem(new DataItemQuantities("quantities_binary", R.string.string_quantities_list_binary, "ic_quantities_binary.png", false));
//        addItem(new DataItemQuantities("quantities_angle", R.string.string_quantities_list_angle, "ic_quantities_angle.png", false));
//        addItem(new DataItemQuantities("quantities_pressure", R.string.string_quantities_list_pressure, "ic_quantities_pressure.png", false));
//        addItem(new DataItemQuantities("quantities_voltage", R.string.string_quantities_list_voltage, "ic_quantities_voltage.png", false));
//        addItem(new DataItemQuantities("quantities_current", R.string.string_quantities_list_current, "ic_quantities_current.png", false));
//        addItem(new DataItemQuantities("quantities_power", R.string.string_quantities_list_power, "ic_quantities_power.png", false));
//        addItem(new DataItemQuantities("quantities_flow", R.string.string_quantities_list_flow, "ic_quantities_flow.png", false));
//        addItem(new DataItemQuantities("quantities_frequency", R.string.string_quantities_list_frequency, "ic_quantities_frequency.png", false));
//        addItem(new DataItemQuantities("quantities_illuminance", R.string.string_quantities_list_illuminance, "ic_quantities_illuminance.png", false));
//        addItem(new DataItemQuantities("quantities_energy", R.string.string_quantities_list_energy, "ic_quantities_energy.png", false));
//        addItem(new DataItemQuantities("quantities_storage", R.string.string_quantities_list_storage, "ic_quantities_storage.png", false));
//        addItem(new DataItemQuantities("quantities_force", R.string.string_quantities_list_force, "ic_quantities_force.png", false));
//        addItem(new DataItemQuantities("quantities_sound", R.string.string_quantities_list_sound, "ic_quantities_sound.png", false));
//        addItem(new DataItemQuantities("quantities_resistance", R.string.string_quantities_list_resistance, "ic_quantities_resistance.png", false));
//        addItem(new DataItemQuantities("quantities_luminance", R.string.string_quantities_list_luminance, "ic_quantities_luminance.png", false));
//        addItem(new DataItemQuantities("quantities_capacitance", R.string.string_quantities_list_capacitance, "ic_quantities_capacitance.png", false));
//        addItem(new DataItemQuantities("quantities_surface_tension", R.string.string_quantities_list_surface_tension, "ic_quantities_surface_tension.png", false));
//        addItem(new DataItemQuantities("quantities_density", R.string.string_quantities_list_density, "ic_quantities_density.png", false));
//        addItem(new DataItemQuantities("quantities_torque", R.string.string_quantities_list_torque, "ic_quantities_torque.png", false));
    }

    private static void addItem(DataItemQuantities item) {
        dataItemQuantitiesList.add(item);
    }
}