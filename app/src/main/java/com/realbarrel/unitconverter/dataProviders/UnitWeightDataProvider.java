package com.realbarrel.unitconverter.dataProviders;

import com.realbarrel.unitconverter.R;
import com.realbarrel.unitconverter.models.DataItemUnits;

import java.util.ArrayList;
import java.util.List;

public class UnitWeightDataProvider {

    public static List<DataItemUnits> dataItemUnitsList;

    static {
        dataItemUnitsList = new ArrayList<>();

        addItem(new DataItemUnits("unit_weight_kilogram", R.string.string_units_list_weight_kilogram, "[ kg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_gram", R.string.string_units_list_weight_gram, "[ g ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_milligram", R.string.string_units_list_weight_milligram, "[ mg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_ton_metric", R.string.string_units_list_weight_ton_metric, "[ t ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_pound", R.string.string_units_list_weight_pound, "[ lbs ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_ounce", R.string.string_units_list_weight_ounce, "[ oz ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_carat", R.string.string_units_list_weight_carat, "[ car, ct ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_ton_short", R.string.string_units_list_weight_ton_short, "[ ton (US) ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_ton_long", R.string.string_units_list_weight_ton_long, "[ ton (UK) ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_atomic_mass_unit", R.string.string_units_list_weight_atomic_mass_unit, "[ u ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_exagram", R.string.string_units_list_weight_exagram, "[ Eg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_petagram", R.string.string_units_list_weight_petagram, "[ Pg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_teragram", R.string.string_units_list_weight_teragram, "[ Tg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_gigagram", R.string.string_units_list_weight_gigagram, "[ Gg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_megagram", R.string.string_units_list_weight_megagram, "[ Mg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_hectogram", R.string.string_units_list_weight_hectogram, "[ hg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_dekagram", R.string.string_units_list_weight_dekagram, "[ dag ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_decigram", R.string.string_units_list_weight_decigram, "[ dg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_centigram", R.string.string_units_list_weight_centigram, "[ cg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_microgram", R.string.string_units_list_weight_microgram, "[ μg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_nanogram", R.string.string_units_list_weight_nanogram, "[ ng ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_picogram", R.string.string_units_list_weight_picogram, "[ pg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_femtogram", R.string.string_units_list_weight_femtogram, "[ fg ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_attogram", R.string.string_units_list_weight_attogram, "[ ag ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_dalton", R.string.string_units_list_weight_dalton, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_kilogram_force_square_second_meter", R.string.string_units_list_weight_kilogram_force_square_second_meter, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_kilopound", R.string.string_units_list_weight_kilopound, "[ kip ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_slug", R.string.string_units_list_weight_slug, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_pound_force_square_second_foot", R.string.string_units_list_weight_pound_force_square_second_foot, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_pound_troy_or_apothecary", R.string.string_units_list_weight_pound_troy_or_apothecary, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_poundal", R.string.string_units_list_weight_poundal, "[ pdl ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_ton_assay_us", R.string.string_units_list_weight_ton_assay_us, "[ AT (US) ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_ton_assay_uk", R.string.string_units_list_weight_ton_assay_uk, "[ AT (UK) ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_kiloton_metric", R.string.string_units_list_weight_kiloton_metric, "[ kt ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_quintal_metric", R.string.string_units_list_weight_quintal_metric, "[ cwt ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_hundredweight_us", R.string.string_units_list_weight_hundredweight_us, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_hundredweight_uk", R.string.string_units_list_weight_hundredweight_uk, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_quarter_us", R.string.string_units_list_weight_quarter_us, "[ qr (US) ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_quarter_uk", R.string.string_units_list_weight_quarter_uk, "[ qr (UK) ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_stone_us", R.string.string_units_list_weight_stone_us, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_stone_uk", R.string.string_units_list_weight_stone_uk, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_tonne", R.string.string_units_list_weight_tonne, "[ t ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_pennyweight", R.string.string_units_list_weight_pennyweight, "[ pwt ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_scruple_apothecary", R.string.string_units_list_weight_scruple_apothecary, "[ s, sp ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_grain", R.string.string_units_list_weight_grain, "[ gr ]", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_gamma", R.string.string_units_list_weight_gamma, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_talent_biblical_hebrew", R.string.string_units_list_weight_talent_biblical_hebrew, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_mina_biblical_hebrew", R.string.string_units_list_weight_mina_biblical_hebrew, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_shekel_biblical_hebrew", R.string.string_units_list_weight_shekel_biblical_hebrew, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_bekan_biblical_hebrew", R.string.string_units_list_weight_bekan_biblical_hebrew, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_gerah_biblical_hebrew", R.string.string_units_list_weight_gerah_biblical_hebrew, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_talent_biblical_greek", R.string.string_units_list_weight_talent_biblical_greek, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_mina_biblical_greek", R.string.string_units_list_weight_mina_biblical_greek, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_tetradrachma_biblical_greek", R.string.string_units_list_weight_tetradrachma_biblical_greek, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_didrachma_biblical_greek", R.string.string_units_list_weight_didrachma_biblical_greek, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_drachma_biblical_greek", R.string.string_units_list_weight_drachma_biblical_greek, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_denarius_biblical_roman", R.string.string_units_list_weight_denarius_biblical_roman, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_assarion_biblical_roman", R.string.string_units_list_weight_assarion_biblical_roman, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_quadrans_biblical_roman", R.string.string_units_list_weight_quadrans_biblical_roman, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_lepton_biblical_roman", R.string.string_units_list_weight_lepton_biblical_roman, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_planck_mass", R.string.string_units_list_weight_planck_mass, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_electron_mass_rest", R.string.string_units_list_weight_electron_mass_rest, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_muon_mass", R.string.string_units_list_weight_muon_mass, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_proton_mass", R.string.string_units_list_weight_proton_mass, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_neutron_mass", R.string.string_units_list_weight_neutron_mass, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_deuteron_mass", R.string.string_units_list_weight_deuteron_mass, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_earth_s_mass", R.string.string_units_list_weight_earth_s_mass, "", "quantities_weight", "ic_quantities_weight.png"));
        addItem(new DataItemUnits("unit_weight_sun_s_mass", R.string.string_units_list_weight_sun_s_mass, "", "quantities_weight", "ic_quantities_weight.png"));
    }

    private static void addItem(DataItemUnits item) {
        dataItemUnitsList.add(item);
    }
}