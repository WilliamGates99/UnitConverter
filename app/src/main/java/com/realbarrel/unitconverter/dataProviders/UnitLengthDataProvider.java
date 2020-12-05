package com.realbarrel.unitconverter.dataProviders;

import com.realbarrel.unitconverter.R;
import com.realbarrel.unitconverter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitLengthDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_length_meter", R.string.string_units_list_length_meter, "[ m ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_kilometer", R.string.string_units_list_length_kilometer, "[ km ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_decimeter", R.string.string_units_list_length_decimeter, "[ dm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_centimeter", R.string.string_units_list_length_centimeter, "[ cm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_millimeter", R.string.string_units_list_length_millimeter, "[ mm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_micrometer", R.string.string_units_list_length_micrometer, "[ μm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_nanometer", R.string.string_units_list_length_nanometer, "[ nm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_mile", R.string.string_units_list_length_mile, "[ mi, mi(int) ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_yard", R.string.string_units_list_length_yard, "[ yd ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_foot", R.string.string_units_list_length_foot, "[ ft ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_inch", R.string.string_units_list_length_inch, "[ in ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_year", R.string.string_units_list_length_light_year, "[ ly ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_exameter", R.string.string_units_list_length_exameter, "[ Em ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_petameter", R.string.string_units_list_length_petameter, "[ Pm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_terameter", R.string.string_units_list_length_terameter, "[ Tm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_gigameter", R.string.string_units_list_length_gigameter, "[ Gm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_megameter", R.string.string_units_list_length_megameter, "[ Mm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_hectometer", R.string.string_units_list_length_hectometer, "[ hm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_dekameter", R.string.string_units_list_length_dekameter, "[ dam ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_micron", R.string.string_units_list_length_micron, "[ μ ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_picometer", R.string.string_units_list_length_picometer, "[ pm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_femtometer", R.string.string_units_list_length_femtometer, "[ fm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_attometer", R.string.string_units_list_length_attometer, "[ am ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_megaparsec", R.string.string_units_list_length_megaparsec, "[ Mpc ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_kiloparsec", R.string.string_units_list_length_kiloparsec, "[ kpc ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_parsec", R.string.string_units_list_length_parsec, "[ pc ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_astronomical_unit", R.string.string_units_list_length_astronomical_unit, "[ AU, UA ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_league", R.string.string_units_list_length_league, "[ lea ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_nautical_league_uk", R.string.string_units_list_length_nautical_league_uk, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_nautical_league_int", R.string.string_units_list_length_nautical_league_int, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_league_statute", R.string.string_units_list_length_league_statute, "[ st.league ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_nautical_mile_uk", R.string.string_units_list_length_nautical_mile_uk, "[ NM (UK) ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_nautical_mile_international", R.string.string_units_list_length_nautical_mile_international, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_mile_statute", R.string.string_units_list_length_mile_statute, "[ mi, mi (US) ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_mile_us_survey", R.string.string_units_list_length_mile_us_survey, "[ mi ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_mile_roman", R.string.string_units_list_length_mile_roman, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_kiloyard", R.string.string_units_list_length_kiloyard, "[ kyd ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_furlong", R.string.string_units_list_length_furlong, "[ fur ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_furlong_us_survey", R.string.string_units_list_length_furlong_us_survey, "[ fur ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_chain_us_survey", R.string.string_units_list_length_chain_us_survey, "[ ch ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_rope", R.string.string_units_list_length_rope, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_rod", R.string.string_units_list_length_rod, "[ rd ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_rod_us_survey", R.string.string_units_list_length_rod_us_survey, "[ rd ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_perch", R.string.string_units_list_length_perch, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_pole", R.string.string_units_list_length_pole, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_fathom", R.string.string_units_list_length_fathom, "[ fath ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_fathom_us_survey", R.string.string_units_list_length_fathom_us_survey, "[ fath ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_ell", R.string.string_units_list_length_ell, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_foot_us_survey", R.string.string_units_list_length_foot_us_survey, "[ ft ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_link", R.string.string_units_list_length_link, "[ li ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_link_us_survey", R.string.string_units_list_length_link_us_survey, "[ li ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_cubit_uk", R.string.string_units_list_length_cubit_uk, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_hand", R.string.string_units_list_length_hand, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_span_cloth", R.string.string_units_list_length_span_cloth, "[ Pm ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_finger_cloth", R.string.string_units_list_length_finger_cloth, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_Nail_cloth", R.string.string_units_list_length_nail_cloth, " Pm ", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_inch_us_survey", R.string.string_units_list_length_inch_us_survey, "[ in ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_barleycorn", R.string.string_units_list_length_barleycorn, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_mil", R.string.string_units_list_length_mil, "[ mil, thou ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_microinch", R.string.string_units_list_length_microinch, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_angstrom", R.string.string_units_list_length_angstrom, "[ A ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_au_of_length", R.string.string_units_list_length_au_of_length, "[ a.u., b ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_x_unit", R.string.string_units_list_length_x_unit, "[ X ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_fermi", R.string.string_units_list_length_fermi, "[ F, f ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_arpent", R.string.string_units_list_length_arpent, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_pica", R.string.string_units_list_length_pica, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_point", R.string.string_units_list_length_point, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_twip", R.string.string_units_list_length_twip, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_aln", R.string.string_units_list_length_aln, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_famn", R.string.string_units_list_length_famn, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_caliber", R.string.string_units_list_length_caliber, "[ cl ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_centiinch", R.string.string_units_list_length_centiinch, "[ cin ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_ken", R.string.string_units_list_length_ken, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_russian_archin", R.string.string_units_list_length_russian_archin, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_roman_actus", R.string.string_units_list_length_roman_actus, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_vara_de_tarea", R.string.string_units_list_length_vara_de_tarea, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_vara_conuquera", R.string.string_units_list_length_vara_conuquera, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_vara_castellana", R.string.string_units_list_length_vara_castellana, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_ubit_greek", R.string.string_units_list_length_cubit_greek, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_long_reed", R.string.string_units_list_length_long_reed, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_reed", R.string.string_units_list_length_reed, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_long_cubit", R.string.string_units_list_length_long_cubit, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_handbreadth", R.string.string_units_list_length_handbreadth, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_fingerbreadth", R.string.string_units_list_length_fingerbreadth, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_planck_length", R.string.string_units_list_length_planck_length, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_electron_radius_classical", R.string.string_units_list_length_electron_radius_classical, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_bohr_radius", R.string.string_units_list_length_bohr_radius, "[ b, a.u. ]", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_earth_s_equatorial_radius", R.string.string_units_list_length_earth_s_equatorial_radius, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_earth_s_polar_radius", R.string.string_units_list_length_earth_s_polar_radius, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_earth_s_distance_from_sun", R.string.string_units_list_length_earth_s_distance_from_sun, "", "quantities_length", "ic_quantities_length.png"));
        addItem(new DataItemUnits("unit_length_sun_s_radius", R.string.string_units_list_length_sun_s_radius, "", "quantities_length", "ic_quantities_length.png"));
    }

    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}