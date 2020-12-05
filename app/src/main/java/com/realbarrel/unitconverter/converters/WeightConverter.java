package com.realbarrel.unitconverter.converters;

import android.content.Context;
import android.widget.TextView;

import com.realbarrel.unitconverter.R;

public class WeightConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public WeightConverter(Context context, String fromUnit, String toUnit, double fromValue,
                           double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(fromUnit)) {
            weightKilogram();
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(fromUnit)) {
            weightGram();
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(fromUnit)) {
            weightMilligram();
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(fromUnit)) {
            weightTonMetric();
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(fromUnit)) {
            weightPound();
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(fromUnit)) {
            weightOunce();
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(fromUnit)) {
            weightCarat();
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(fromUnit)) {
            weightTonShort();
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(fromUnit)) {
            weightTonLong();
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(fromUnit)) {
            weightAtomicMassUnit();
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(fromUnit)) {
            weightExagram();
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(fromUnit)) {
            weightPetagram();
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(fromUnit)) {
            weightTeragram();
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(fromUnit)) {
            weightGigagram();
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(fromUnit)) {
            weightMegagram();
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(fromUnit)) {
            weightHectogram();
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(fromUnit)) {
            weightDekagram();
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(fromUnit)) {
            weightDecigram();
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(fromUnit)) {
            weightCentigram();
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(fromUnit)) {
            weightMicrogram();
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(fromUnit)) {
            weightNanogram();
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(fromUnit)) {
            weightPicogram();
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(fromUnit)) {
            weightFemtogram();
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(fromUnit)) {
            weightAttogram();
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(fromUnit)) {
            weightDalton();
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(fromUnit)) {
            weightKilogramForceSquareSecondMeter();
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(fromUnit)) {
            weightKilopound();
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(fromUnit)) {
            weightSlug();
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(fromUnit)) {
            weightPoundForceSquareSecondFoot();
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(fromUnit)) {
            weightPoundTroyOrApothecary();
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(fromUnit)) {
            weightPoundal();
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(fromUnit)) {
            weightTonAssayUS();
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(fromUnit)) {
            weightTonAssayUK();
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(fromUnit)) {
            weightKilotonMetric();
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(fromUnit)) {
            weightQuintalMetric();
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(fromUnit)) {
            weightHundredweightUS();
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(fromUnit)) {
            weightHundredweightUK();
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(fromUnit)) {
            weightQuarterUS();
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(fromUnit)) {
            weightQuarterUK();
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(fromUnit)) {
            weightStoneUS();
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(fromUnit)) {
            weightStoneUK();
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(fromUnit)) {
            weightTonne();
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(fromUnit)) {
            weightPennyweight();
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(fromUnit)) {
            weightScrupleApothecary();
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(fromUnit)) {
            weightGrain();
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(fromUnit)) {
            weightGamma();
        }
//        else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(fromUnit)) {
//            weightTalentBiblicalHebrew();
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(fromUnit)) {
//            weightMinaBiblicalHebrew();
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(fromUnit)) {
//            weightShekelBiblicalHebrew();
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(fromUnit)) {
//            weightBekanBiblicalHebrew();
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(fromUnit)) {
//            weightGerahBiblicalHebrew();
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(fromUnit)) {
//            weightTalentBiblicalGreek();
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(fromUnit)) {
//            weightMinaBiblicalGreek();
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(fromUnit)) {
//            weightTetradrachmaBiblicalGreek();
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(fromUnit)) {
//            weightDidrachmaBiblicalGreek();
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(fromUnit)) {
//            weightDrachmaBiblicalGreek();
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(fromUnit)) {
//            weightDenariusBiblicalRoman();
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(fromUnit)) {
//            weightAssarionBiblicalRoman();
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(fromUnit)) {
//            weightQuadransBiblicalRoman();
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(fromUnit)) {
//            weightLeptonBiblicalRoman();
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(fromUnit)) {
//            weightPlanckMass();
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(fromUnit)) {
//            weightElectronMassRest();
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(fromUnit)) {
//            weightMuonMass();
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(fromUnit)) {
//            weightProtonMass();
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(fromUnit)) {
//            weightNeutronMass();
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(fromUnit)) {
//            weightDeuteronMass();
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(fromUnit)) {
//            weightEarthsMass();
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(fromUnit)) {
//            weightSunsMass();
//        }
    }

    private void weightKilogram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35.2739619496d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.0011023113d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.0009842065d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 0.1019716213d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 0.0022046226d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 0.0685217659d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 0.0685217659d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2.6792288807d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 70.9888484236d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 34.2857103673d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 30.612244898d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.0220462262d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.0196841306d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 0.0881849049d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 0.0787365222d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 0.1763698097d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 0.1574730444d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 643.0149313708d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 771.617917645d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 15432.3583529d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0292397661d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 87.7192982456d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 175.4385964912d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1754.3859649123d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0490196078d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764706d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 73.5294117647d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 147.0588235294d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 294.1176470588d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 259.7402597403d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4155.8441558442d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 16623.376623377d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 33246.753246753d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 45940892.447777d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+30d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-31d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightGram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0022046226d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 0.0352739619d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 0.0001019716d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 6.85218E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 6.85218E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.0026792289d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 0.0709888484d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 0.0342857104d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 0.0306122449d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 2.20462E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 1.96841E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 8.81849E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 7.87365E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 0.0001763698d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 0.000157473d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 0.6430149314d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.7716179176d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 15.4323583529d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.92398E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.001754386d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0877192982d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.1754385965d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.90196E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0029411765d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0735294118d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.1470588235d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.2941176471d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.2597402597d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4.1558441558d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 16.6233766234d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 33.2467532468d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 45940.892447777d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-34d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightMilligram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 3.5274E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 0.005d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+20d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+20d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 6.85217658568E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 6.8521765856792E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2.679228880719E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 7.09888E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 3.42857E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 3.06122E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 1.9684130552221E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 8.8184904873951E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 7.8736522208885E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 1.763698097479E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 1.5747304441777E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 0.0006430149d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.0007716179d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 0.0154323584d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9239766081871E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 8.77193E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0001754386d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.001754386d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.9019607843137E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 7.35294E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0001470588d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0002941176d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.0002597403d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.0041558442d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.0166233766d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.0332467532d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 45.9408924478d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+20d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+20d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+20d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-31d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-37d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightTonMetric() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2204.6226218488d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35273.96194958d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.9842065276d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 101.9716212978d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 68.5217658568d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 68.5217658568d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2679.228880719d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 70988.8484236d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 34285.710367347d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 30612.24489796d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 22.0462262185d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 19.6841305522d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 88.184904874d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 78.7365222089d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 176.3698097479d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 157.4730444178d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 643014.93137083d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 771617.917645d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 15432358.3529d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 29.2397660819d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1754.3859649123d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 87719.298245614d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 175438.59649123d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1754385.9649123d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 49.0196078431d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2941.1764705882d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 73529.411764706d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 147058.82352941d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 294117.64705882d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 259740.25974026d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4155844.1558442d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 16623376.623377d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 33246753.246753d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 45940892447.777d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+33d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+30d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-22d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-28d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightPound() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.45359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 453.59237d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 453592.37d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0004535924d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 16d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 2267.96185d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.0005d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.0004464286d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 2.7315952362972E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.0004535924d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 4.5359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 45.359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 4535.9237d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 45359.237d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 453592370d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 453592370000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E+20d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 2.7316120154387E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 0.0462535494d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 0.0310809502d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 0.0310809502d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 1.2152777778d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 32.2d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 15.5517366227d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 13.8854807143d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.0045359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.0089285714d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 0.04d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 0.0357142857d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 0.08d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 0.0714285714d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.0004535924d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 291.6666666659d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 349.9999999991d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 6999.9999999812d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 453592370d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0132629348d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.7957760877d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 39.788804386d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 79.5776087719d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 795.7760877193d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0222349201d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1.3340952059d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 33.3523801471d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 66.7047602941d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 133.4095205882d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 117.8162d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1885.0592d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 7540.2368d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 15080.4736d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 20838438.285302d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 4.9793936250197E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 2.4082001337168E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 2.7118624034309E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 2.7081295883299E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 1.3566044659835E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 7.5902337684067E-26d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 2.26796185E-31d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightOunce() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.0283495231d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 28.349523125d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 28349.523125d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 2.83495E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0625d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 141.747615625d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 3.125E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 2.79018E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 1.7072470226858E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 2.8349523125E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 2.8349523125E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 2.8349523125E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 2.8349523125E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 2.83495E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.2834952313d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 2.8349523125d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 283.49523125d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 2834.9523125d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 28349523.125d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 28349523125d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 28349523125000d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 2.8349523125E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 2.8349523125E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 1.7072575096492E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 0.0028908468d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 6.25E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 0.0019425594d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 0.0019425594d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.0759548611d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 2.0125d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 0.9719835389d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 0.8678425446d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 2.8349523125E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.0002834952d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.000625d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.0005580357d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 0.0025d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 0.0022321429d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 0.005d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 0.0044642857d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 2.83495E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 18.2291666666d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 21.8749999999d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 437.4999999988d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 28349523.125d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0008289334d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0497360055d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.4868002741d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 4.9736005482d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 49.7360054825d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0013896825d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0833809504d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.0845237592d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.1690475184d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 8.3380950368d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 7.3635125d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 117.8162d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 471.2648d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 942.5296d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 1302402.3928314d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 3.1121210156373E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 1.505125083573E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 1.6949140021443E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 1.6925809927062E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 8.4787779123972E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 4.7438961052542E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.41747615625E-32d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightCarat() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.0002d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 0.2d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 200d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 2.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0004409245d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 0.0070547924d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 1.9684130552221E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 1.204427330335E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 2.0E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 2.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 2.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 2.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 2.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.002d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 0.02d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 2d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 20d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 200000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 200000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 200000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 2.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 2.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 1.20443472867E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 2.03943E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 4.4092452436976E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 1.37044E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 1.37044E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.0005358458d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 0.0141977697d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 0.0068571421d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 0.006122449d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 2.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 2.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 4.4092452436976E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 3.9368261104442E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 1.7637E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 1.57473E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 3.5274E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 3.14946E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 2.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 0.1286029863d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.1543235835d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 3.0864716706d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 200000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 5.8479532163743E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0003508772d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0175438596d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0350877193d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.350877193d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 9.8039215686275E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0005882353d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0147058824d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0294117647d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0588235294d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.0519480519d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.8311688312d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3.3246753247d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 6.6493506494d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 9188.1784895554d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 2.1955367657616E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 1.0618344985463E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 1.195726640389E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 1.194080750666E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9816017892168E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 3.34672021419E-29d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.0E-34d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightTonShort() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 907.18474d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 907184.74d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 907184740d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.90718474d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 32000d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 4535923.7d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.8928571429d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 5.4631904725944E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 9.0718474E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 9.0718474E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 9.0718474E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 0.0009071847d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.90718474d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 9071.8474d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 90718.474d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 9071847.4d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 90718474d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 907184740000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 9.0718474E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 9.0718474E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 9.0718474E+20d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 9.0718474E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 5.4632240308773E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 92.5070987544d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 62.1619003431d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 62.1619003431d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2430.5555555556d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 64400.000000063d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 31103.473245317d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 27770.961428572d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0009071847d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 9.0718474d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 20d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 17.8571428571d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 80d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 71.4285714286d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 160d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 142.8571428571d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.90718474d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 583333.33333177d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 699999.99999812d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 13999999.999962d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 907184740000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 26.5258695906d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1591.5521754386d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 79577.60877193d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 159155.21754386d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1591552.1754386d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 44.4698401961d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2668.1904117647d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 66704.760294117d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 133409.52058824d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 266819.04117647d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 235632.4d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3770118.4d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 15080473.6d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 30160947.2d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 41676876570.604d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 9.9587872500394E+32d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 4.8164002674336E+30d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.4237248068617E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.4162591766598E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.7132089319671E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.5180467536813E-22d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-28d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightTonLong() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1016.0469088d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1016046.9088d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1016046908.8d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0160469088d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2240d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35840d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5080234.544d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.12d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.1187733293058E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0160469088E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0160469088E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0160469088E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 0.0010160469d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0160469088d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10160.469088d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 101604.69088d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10160469.088d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 101604690.88d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1016046908800d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0160469088E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.0160469088E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.0160469088E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0160469088E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.1188109145826E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 103.6079506049d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.24d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 69.6213283843d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 69.6213283843d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2722.2222222222d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 72128.000000071d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 34835.890034755d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 31103.476800001d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0010160469d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 10.160469088d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 22.4d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 20d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 89.6d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 80d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 179.2d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 160d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.0160469088d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 653333.33333158d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 783999.99999789d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 15679999.999958d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1016046908800d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 29.7089739415d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1782.5384364912d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 89126.921824561d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 178253.84364912d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1782538.4364912d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 49.8062210196d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2988.3732611765d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 74709.331529412d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 149418.66305882d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 298837.32611765d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 263908.288d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4222532.608d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 16890130.432d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 33780260.864d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 46678101759.077d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.1153841720044E+33d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3943682995256E+30d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 6.0745717836852E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 6.066210277859E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 3.0387940038031E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.7002123641231E-22d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.080234544E-28d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightAtomicMassUnit() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 3.6608644894093E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 5.8573831830548E-26d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 8.3027009999999E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.8304322447046E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 1.6343145042006E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-42d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-39d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-36d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-33d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-26d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-22d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 1.0000061426d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.6932797642416E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 3.6608644894093E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 1.137831467802E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 1.1378314678019E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 4.4489672614349E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 1.1787983655909E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 5.6932800350537E-26d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 5.0832863265307E-26d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-33d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-29d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 3.6608644894093E-29d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 3.2686290084011E-29d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 1.4643457957637E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 1.3074516033605E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 2.9286915915274E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 2.6149032067209E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 1.0677521427415E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 1.2813025712898E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 2.5626051425796E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1.6605402E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 4.8553807017543E-29d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9132284210526E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.4566142105263E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9132284210526E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9132284210526E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 8.1399029411764E-29d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.8839417647059E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1.2209854411765E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.4419708823529E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.8839417647059E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4.3130914285714E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 6.9009462857142E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 2.7603785142857E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 5.5207570285714E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 7.628669873341E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1822.8885300626d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 8.8160943529d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 0.9927760773d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 0.9914095443d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 0.4966345116d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 2.7786817269075E-52d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 8.3027009999999E-58d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightExagram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 3.527396194958E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1102311310924.4d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 984206527611.06d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+41d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1.0E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1.0E+20d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+30d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+33d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+36d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+41d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2204622621848.8d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 68521765856800d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 68521765856792d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2.679228880719E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 7.09888484236E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 3.4285710367347E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 3.061224489796E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 10000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 22046226218488d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 19684130552221d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 88184904873951d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 78736522208885d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 1.763698097479E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 1.5747304441777E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 6.4301493137083E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 7.71617917645E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 1.54323583529E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 29239766081871d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 8.7719298245614E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 49019607843137d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 7.3529411764706E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1.4705882352941E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 2.5974025974026E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4.1558441558442E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1.6623376623377E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3.3246753246753E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 4.5940892447777E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+45d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+42d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+41d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+41d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+41d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-16d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightPetagram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2204622621848.8d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35273961949580d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1102311310.9244d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 984206527.61106d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+38d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+30d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+33d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+38d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 101971621297.79d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2204622621.8488d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 68521765856.8d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 68521765856.792d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2679228880719d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 70988848423600d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 34285710367347d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 30612244897960d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 22046226218.488d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 19684130552.221d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 88184904873.951d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 78736522208.885d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 176369809747.9d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 157473044417.77d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 6.4301493137083E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 7.71617917645E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 1.54323583529E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 29239766081.871d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1754385964912.3d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 87719298245614d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 49019607843.137d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2941176470588.2d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 73529411764706d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1.4705882352941E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 2.5974025974026E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4.1558441558442E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1.6623376623377E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3.3246753246753E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 4.5940892447777E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+42d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+39d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+38d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+38d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+38d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-19d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightTeragram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2204622621.8488d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35273961949.58d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1102311.3109244d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 984206.52761106d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+35d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 100000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+30d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+35d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 101971621.29779d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2204622.6218488d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 68521765.8568d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 68521765.856792d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2679228880.719d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 70988848423.6d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 34285710367.347d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 30612244897.96d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 22046226.218488d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 19684130.552221d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 88184904.873951d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 78736522.208885d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 176369809.7479d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 157473044.41777d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 643014931370.83d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 771617917645d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 15432358352900d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 29239766.081871d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1754385964.9123d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 87719298245.614d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 175438596491.23d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1754385964912.3d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 49019607.843137d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2941176470.5882d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 73529411764.706d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 147058823529.41d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 294117647058.82d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 259740259740.26d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4155844155844.2d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 16623376623377d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 33246753246753d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 4.5940892447777E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+39d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+36d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+35d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+35d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+35d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-22d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightGigagram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2204622.6218488d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35273961.94958d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1102.3113109244d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 984.2065276111d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+32d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 100000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+32d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2204.6226218488d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 68521.7658568d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 68521.765856792d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2679228.880719d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 70988848.4236d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 34285710.367347d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 30612244.89796d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 22046.226218488d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 19684.130552221d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 88184.904873951d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 78736.522208885d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 176369.8097479d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 157473.04441777d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 643014931.37083d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 771617917.645d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 15432358352.9d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 29239.766081871d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1754385.9649123d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 87719298.245614d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 175438596.49123d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1754385964.9123d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 49019.607843137d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2941176.4705882d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 73529411.764706d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 147058823.52941d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 294117647.05882d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 259740259.74026d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4155844155.8442d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 16623376623.377d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 33246753246.753d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 45940892447777d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+36d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+33d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+32d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+32d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+32d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-25d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightMegagram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2204.6226218488d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35273.96194958d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.9842065276d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 101.9716212978d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 68.5217658568d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 68.5217658568d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2679.228880719d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 70988.8484236d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 34285.710367347d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 30612.24489796d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 22.0462262185d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 19.6841305522d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 88.184904874d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 78.7365222089d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 176.3698097479d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 157.4730444178d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 643014.93137083d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 771617.917645d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 15432358.3529d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 29.2397660819d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1754.3859649123d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 87719.298245614d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 175438.59649123d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1754385.9649123d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 49.0196078431d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2941.1764705882d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 73529.411764706d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 147058.82352941d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 294117.64705882d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 259740.25974026d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4155844.1558442d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 16623376.623377d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 33246753.246753d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 45940892447.777d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+33d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+30d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-22d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-28d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightHectogram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.2204622622d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 3.527396195d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 500d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.0001102311d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.84207E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 100000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+20d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 0.0101971621d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 0.0002204623d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 0.0068521766d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 0.0068521766d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.2679228881d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 7.0988848424d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 3.4285710367d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 3.0612244898d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.0022046226d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.0019684131d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 0.0088184905d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 0.0078736522d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 0.017636981d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 0.0157473044d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 64.3014931371d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 77.1617917645d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 1543.23583529d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0029239766d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.1754385965d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 8.7719298246d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 17.5438596491d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 175.4385964912d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0049019608d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.2941176471d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 7.3529411765d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 14.7058823529d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 29.4117647059d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 25.974025974d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 415.5844155844d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1662.3376623377d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3324.6753246753d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 4594089.2447777d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-26d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-32d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightDekagram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0220462262d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 0.3527396195d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 50d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.10231E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 10000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 0.0010197162d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.20462E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 0.0006852177d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 0.0006852177d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.0267922888d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 0.7098884842d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 0.3428571037d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 0.306122449d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.0002204623d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.0001968413d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 0.000881849d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 0.0007873652d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 0.0017636981d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 0.0015747304d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 6.4301493137d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 7.7161791765d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 154.323583529d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0002923977d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0175438596d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.8771929825d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 17.5438596491d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0004901961d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0294117647d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.7352941176d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1.4705882353d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764706d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 2.5974025974d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 41.5584415584d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 166.2337662338d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 332.4675324675d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 459408.92447777d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-33d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightDecigram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0002204623d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 0.0035273962d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 0.5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 100000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.01972E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 6.85217658568E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 6.8521765856792E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.0002679229d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 0.0070988848d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 0.003428571d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 0.0030612245d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 1.9684130552221E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 8.8184904873951E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 7.8736522208885E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 1.7637E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 1.57473E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 0.0643014931d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.0771617918d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 1.5432358353d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9239766081871E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0001754386d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0087719298d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0175438596d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.1754385965d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.9019607843137E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0002941176d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0073529412d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0147058824d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0294117647d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.025974026d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.4155844156d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1.6623376623d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3.3246753247d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 4594.0892447777d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-29d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-35d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightCentigram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.20462E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 0.0003527396d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 0.05d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 10000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 6.85217658568E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 6.8521765856792E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2.67923E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 0.0007098885d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 0.0003428571d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 0.0003061224d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 1.9684130552221E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 8.8184904873951E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 7.8736522208885E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 1.763698097479E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 1.5747304441777E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 0.0064301493d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.0077161792d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 0.1543235835d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9239766081871E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.75439E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.000877193d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.001754386d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0175438596d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.9019607843137E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.94118E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0007352941d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0014705882d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0029411765d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.0025974026d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.0415584416d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.1662337662d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.3324675325d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 459.4089244778d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-36d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightMicrogram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 3.527396194958E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 6.85217658568E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 6.8521765856792E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2.679228880719E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 7.09888484236E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 3.4285710367347E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 3.061224489796E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 1.9684130552221E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 8.8184904873951E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 7.8736522208885E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 1.763698097479E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 1.5747304441777E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 6.4301493137083E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 7.71617917645E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 1.54324E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9239766081871E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 8.7719298245614E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.9019607843137E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 7.3529411764706E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1.4705882352941E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 2.5974025974026E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4.1558441558442E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1.66234E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3.32468E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 0.0459408924d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-34d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-40d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightNanogram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 3.527396194958E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 6.85217658568E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 6.8521765856792E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2.679228880719E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 7.09888484236E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 3.4285710367347E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 3.061224489796E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 1.9684130552221E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 8.8184904873951E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 7.8736522208885E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 1.763698097479E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 1.5747304441777E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 6.4301493137083E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 7.71617917645E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 1.54323583529E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9239766081871E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 8.7719298245614E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.9019607843137E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 7.3529411764706E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1.4705882352941E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 2.5974025974026E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4.1558441558442E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1.6623376623377E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3.3246753246753E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 4.59409E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-37d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-43d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightPicogram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 3.527396194958E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 602213665167.52d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 602217364335d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 6.85217658568E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 6.8521765856792E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2.679228880719E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 7.09888484236E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 3.4285710367347E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 3.061224489796E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 1.9684130552221E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 8.8184904873951E-1d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 7.8736522208885E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 1.763698097479E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 1.5747304441777E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 6.4301493137083E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 7.71617917645E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 1.54323583529E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9239766081871E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 8.7719298245614E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.9019607843137E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 7.3529411764706E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1.4705882352941E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 2.5974025974026E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4.1558441558442E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1.6623376623377E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3.3246753246753E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 4.5940892447777E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5309172492731.3d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 597863320194.49d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 597040375333.01d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 299080089460.84d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-40d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-46d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightFemtogram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 3.527396194958E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-22d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 602213665.16752d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-33d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 602217364.335d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 6.85217658568E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 6.8521765856792E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2.679228880719E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 7.09888484236E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 3.4285710367347E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 3.061224489796E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 1.9684130552221E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 8.8184904873951E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 7.8736522208885E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 1.763698097479E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 1.5747304441777E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 6.4301493137083E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 7.71617917645E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 1.54323583529E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9239766081871E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 8.7719298245614E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.9019607843137E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 7.3529411764706E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1.4705882352941E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 2.5974025974026E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4.1558441558442E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1.6623376623377E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3.3246753246753E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 4.5940892447777E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1097768382880.8d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5309172492.7313d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 597863320.19449d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 597040375.33301d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 299080089.46084d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-43d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-49d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightAttogram() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 3.527396194958E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 602213.66516752d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-36d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-33d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1.0E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 602217.364335d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-22d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 6.85217658568E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 6.8521765856792E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2.679228880719E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 7.09888484236E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 3.4285710367347E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 3.061224489796E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 1.9684130552221E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 8.8184904873951E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 7.8736522208885E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 1.763698097479E-22d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 1.5747304441777E-22d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 6.4301493137083E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 7.71617917645E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 1.54323583529E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9239766081871E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 8.7719298245614E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.9019607843137E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 7.3529411764706E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1.4705882352941E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 2.5974025974026E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4.1558441558442E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1.6623376623377E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3.3246753246753E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 4.5940892447777E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1097768382.8808d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5309172.4927313d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 597863.32019449d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 597040.37533301d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 299080.08946084d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-46d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-52d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightDalton() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 3.6608420022615E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 5.8573472036184E-26d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 8.3026500000067E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.8304210011307E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 1.6343044652953E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 0.9999938574d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-42d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-39d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-36d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-33d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-26d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-22d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.6932693631376E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 3.6608420022615E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 1.1378244785828E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 1.1378244785827E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 4.4489399333039E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 1.1787911247294E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 5.6932450636337E-26d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 5.083255102045E-26d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-33d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-29d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 3.6608420022615E-29d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 3.2686089305906E-29d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 1.4643368009046E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 1.3074435722362E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 2.9286736018092E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 2.6148871444725E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-30d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 1.0677455839901E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 1.2812947007881E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 2.5625894015762E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1.6605300000013E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 4.8553508771969E-29d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9132105263181E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.4566052631591E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9132105263181E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9132105263181E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 8.139852941183E-29d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.8839117647098E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1.2209779411775E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.4419558823549E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.8839117647098E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4.3130649350684E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 6.9009038961094E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 2.7603615584438E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 5.5207231168875E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 7.6286230136368E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1822.8773328265d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 8.8160401994d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 0.9927699791d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 0.9914034545d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 0.496631461d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 2.7786646586367E-52d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 8.3026500000067E-58d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightKilogramForceSquareSecondMeter() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 9.80665d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 9806.65d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 9806650d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 21.6199624346d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 345.9193989529d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 49033.25d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.0108099812d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.0096517689d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 5.905698639515E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 9.80665E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 9.80665E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 9.80665E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 9.80665E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 98.0665d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 980.665d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 98066.5d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 980665d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 9806650000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 9806650000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 9.80665E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 9.80665E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 9.80665E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 5.9057349159558E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 0.0216199624d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 0.6719689751d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 0.6719689751d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 26.2742599031d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 696.1627903933d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 336.2279615739d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 300.2035714286d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 9.80665E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.0980665d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.2161996243d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.1930353789d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 0.8647984974d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 0.7721415155d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 1.7295969948d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 1.544283031d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.00980665d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 6305.8223767278d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 7566.9868520733d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 151339.73704147d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 9806650000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.286744152d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 17.2046491228d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 860.2324561403d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1720.4649122807d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 17204.649122807d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.4807181373d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 28.8430882353d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 721.0772058824d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1442.1544117647d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2884.3088235294d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 2547.1818181818d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 40754.909090909d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 163019.63636364d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 326039.27272727d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 450526252.92299d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0765430311978E+31d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.2065196425843E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.8630363289853E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.8549659967595E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9329737593111E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.6410056894243E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 4.903325E-30d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightKilopound() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 453.59237d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 453592.37d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 453592370d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.45359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 16000d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 2267961.85d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.4464285714d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 2.7315952362972E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 0.0004535924d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.45359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 4535.9237d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 45359.237d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 4535923.7d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 45359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 453592370000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E+20d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 2.7316120154387E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 46.2535493772d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 31.0809501716d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 31.0809501716d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 1215.2777777778d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 32200.000000031d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 15551.736622659d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 13885.480714286d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0004535924d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 4.5359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 8.9285714286d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 40d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 35.7142857143d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 80d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 71.4285714286d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.45359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 291666.66666588d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 349999.99999906d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 6999999.9999812d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 453592370000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 13.2629347953d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 795.7760877193d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 39788.804385965d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 79577.60877193d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 795776.0877193d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 22.234920098d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1334.0952058824d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 33352.380147059d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 66704.760294118d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 133409.52058824d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 117816.2d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1885059.2d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 7540236.8d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 15080473.6d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 20838438285.302d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 4.9793936250197E+32d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 2.4082001337168E+30d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 2.7118624034309E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 2.7081295883299E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 1.3566044659835E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 7.5902337684067E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 2.26796185E-28d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightSlug() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 14.5939029372d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 14593.902937205d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 14593902.937205d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0145939029d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 32.1740485564d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 514.7847769028d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 72969.514686023d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.0160870243d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.0143634145d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 8.788647776913E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.4593902937205E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.4593902937205E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.4593902937205E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.45939E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.0145939029d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 145.939029372d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1459.3902937205d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 145939.02937205d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1459390.2937205d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 14593902937.205d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 14593902937205d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.4593902937205E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.4593902937205E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.4593902937205E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 8.7887017622042E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.4881639436d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 0.0321740486d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 39.1004062318d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 1036.004363518d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 500.3623292342d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 446.7521307308d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.45939E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.1459390294d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.3217404856d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.2872682907d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 1.2869619423d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 1.1490731627d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 2.5739238845d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 2.2981463255d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.0145939029d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 9384.0974955992d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 11260.916994719d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 225218.33989438d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 14593902937.205d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.4267223081d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 25.6033384863d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1280.1669243162d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2560.3338486324d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 25603.338486324d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.7153873989d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 42.923243933d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1073.0810983239d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2146.1621966477d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4292.3243932955d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3790.6241395337d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 60649.986232539d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 242599.94493015d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 485199.88986031d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 670456925.23141d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.6020725227294E+31d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 7.7481548035797E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 8.7251592646333E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 8.7131492872022E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 4.364745796042E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 2.4420854981935E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 7.2969514686023E-30d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightPoundForceSquareSecondFoot() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 14.5939029372d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 14593.902937205d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 14593902.937205d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0145939029d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 32.1740485564d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 514.7847769028d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 72969.514686023d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.0160870243d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.0143634145d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 8.788647776913E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.4593902937205E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.4593902937205E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.4593902937205E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.45939E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.0145939029d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 145.939029372d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1459.3902937205d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 145939.02937205d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1459390.2937205d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 14593902937.205d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 14593902937205d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.4593902937205E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.4593902937205E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.4593902937205E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 8.7887017622042E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.4881639436d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 0.0321740486d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 39.1004062318d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 1036.004363518d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 500.3623292342d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 446.7521307308d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.45939E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.1459390294d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.3217404856d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.2872682907d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 1.2869619423d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 1.1490731627d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 2.5739238845d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 2.2981463255d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.0145939029d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 9384.0974955992d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 11260.916994719d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 225218.33989438d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 14593902937.205d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.4267223081d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 25.6033384863d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1280.1669243162d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2560.3338486324d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 25603.338486324d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.7153873989d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 42.923243933d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1073.0810983239d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2146.1621966477d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4292.3243932955d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3790.6241395337d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 60649.986232539d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 242599.94493015d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 485199.88986031d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 670456925.23141d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.6020725227294E+31d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 7.7481548035797E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 8.7251592646333E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 8.7131492872022E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 4.364745796042E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 2.4420854981935E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 7.2969514686023E-30d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightPoundTroyOrApothecary() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.3732417216d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 373.2417216d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 373241.7216d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0003732417d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.8228571429d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 13.1657142857d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 1866.208608d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.0004114286d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.0003673469d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 2.2477126515817E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 3.732417216E-16d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 3.732417216E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 3.732417216E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 3.732417216E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.0003732417d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 3.732417216d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 37.32417216d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 3732.417216d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 37324.17216d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 373241721.6d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 373241721600d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 3.732417216E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 3.732417216E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 3.732417216E+20d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 2.2477264584181E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 0.0380600635d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 0.0008228571d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 0.0255751819d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 0.0255751819d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 26.496d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 12.7968575638d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 11.4257669878d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 3.732417216E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.0037324172d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.0082285714d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.0073469388d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 0.0329142857d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 0.0293877551d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 0.0658285714d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 0.0587755102d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.0003732417d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 239.9999999994d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 287.9999999992d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 5759.9999999845d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 373241721.6d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0109135006d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.6548100379d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 32.7405018947d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 65.4810037895d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 654.8100378947d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0182961628d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1.0977697694d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 27.4442442353d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 54.8884884706d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 109.7769769412d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 96.9459017143d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1551.1344274286d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 6204.5377097143d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 12409.075419429d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 17147057.789049d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 4.0973296114448E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 1.9816046814584E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 2.2314753491088E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 2.22840377554E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 1.1162916748665E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 6.245678072289E-26d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.866208608E-31d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightPoundal() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.0140867196d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 14.0867195652d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 14086.719565204d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.40867E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0310559006d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 0.4968944099d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 70.433597826d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.5528E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 1.38642E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 8.4832150195483E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.4086719565204E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.4086719565204E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.4086719565204E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.4086719565204E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.40867E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.1408671957d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.4086719565d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 140.867195652d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1408.6719565204d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 14086719.565204d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 14086719565.204d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 14086719565204d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.4086719565204E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.4086719565204E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 8.4832671286832E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 0.0014364456d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 3.10559E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 0.0009652469d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 0.0009652469d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.0377415459d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 0.482973187d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 0.4312261091d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.4086719565204E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.0001408672d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.000310559d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.0002772848d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 0.001242236d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 0.0011091393d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 0.002484472d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 0.0022182786d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.40867E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 9.0579710145d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 10.8695652174d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 217.391304347d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 14086719.565204d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0004118924d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0247135431d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.2356771548d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.4713543097d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 24.7135430968d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0006905255d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0414315281d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1.0357882033d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.0715764066d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.1431528133d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3.6588881988d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 58.5422111801d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 234.1688447203d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 468.3376894405d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 647156.46848702d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.5463955357189E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 7.4788824028399E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 8.4219329299013E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 8.41034033642E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 4.2130573477709E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 2.3572154560246E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 7.0433597826018E-33d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightTonAssayUS() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.02916667d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 29.16667d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 29166.67d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 2.91667E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0643015005d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 1.0288240078d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 145.83335d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 3.21508E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 2.8706E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 1.7564567241432E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 2.916667E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 2.916667E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 2.916667E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 2.916667E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 2.91667E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.2916667d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 2.916667d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 291.6667d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 2916.667d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 29166670d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 29166670000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 29166670000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 2.916667E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 2.916667E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 1.7564675133829E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 0.0029741726d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 6.43015E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 0.0019985517d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 0.0019985517d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.0781441846d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 2.0705083157d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 0.8928572449d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 2.916667E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.0002916667d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.000643015d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.0005741205d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 0.00257206d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 0.0022964822d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 0.00514412d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 0.0045929643d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 2.91667E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 18.7546043084d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 22.50552517d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 450.1105034008d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 29166670d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0008528266d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0511695965d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.5584798246d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 5.1169596491d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 51.1695964912d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0014297387d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0511695965d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.1446080882d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.2892161765d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 8.5784323529d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 7.5757584416d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 121.2121350649d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 484.8485402597d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 969.6970805195d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 1339942.8495298d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 3.2018248159918E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 1.5485088206857E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 1.7437682165217E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 1.7413679604014E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 8.7231702728748E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 4.8806342034805E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.4583335E-32d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightTonAssayUK() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.0326666667d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 32.6666666667d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 32666.666666666d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 3.26667E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0720176723d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 1.152282757d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 163.3333333333d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 3.60088E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 3.21507E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 1.9672313062138E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 3.2666666666666E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 3.2666666666666E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 3.2666666666666E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 3.2666666666666E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 3.26667E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.3266666667d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 3.2666666667d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 326.6666666667d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 3266.6666666666d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 32666666.666666d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 32666666666.666d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 32666666666666d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 3.2666666666666E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 3.2666666666666E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 1.9672433901609E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 0.003331073d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 7.20177E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 0.0022383777d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 0.0022383777d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.0875214768d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 2.3189690485d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 1.119999872d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 3.2666666666666E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.0003266667d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.0007201767d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.0006430149d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 0.0028807069d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 0.0025720597d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 0.0057614138d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 0.0051441195d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 3.26667E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 21.0051544248d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 25.2061853097d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 504.1237061947d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 32666666.666666d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0009551657d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0573099415d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.865497076d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 5.730994152d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 57.3099415205d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0016013072d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0573099415d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.4019607843d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.8039215686d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 9.6078431373d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 8.4848484848d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 135.7575757576d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 543.0303030303d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1086.0606060606d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 1500735.8199607d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 3.5860433840772E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 1.7343296809588E+26d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 1.9530201793019E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 1.9503318927544E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 9.7699495890538E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.4663096831769E-27d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.6333333333333E-32d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightKilotonMetric() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2204622.6218488d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35273961.94958d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1102.3113109244d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 984.2065276111d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+32d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 100000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+32d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 101971.62129779d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2204.6226218488d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 68521.7658568d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 68521.765856792d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2679228.880719d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 70988848.4236d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 34285710.367347d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 30612244.89796d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 22046.226218488d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 19684.130552221d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 88184.904873951d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 78736.522208885d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 176369.8097479d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 157473.04441777d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 643014931.37083d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 771617917.645d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 15432358352.9d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 29239.766081871d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1754385.9649123d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 87719298.245614d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 175438596.49123d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1754385964.9123d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 49019.607843137d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2941176.4705882d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 73529411.764706d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 147058823.52941d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 294117647.05882d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 259740259.74026d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4155844155.8442d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 16623376623.377d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 33246753246.753d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 45940892447777d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+36d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+33d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+32d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+32d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+32d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-19d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-25d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightQuintalMetric() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 220.4622621849d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 3527.396194958d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 500000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.1102311311d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.0984206528d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 100000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+20d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 10.1971621298d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 0.2204622622d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 6.8521765857d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 6.8521765857d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 267.9228880719d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 7098.88484236d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 3428.5710367347d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 3061.224489796d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 2.2046226218d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 1.9684130552d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 8.8184904874d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 7.8736522209d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 17.6369809748d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 15.7473044418d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 64301.493137083d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 77161.7917645d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 1543235.83529d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 100000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9239766082d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 175.4385964912d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 8771.9298245614d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 17543.859649123d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 175438.59649123d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.9019607843d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 175.4385964912d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 7352.9411764706d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 14705.882352941d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 29411.764705882d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 25974.025974026d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 415584.41558442d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1662337.6623377d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3324675.3246753d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 4594089244.7777d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+32d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-23d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-29d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightHundredweightUS() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 45.359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 45359.237d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 45359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.045359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 1600d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 226796.185d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.05d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.0446428571d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 2.7315952362972E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 4.53592E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.045359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 453.59237d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 4535.9237d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 453592.37d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 4535923.7d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 45359237000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 45359237000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 4.5359237E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 2.7316120154387E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 4.6253549377d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 3.1080950172d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 3.1080950172d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 121.5277777778d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 3220.0000000031d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 1555.1736622659d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 1388.5480714286d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 4.53592E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.45359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.8928571429d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 4d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 3.5714285714d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 8d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 7.1428571429d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.045359237d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 29166.666666588d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 34999.999999906d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 699999.99999812d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 45359237000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.3262934795d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 79.5776087719d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 3978.8804385965d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 7957.760877193d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 79577.60877193d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.2234920098d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 79.5776087719d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 3335.2380147059d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 6670.4760294118d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 13340.952058823d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 11781.62d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 188505.92d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 754023.68d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1508047.36d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 2083843828.5302d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 4.9793936250197E+31d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 2.4082001337168E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 2.7118624034309E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 2.7081295883299E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 1.3566044659835E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 7.5902337684067E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 2.26796185E-29d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightHundredweightUK() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 50.80234544d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 50802.34544d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 50802345.44d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0508023454d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 112d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 1792d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 254011.7272d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.056d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.05d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 3.0593866646529E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 5.080234544E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 5.080234544E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 5.080234544E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 5.08023E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.0508023454d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 508.0234544d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 5080.234544d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 508023.4544d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 5080234.544d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 50802345440d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 50802345440000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 5.080234544E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 5.080234544E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 5.080234544E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 3.0594054572913E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 5.1803975302d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 0.112d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 3.4810664192d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 3.4810664192d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 136.1111111111d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 3606.4000000035d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 1741.7945017378d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 1555.17384d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 5.08023E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.5080234544d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 1.12d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 4.48d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 4d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 8.96d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 8d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.0508023454d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 32666.666666579d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 39199.999999895d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 783999.9999979d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 50802345440d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.4854486971d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 89.1269218246d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 4456.3460912281d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 8912.6921824561d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 89126.921824561d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.490311051d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 149.4186630588d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 3735.4665764706d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 7470.9331529412d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 14941.866305882d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 13195.4144d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 211126.6304d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 844506.5216d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1689013.0432d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 2333905087.9539d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 5.5769208600221E+31d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 2.6971841497628E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 3.0372858918426E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 3.0331051389295E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 1.5193970019016E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 8.5010618206156E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 2.540117272E-29d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightQuarterUS() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 11.33980925d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 11339.80925d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 11339809.25d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0113398093d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 25d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 400d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 56699.0462d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.0125d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.0111607143d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.828988090743E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.133980925E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.133980925E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.133980925E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.13398E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.0113398093d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 113.3980925d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1133.980925d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 113398.0925d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1133980.925d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 11339809250d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 11339809250000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.133980925E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.133980925E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.133980925E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.8290300385967E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.1563387344d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 0.025d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 0.7770237543d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 0.7770237543d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 30.3819444444d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 805.0000000008d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 388.7934155665d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 347.1370178572d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.13398E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.1133980925d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.25d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.2232142857d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 0.8928571429d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 2d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 1.7857142857d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.0113398093d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 7291.6666666471d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 8749.9999999765d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 174999.99999953d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 11339809250d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.3315733699d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 19.894402193d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 994.7201096491d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1989.4402192983d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 19894.402192982d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.5558730025d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 33.3523801471d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 833.8095036765d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1667.6190073529d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 3335.2380147059d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 2945.405d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 47126.48d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 188505.92d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 377011.84d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 520960957.13256d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.2448484062549E+31d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 6.020500334292E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 6.7796560085772E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 6.7703239708247E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 3.3915111649589E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.8975584421017E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.669904625E-30d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightQuarterUK() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 12.70058636d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 12700.58636d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 12700586.36d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0127005864d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 28d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 448d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 63502.9318d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.014d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.0125d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 7.6484666616322E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.270058636E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.270058636E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.270058636E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.27006E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.0127005864d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 127.0058636d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1270.058636d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 127005.8636d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 1270058.636d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 12700586360d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 12700586360000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.270058636E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.270058636E+19d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.270058636E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 7.6485136432283E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.2950993826d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 0.028d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 0.8702666048d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 0.8702666048d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 34.0277777778d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 901.6000000009d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 435.4486254344d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 388.79346d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.27006E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.1270058636d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.28d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.25d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 1.12d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 2.24d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 2d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.0127005864d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 8166.6666666447d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 9799.9999999737d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 195999.99999947d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 12700586360d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.3713621743d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 22.2817304561d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1114.086522807d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2228.173045614d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 22281.73045614d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.6225777627d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 37.3546657647d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 933.8666441176d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1867.7332882353d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 3735.4665764706d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3298.8536d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 52781.6576d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 211126.6304d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 422253.2608d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 583476271.98846d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.3942302150055E+31d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 6.742960374407E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 7.5932147296065E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 7.5827628473237E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 3.7984925047539E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 2.1252654551539E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 6.35029318E-30d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightStoneUS() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 5.669904625d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 5669.904625d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 5669904.625d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0056699046d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 12.5d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 200d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 28349.523125d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.00625d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.0055803571d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 3.4144940453715E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 5.669904625E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 5.669904625E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 5.669904625E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 5.669904625E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.0056699046d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 56.69904625d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 566.9904625d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 56699.04625d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 566990.4625d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 5669904625d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 5669904625000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 5.669904625E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 5.669904625E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 5.669904625E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 3.4145150192983E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 0.5781693672d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 0.0125d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 0.3885118771d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 0.3885118771d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 15.1909722222d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 402.5000000004d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 194.3967077832d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 173.5685089286d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 5.669904625E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.0566990463d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.125d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.1116071429d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 0.5d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 0.4464285714d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 0.8928571429d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.0056699046d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 3645.8333333236d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 4374.9999999883d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 87499.999999765d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 5669904625d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.1657866849d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 9.9472010965d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 497.3600548246d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 994.7201096491d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 9947.2010964912d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.2779365012d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 16.6761900735d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 416.9047518382d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 833.8095036765d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1667.6190073529d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1472.7025d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 23563.24d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 94252.96d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 188505.92d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 260480478.56628d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 6.2242420312746E+30d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 3.010250167146E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 3.3898280042886E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 3.3851619854124E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 1.6957555824794E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 9.4877922105084E-25d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 2.8349523125E-30d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightStoneUK() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 6.35029318d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 6350.29318d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 6350293.18d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 0.0063502932d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 14d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 224d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 31751.4659d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 0.007d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.00625d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 3.8242333308161E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 6.35029318E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 6.35029318E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 6.35029318E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 6.35029318E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 0.0063502932d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 63.5029318d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 635.029318d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 63502.9318d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 635029.318d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 6350293180d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 6350293180000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 6.35029318E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 6.35029318E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 6.35029318E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 3.8242568216141E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 0.6475496913d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 0.014d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 0.4351333024d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 0.4351333024d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 17.0138888889d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 450.8000000004d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 217.7243127172d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 194.39673d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 6.35029318E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 0.0635029318d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 0.14d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 0.125d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 0.56d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 0.5d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 1.12d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 0.0063502932d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 4083.3333333224d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 4899.9999999868d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 97999.999999737d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 6350293180d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.1856810871d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 11.1408652281d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 557.0432614035d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1114.086522807d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 11140.86522807d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.3112888814d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 18.6773328824d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 466.9333220588d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 933.8666441176d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1867.7332882353d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1649.4268d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 26390.8288d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 105563.3152d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 211126.6304d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 291738135.99423d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 6.9711510750276E+30d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 3.3714801872035E+28d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 3.7966073648032E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 3.7913814236618E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 1.899246252377E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.0626327275769E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 3.17514659E-30d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightTonne() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2204.6226218488d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 35273.96194958d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 0.9842065276d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 100000d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 10000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 101.9716212978d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 68.5217658568d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 68.5217658568d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2679.228880719d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 70988.8484236d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 34285.710367347d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 30612.24489796d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 22.0462262185d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 19.6841305522d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 88.184904874d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 78.7365222089d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 176.3698097479d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 157.4730444178d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 643014.93137083d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 771617.917645d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 15432358.3529d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 29.2397660819d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1754.3859649123d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 87719.298245614d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 175438.59649123d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1754385.9649123d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 49.0196078431d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2941.1764705882d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 73529.411764706d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 147058.82352941d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 294117.64705882d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 259740.25974026d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4155844.1558442d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 16623376.623377d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 33246753.246753d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 45940892447.777d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+33d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+30d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+29d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-22d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-28d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightPennyweight() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.0015551738d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.55517384d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1555.1738400042d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.5551738400042E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0034285714d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 0.0548571429d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 7.7758692d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.7142857142903E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 1.5306122449021E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 9.3654693816156E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.5551738400042E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.5551738400042E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.5551738400042E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.5551738400042E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.5551738400042E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.0155517384d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 0.155517384d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 15.5517384d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 155.5173840004d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1555173.8400042d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1555173840.0042d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1555173840004.2d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.5551738400042E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.5551738400042E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 9.3655269101006E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 0.0001585836d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 3.4285714285806E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 0.0001065633d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 0.0001065633d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.0041666667d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 0.1104d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 0.0533202398d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 0.0476073624d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.5551738400042E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 1.55517E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 3.42857E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 3.06122E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 0.0001371429d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 0.000122449d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 0.0002742857d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 0.000244898d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.5551738400042E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 1.2d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 24d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1555173.8400042d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 4.54729E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0027283752d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.1364187579d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.2728375158d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.7283751579d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 7.6234E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0045740407d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.1143510176d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.2287020353d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.4574040706d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.4039412571d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 6.4630601143d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 25.8522404572d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 51.7044809144d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 71446.074121228d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.7072206714399E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 8.2566861727655E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 9.2978139546451E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 9.2850157314417E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 4.6512153119561E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 2.6023658634607E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 7.7758692000209E-34d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightScrupleApothecary() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 0.0012959782d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.2959782d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 1295.9782000035d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.2959782000035E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0028571429d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 0.0457142857d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 6.479891d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.4285714285753E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 1.2755102040851E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 7.804557818013E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.2959782000035E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.2959782000035E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.2959782000035E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.2959782000035E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.2959782000035E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.012959782d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 0.12959782d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 12.959782d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 129.5978200003d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 1295978.2000035d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1295978200.0035d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1295978200003.5d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1.2959782000035E+15d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1.2959782000035E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 7.8046057584171E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 0.000132153d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.8571428571505E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 8.88027E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 8.88027E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.0034722222d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 0.092d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 0.0444335332d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 0.039672802d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.2959782000035E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 1.29598E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 2.85714E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 2.55102E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 0.0001142857d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 0.0001020408d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 0.0002285714d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 0.0002040816d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.2959782000035E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 0.8333333333d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 20d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 1295978.2000035d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 3.78941E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.002273646d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.1136822982d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.2273645965d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.2736459649d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 6.35283E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0038117006d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0952925147d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.1905850294d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.3811700588d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.3366177143d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 5.3858834286d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 21.5435337143d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 43.0870674287d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 59538.395101024d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.4226838928666E+27d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 6.8805718106379E+24d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 7.7481782955376E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 7.7375131095348E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 3.8760127599634E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 2.1686382195506E-28d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 6.4798910000174E-34d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightGrain() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 6.47989E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 0.06479891d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 64.7989100002d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 6.4798910000174E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 0.0001428571d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 0.0022857143d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 0.32399455d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 7.1428571428763E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 6.3775510204253E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 3.9022789090065E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 6.4798910000174E-20d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 6.4798910000174E-17d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 6.4798910000174E-14d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 6.4798910000174E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 6.4798910000174E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 0.0006479891d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 0.006479891d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 0.6479891d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 6.479891d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue * 64798.910000174d;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 64798910.000174d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 64798910000.174d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 64798910000174d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 6.4798910000174E+16d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 3.9023028792086E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 6.6076499110475E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 1.4285714285753E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 4.4401357388078E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 4.4401357388072E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.0001736111d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 0.0046d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 0.0022216767d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 0.0019836401d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 6.4798910000174E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 6.4798910000174E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 1.4285714285753E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 1.2755102040851E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 5.7142857143011E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 5.1020408163402E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 1.14286E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 1.02041E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 6.4798910000174E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 0.0416666667d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 0.05d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue * 64798.910000174d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.8947049707653E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0001136823d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0056841149d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.0113682298d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 0.1136822982d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 3.1764171568713E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.000190585d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0047646257d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0095292515d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 0.0190585029d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.0168308857d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 0.2692941714d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1.0771766857d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 2.1543533714d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 2976.9197550512d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 7.1134194643329E+25d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 3.4402859053189E+23d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 3.8740891477688E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 3.8687565547674E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 1.9380063799817E+22d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.0843191097753E-29d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 3.2399455000087E-35d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void weightGamma() {
        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
            toValue = fromValue * 0.001d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
            toValue = fromValue * 3.527396194958E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
            toValue = fromValue * 5.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
            toValue = fromValue * 1.1023113109244E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
            toValue = fromValue * 9.8420652761106E-13d;
        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
            toValue = fromValue * 6.0221366516752E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-21d;
        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
            toValue = fromValue * 1.0E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
            toValue = fromValue * 1.0E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
            toValue = fromValue * 1000d;
        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
            toValue = fromValue * 1000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
            toValue = fromValue * 6.02217364335E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
            toValue = fromValue * 1.0197162129779E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
            toValue = fromValue * 6.85217658568E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
            toValue = fromValue * 6.8521765856792E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
            toValue = fromValue * 2.679228880719E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
            toValue = fromValue * 7.09888484236E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
            toValue = fromValue * 3.4285710367347E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
            toValue = fromValue * 3.061224489796E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-15d;
        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
            toValue = fromValue * 1.0E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
            toValue = fromValue * 2.2046226218488E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
            toValue = fromValue * 1.9684130552221E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
            toValue = fromValue * 8.8184904873951E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
            toValue = fromValue * 7.8736522208885E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
            toValue = fromValue * 1.763698097479E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
            toValue = fromValue * 1.5747304441777E-10d;
        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
            toValue = fromValue * 6.4301493137083E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
            toValue = fromValue * 7.71617917645E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
            toValue = fromValue * 1.54324E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 2.9239766081871E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 8.7719298245614E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
            toValue = fromValue * 1.7543859649123E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 4.9019607843137E-11d;
        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E-9d;
        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 7.3529411764706E-8d;
        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 1.4705882352941E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
            toValue = fromValue * 2.9411764705882E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 2.5974025974026E-7d;
        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 4.1558441558442E-6d;
        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 1.66234E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
            toValue = fromValue * 3.32468E-5d;
        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
            toValue = fromValue * 0.0459408924d;
        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
            toValue = fromValue * 1.0977683828808E+21d;
        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
            toValue = fromValue * 5.3091724927313E+18d;
        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
            toValue = fromValue * 5.9786332019449E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
            toValue = fromValue * 5.9704037533301E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
            toValue = fromValue * 2.9908008946084E+17d;
        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
            toValue = fromValue * 1.673360107095E-34d;
        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
            toValue = fromValue * 5.0E-40d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

//    private void weightTalentBiblicalHebrew() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightMinaBiblicalHebrew() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightShekelBiblicalHebrew() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightBekanBiblicalHebrew() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightGerahBiblicalHebrew() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightTalentBiblicalGreek() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightMinaBiblicalGreek() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightTetradrachmaBiblicalGreek() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightDidrachmaBiblicalGreek() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightDrachmaBiblicalGreek() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightDenariusBiblicalRoman() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightAssarionBiblicalRoman() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightQuadransBiblicalRoman() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightLeptonBiblicalRoman() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightPlanckMass() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightElectronMassRest() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightMuonMass() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightProtonMass() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightNeutronMass() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightDeuteronMass() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightEarthsMass() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
//
//    private void weightSunsMass() {
//        if (mContext.getString(R.string.string_units_list_weight_kilogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_milligram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ounce).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_carat).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_short).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_long).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_atomic_mass_unit).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_exagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_petagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_teragram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gigagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_megagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hectogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dekagram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_decigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_centigram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_microgram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_nanogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_picogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_femtogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_attogram).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_dalton).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilogram_force_square_second_meter).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kilopound).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_slug).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_force_square_second_foot).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pound_troy_or_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_poundal).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_ton_assay_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_kiloton_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quintal_metric).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_hundredweight_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quarter_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_us).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_stone_uk).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tonne).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_pennyweight).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_scruple_apothecary).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_grain).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gamma).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_shekel_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_bekan_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_gerah_biblical_hebrew).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_talent_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_mina_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_tetradrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_didrachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_drachma_biblical_greek).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_denarius_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_assarion_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_quadrans_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_lepton_biblical_roman).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_planck_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_electron_mass_rest).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_muon_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_proton_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_neutron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_deuteron_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_earth_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        } else if (mContext.getString(R.string.string_units_list_weight_sun_s_mass).equals(toUnit)) {
//            toValue = fromValue * d;
//        }
//
//        mToNumberTV.setText(String.valueOf(toValue));
//    }
}