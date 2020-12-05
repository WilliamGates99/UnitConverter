package com.realbarrel.unitconverter.dataProviders;

import com.realbarrel.unitconverter.R;
import com.realbarrel.unitconverter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitAreaDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_area_square_meter", R.string.string_units_list_area_square_meter, "[ m^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_kilometer", R.string.string_units_list_area_square_kilometer, "[ km^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_centimeter", R.string.string_units_list_area_square_centimeter, "[ cm^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_millimeter", R.string.string_units_list_area_square_millimeter, "[ mm^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_micrometer", R.string.string_units_list_area_square_micrometer, "[ μm^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_hectare", R.string.string_units_list_area_hectare, "[ ha ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_acre", R.string.string_units_list_area_acre, "[ ac ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_mile", R.string.string_units_list_area_square_mile, "[ mi^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_yard", R.string.string_units_list_area_square_yard, "[ yd^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_foot", R.string.string_units_list_area_square_foot, "[ ft^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_inch", R.string.string_units_list_area_square_inch, "[ in^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_hectometer", R.string.string_units_list_area_square_hectometer, "[ hm^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_dekameter", R.string.string_units_list_area_square_dekameter, "[ dam^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_decimeter", R.string.string_units_list_area_square_decimeter, "[ dm^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_nanometer", R.string.string_units_list_area_square_nanometer, "[ nm^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_are", R.string.string_units_list_area_are, "[ a ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_barn", R.string.string_units_list_area_barn, "[ b ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_mile_us_survey", R.string.string_units_list_area_square_mile_us_survey, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_foot_us_survey", R.string.string_units_list_area_square_foot_us_survey, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_circular_inch", R.string.string_units_list_area_circular_inch, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_township", R.string.string_units_list_area_township, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_section", R.string.string_units_list_area_section, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_acre_us_survey", R.string.string_units_list_area_acre_us_survey, "[ ac ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_rood", R.string.string_units_list_area_rood, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_chain", R.string.string_units_list_area_square_chain, "[ ch^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_rod", R.string.string_units_list_area_square_rod, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_rod_us_survey", R.string.string_units_list_area_square_rod_us_survey, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_perch", R.string.string_units_list_area_square_perch, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_pole", R.string.string_units_list_area_square_pole, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_square_mil", R.string.string_units_list_area_square_mil, "[ mil^2 ]", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_circular_mil", R.string.string_units_list_area_circular_mil, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_homestead", R.string.string_units_list_area_homestead, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_sabin", R.string.string_units_list_area_sabin, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_arpent", R.string.string_units_list_area_arpent, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_cuerda", R.string.string_units_list_area_cuerda, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_plaza", R.string.string_units_list_area_plaza, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_varas_castellanas_cuad", R.string.string_units_list_area_varas_castellanas_cuad, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_varas_conuqueras_cuad", R.string.string_units_list_area_varas_conuqueras_cuad, "", "quantities_area", "ic_quantities_area.png"));
        addItem(new DataItemUnits("unit_area_electron_cross_section", R.string.string_units_list_area_electron_cross_section, "", "quantities_area", "ic_quantities_area.png"));
    }

    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}