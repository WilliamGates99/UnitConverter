package com.realbarrel.unitconverter.converters;

import android.content.Context;
import android.widget.TextView;

import com.realbarrel.unitconverter.R;

public class AreaConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public AreaConverter(Context context, String fromUnit, String toUnit, double fromValue,
                         double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(fromUnit)) {
            areaSquareMeter();
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(fromUnit)) {
            areaSquareKilometer();
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(fromUnit)) {
            areaSquareCentimeter();
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(fromUnit)) {
            areaSquareMillimeter();
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(fromUnit)) {
            areaSquareMicrometer();
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(fromUnit)) {
            areaHectare();
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(fromUnit)) {
            areaAcre();
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(fromUnit)) {
            areaSquareMile();
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(fromUnit)) {
            areaSquareYard();
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(fromUnit)) {
            areaSquareFoot();
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(fromUnit)) {
            areaSquareInch();
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(fromUnit)) {
            areaSquareHectometer();
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(fromUnit)) {
            areaSquareDekameter();
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(fromUnit)) {
            areaSquareDecimeter();
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(fromUnit)) {
            areaSquareNanometer();
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(fromUnit)) {
            areaAre();
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(fromUnit)) {
            areaBarn();
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(fromUnit)) {
            areaSquareMileUSSurvey();
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(fromUnit)) {
            areaSquareFootUSSurvey();
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(fromUnit)) {
            areaCircularInch();
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(fromUnit)) {
            areaTownship();
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(fromUnit)) {
            areaSection();
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(fromUnit)) {
            areaAcreUSSurvey();
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(fromUnit)) {
            areaRood();
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(fromUnit)) {
            areaSquareChain();
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(fromUnit)) {
            areaSquareRod();
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(fromUnit)) {
            areaSquareRodUSSurvey();
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(fromUnit)) {
            areaSquarePerch();
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(fromUnit)) {
            areaSquarePole();
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(fromUnit)) {
            areaSquareMil();
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(fromUnit)) {
            areaCircularMil();
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(fromUnit)) {
            areaHomestead();
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(fromUnit)) {
            areaSabin();
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(fromUnit)) {
            areaArpent();
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(fromUnit)) {
            areaCuerda();
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(fromUnit)) {
            areaPlaza();
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(fromUnit)) {
            areaVarasCastellanasCuad();
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(fromUnit)) {
            areaVarasConuquerasCuad();
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(fromUnit)) {
            areaElectronCrossSection();
        }
    }

    private void areaSquareMeter() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.0002471054d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 1.1959900463d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 10.7639104167d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1550.0031000062d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 1.0E+28d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.8610061413536E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 10.7638673611d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 1973.52524139d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 1.0725059959512E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0002471044d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 0.0009884215d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 0.0024710538d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 0.039536861d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0395367029d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 0.039536861d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 0.039536861d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 1550003100.0062d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 1973525241.39d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 1.5444086341698E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 10.7639104167d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 0.0002474462d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 0.0002544273d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.00015625d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 1.4311536386d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 0.159017071d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.5032029647492E+28d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareKilometer() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+18d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 247.1053814672d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 0.3861021585d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 1195990.0463011d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 10763910.41671d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1550003100.0062d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 1.0E+34d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.3861006141d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 10763867.361111d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 1973525241.39d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 0.01072506d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 0.3861021585d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 247.1043930466d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 988.4215258687d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 2471.0538146717d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 39536.861034747d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 39536.702887461d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 39536.861034747d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 39536.861034747d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 1.5500031000062E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 1.97352524139E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 1.5444086342d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 10763910.41671d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 247.4462164761d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 254.4273135354d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 156.25d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 1431153.6386366d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 159017.07095962d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.5032029647492E+34d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareCentimeter() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.4710538146716E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 0.000119599d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 0.001076391d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 0.15500031d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 1.0E+24d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.8610061413536E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0010763867d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 0.1973525241d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 1.0725059959512E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.4710439304663E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 9.8842152586866E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 2.4710538146717E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 3.9536861034747E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.9536702887461E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 3.9536861034747E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 3.9536861034747E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 155000.31000062d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 197352.524139d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 1.5444086341698E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 0.001076391d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 2.4744621647609E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 2.5442731353539E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 1.5625E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 0.0001431154d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 1.59017E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.5032029647492E+24d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareMillimeter() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.4710538146717E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 1.1959900463011E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 1.07639E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 0.0015500031d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1000000000000d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 1.0E+22d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.8610061413536E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 1.07639E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 0.0019735252d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 1.0725059959512E-14d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.4710439304663E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 9.8842152586866E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 2.4710538146717E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 3.9536861034746E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.9536702887461E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 3.9536861034746E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 3.9536861034746E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 1550.0031000062d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 1973.52524139d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 1.5444086341698E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 1.07639E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 2.4744621647609E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 2.5442731353539E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 1.5625E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 1.4311536386366E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 1.5901707095962E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.5032029647492E+22d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareMicrometer() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.4710538146717E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-19d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 1.1959900463011E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 1.076391041671E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1.5500031000062E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.8610061413536E-19d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 1.0763867361111E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 1.97352524139E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 1.0725059959512E-20d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-19d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.4710439304663E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 9.8842152586866E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 2.4710538146716E-15d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 3.9536861034747E-14d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.953670288746E-14d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 3.9536861034747E-14d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 3.9536861034747E-14d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 0.0015500031d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 0.0019735252d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 1.5444086341698E-18d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 1.076391041671E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 2.4744621647609E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 2.5442731353539E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 1.5625E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 1.4311536386366E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 1.5901707095962E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.5032029647492E+16d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaHectare() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.4710538147d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 0.0038610216d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 11959.900463011d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 107639.1041671d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 15500031.000062d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+22d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 1.0E+32d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0038610061d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 107638.67361111d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 19735252.4139d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 0.0001072506d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 0.0038610216d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.4710439305d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 9.8842152587d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 24.7105381467d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 395.3686103475d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 395.3670288746d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 395.3686103475d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 395.3686103475d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 15500031000062d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 19735252413900d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 0.0154440863d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 107639.1041671d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 2.4744621648d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 2.5442731354d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 1.5625d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 14311.536386366d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 1590.1707095962d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.5032029647492E+32d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaAcre() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 4046.8564224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.0040468564d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 40468564.224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 4046856422.4d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 4.0468564224E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.4046856422d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 0.0015625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 4840d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 43560d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 6272640d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.4046856422d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 40.468564224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 404685.64224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 4.0468564224E+21d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 40.468564224d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 4.0468564224E+31d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0015624938d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 43559.825760174d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 7986573.2978876d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 4.34028E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 0.0015625d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.999996d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 4d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 160d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 159.9993600006d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 160d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 160d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 6272640000000d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 7986573297887.6d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 0.00625d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 43560d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 1.0013793103d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 1.0296308078d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.632321316d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 5791.6732939575d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 643.5192548842d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 6.083246572066E+31d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareMile() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 2589988.110336d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 2.5899881103d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 25899881103.36d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 2589988110336d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 2.589988110336E+18d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 258.9988110336d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 640d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 3097600d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 27878400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 4014489600d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 258.9988110336d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 25899.88110336d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 258998811.0336d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 2.589988110336E+24d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 25899.88110336d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 2.589988110336E+34d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.999996d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 27878288.486511d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 5111406910.6481d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 0.0277777778d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 639.9974400026d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 2560d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 6400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 102400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 102399.59040041d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 102400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 102400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 4.0144896E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 5.1114069106481E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 4d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 27878400d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 640.8827586207d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 658.9637170014d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 404.68564224d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 3706670.9081328d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 411852.32312587d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 3.8932778061223E+34d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareYard() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 0.83612736d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 8.3612736E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 8361.2736d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 836127.36d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 836127360000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 8.36127E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.0002066116d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.228305785124E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 9d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1296d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 8.36127E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.0083612736d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 83.612736d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 8.3612736E+17d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 0.0083612736d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 8.3612736E+27d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.2282928719137E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 8.999964d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 1650.1184499768d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 8.9675160697888E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 3.228305785124E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0002066107d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 0.0008264463d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 0.0020661157d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 0.0330578512d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.033057719d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 0.0330578512d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 0.0330578512d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 1296000000d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 1650118449.9768d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 1.2913223140496E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 9d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 0.0002068966d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 0.0002127336d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.0001306449d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 1.1966267136d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 0.1329585237d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.2568691264599E+28d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareFoot() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 0.09290304d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 9.290304E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 929.0304d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 92903.04d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 92903040000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 9.290304E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.29568E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.5870064279155E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 0.1111111111d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 144d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 9.290304E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.0009290304d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 9.290304d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 9.290304E+16d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 0.0009290304d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 9.290304E+26d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.5869920799042E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.999996d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 183.3464944419d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 9.9639067442098E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 3.5870064279155E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.29567E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 9.18274E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 0.0002295684d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 0.0036730946d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0036730799d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 0.0036730946d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 0.0036730946d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 144000000d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 183346494.44186d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 1.4348025711662E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 2.29885E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 2.36371E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 1.45161E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 0.1329585237d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 0.0147731693d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.3965212516221E+27d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareInch() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 0.00064516d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 6.4516E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 6.4516d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 645.16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 645160000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 6.4516E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 1.5942250790736E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 2.4909766860524E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 0.0007716049d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 0.0069444444d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 6.4516E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 6.4516E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 0.064516d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 6.4516E+14d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 6.4516E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 6.4516E+24d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.4909667221557E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0069444167d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 1.2732395447d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 6.919379683479E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 2.4909766860524E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 1.5942187021796E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 6.3769003162943E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 1.5942250790736E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 2.55076E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.55075E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 2.55076E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 2.55076E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 1273239.5447352d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 9.9639067442098E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 0.0069444444d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 1.5964240102171E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 1.6414632560049E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 1.0080625E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 0.0009233231d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 0.0001025915d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 9.6980642473759E+24d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareHectometer() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.4710538147d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 0.0038610216d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 11959.900463011d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 107639.1041671d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 15500031.000062d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+22d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 1.0E+32d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0038610061d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 107638.67361111d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 19735252.4139d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 0.0001072506d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 0.0038610216d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.4710439305d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 9.8842152587d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 24.7105381467d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 395.3686103475d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 395.3670288746d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 395.3686103475d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 395.3686103475d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 15500031000062d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 19735252413900d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 0.0154440863d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 107639.1041671d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 2.4744621648d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 2.5442731354d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 1.5625d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 14311.536386366d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 1590.1707095962d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.5032029647492E+32d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareDekameter() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.0247105381d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.86102E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 119.5990046301d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 1076.391041671d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 155000.31000062d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+20d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 1.0E+30d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.86101E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 1076.3867361111d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 197352.524139d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 1.0725059959512E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 3.86102E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0247104393d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 0.0988421526d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 0.2471053815d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 3.9536861035d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.9536702887d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 3.9536861035d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 3.9536861035d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 155000310000.62d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 197352524139d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 0.0001544409d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 1076.391041671d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 0.0247446216d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 0.0254427314d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.015625d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 143.1153638637d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 15.901707096d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.5032029647492E+30d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareDecimeter() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.4710538146717E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 0.0119599005d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 0.1076391042d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 15.5000310001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+16d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 1.0E+26d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.8610061413536E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.1076386736d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 19.7352524139d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 1.0725059959512E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.4710439304663E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 9.8842152586866E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 2.47105E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 0.0003953686d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.000395367d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 0.0003953686d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 0.0003953686d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 15500031.000062d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 19735252.4139d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 1.5444086341698E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 0.1076391042d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 2.4744621647609E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 2.5442731353539E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 1.5625E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 0.0143115364d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 0.0015901707d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.5032029647492E+26d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareNanometer() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-18d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-14d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 1.0E-22d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.4710538146717E-22d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-25d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 1.1959900463011E-18d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 1.076391041671E-17d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1.5500031000062E-15d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-22d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-20d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 1.0E-20d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 10000000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.8610061413536E-25d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 1.0763867361111E-17d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 1.97352524139E-15d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 1.0725059959512E-26d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-25d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.4710439304663E-22d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 9.8842152586866E-22d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 2.4710538146717E-21d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 3.9536861034747E-20d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.953670288746E-20d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 3.9536861034747E-20d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 3.9536861034747E-20d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 1.5500031000062E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 1.97352524139E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 1.5444086341698E-24d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 1.076391041671E-17d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 2.4744621647609E-22d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 2.5442731353539E-22d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 1.5625E-22d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 1.4311536386366E-18d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 1.5901707095962E-19d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 15032029647.492d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaAre() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 100d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.0001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 100000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+14d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.0247105381d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.86102E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 119.5990046301d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 1076.391041671d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 155000.31000062d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.01d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 10000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E+20d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 1d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 1.0E+30d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.86101E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 1076.3867361111d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 197352.524139d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 1.0725059959512E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 3.86102E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0247104393d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 0.0988421526d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 0.2471053815d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 3.9536861035d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.9536702887d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 3.9536861035d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 3.9536861035d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 155000310000.62d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 197352524139d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 0.0001544409d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 1076.391041671d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 0.0247446216d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 0.0254427314d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.015625d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 143.1153638637d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 15.901707096d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.5032029647492E+30d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaBarn() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 1.0E-28d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-34d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-24d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-22d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 1.0E-32d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.4710538146717E-32d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-35d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 1.1959900463011E-28d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 1.076391041671E-27d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1.5500031000062E-25d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-32d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 1.0E-30d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 1.0E-26d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 1.0E-30d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.8610061413536E-35d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 1.0763867361111E-27d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 1.97352524139E-25d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 1.0725059959512E-36d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 3.8610215854245E-35d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.4710439304663E-32d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 9.8842152586866E-32d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 2.4710538146717E-31d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 3.9536861034746E-30d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.953670288746E-30d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 3.9536861034746E-30d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 3.9536861034746E-30d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 1.5500031000062E-19d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 1.97352524139E-19d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 1.5444086341698E-34d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 1.076391041671E-27d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 2.4744621647609E-32d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 2.5442731353539E-32d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 1.5625E-32d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 1.4311536386366E-28d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 1.5901707095962E-29d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.5032029647d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareMileUSSurvey() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 2589998.4703195d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 2.5899984703d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 25899984703.195d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 2589998470319.5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 2.5899984703195E+18d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 258.999847032d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 640.0025600077d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 1.000004d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 3097612.3904372d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 27878511.513934d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 4014505658.0066d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 258.999847032d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 25899.984703195d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 258999847.03195d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 2.5899984703195E+24d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 25899.984703195d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 2.5899984703195E+34d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 27878400d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 5111427356.337d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 0.0277778889d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 1.000004d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 640d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 2560.0102400307d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 6400.0256000768d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 102400.40960123d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 102400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 102400.40960123d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 102400.40960123d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 4.0145056580066E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 5.111427356337E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 4.000016d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 27878511.513934d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 640.8853221594d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 658.9663528642d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 404.6872609874d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 3706685.7348609d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 411853.9705401d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 3.8932933792802E+34d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareFootUSSurvey() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 0.0929034116d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 9.2903411613275E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 929.0341161327d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 92903.411613275d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 92903411613.275d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 9.2903411613275E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.29569E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.5870207759843E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 0.1111115556d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 1.000004d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 144.0005760017d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 9.2903411613275E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.0009290341d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 9.2903411613d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 9.2903411613275E+16d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 0.0009290341d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 9.2903411613275E+26d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.5870064279155E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 183.34722783d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 9.9639465999563E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 3.5870207759843E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.29568E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 9.18277E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 0.0002295693d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 0.0036731093d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0036730946d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 0.0036731093d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 0.0036731093d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 144000576.00173d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 183347227.83004d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 1.4348083103937E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 1.000004d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 2.29886E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 2.36372E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 1.45162E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 0.1329590556d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 0.0147732284d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.3965268377239E+27d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaCircularInch() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 0.0005067075d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 5.067074791d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 506.7074790975d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 506707479.0975d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 1.2521014491465E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 1.9564085142914E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 0.0006060171d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 0.0054541539d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 0.7853981634d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 0.0506707479d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E+14d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E+24d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 1.9564006886652E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0054541321d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 5.434468095254E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 1.9564085142914E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 1.2520964407457E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 5.0084057965861E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 1.2521014491465E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 2.00336E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.00335E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 2.00336E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 2.00336E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 785398.16339745d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 1000000d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 7.8256340571658E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 0.0054541539d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 1.2538284856281E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 1.2892022265507E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 7.9173043608984E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 0.0007251763d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 8.05751E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 7.6168418483995E+24d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaTownship() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 93239571.972096d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 93.2395719721d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 932395719720.96d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 93239571972096d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 9.3239571972096E+19d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 9323.9571972096d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 23040d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 36d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 111513600d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 1003622400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 144521625600d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 9323.9571972096d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 932395.71972096d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 9323957197.2096d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 9.3239571972096E+25d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 932395.71972096d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 9.3239571972096E+35d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 35.9998560001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 1003618385.5144d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 184010648783.33d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 36d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 23039.907840092d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 92160d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 230400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 3686400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 3686385.2544147d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 3686400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 3686400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 1.445216256E+17d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 1.8401064878333E+17d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 144d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 1003622400d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 23071.779310345d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 23722.69381205d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 14568.68312064d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 133440152.69278d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 14826683.632531d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.401580010204E+36d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSection() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 2589988.110336d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 2.5899881103d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 25899881103.36d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 2589988110336d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 2.589988110336E+18d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 258.9988110336d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 640d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 3097600d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 27878400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 4014489600d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 258.9988110336d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 25899.88110336d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 258998811.0336d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 2.589988110336E+24d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 25899.88110336d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 2.589988110336E+34d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.999996d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 27878288.486511d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 5111406910.6481d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 0.0277777778d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 639.9974400026d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 2560d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 6400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 102400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 102399.59040041d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 102400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 102400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 4.0144896E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 5.1114069106481E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 4d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 27878400d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 640.8827586207d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 658.9637170014d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 404.68564224d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 3706670.9081328d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 411852.32312587d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 3.8932778061223E+34d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaAcreUSSurvey() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 4046.8726098743d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.0040468726d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 40468726.098743d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 4046872609.8743d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 4.0468726098743E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.404687261d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 1.000004d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 0.0015625063d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 4840.0193600581d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 43560.174240523d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 6272665.0906353d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.404687261d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 40.4687260987d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 404687.26098743d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 4.0468726098743E+21d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 40.4687260987d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 4.0468726098743E+31d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0015625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 43560d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 7986605.2442766d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 4.3403E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 0.0015625063d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 4.000016d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 10.0000400001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 160.0006400019d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 160d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 160.0006400019d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 160.0006400019d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 6272665090635.3d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 7986605244276.6d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 0.006250025d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 43560.174240523d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 1.0013833159d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 1.0296349264d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.6323238453d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 5791.6964607202d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 643.5218289689d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 6.0832709051253E+31d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaRood() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 1011.7141056d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.0010117141d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 10117141.056d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 1011714105.6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 1.0117141056E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.1011714106d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.25d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 0.000390625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 1210d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 10890d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1568160d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.1011714106d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 10.117141056d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 101171.41056d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 1.0117141056E+21d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 10.117141056d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 1.0117141056E+31d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0003906234d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 10889.956440044d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 1996643.3244719d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 1.08507E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 0.000390625d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.249999d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 2.5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 40d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 39.9998400002d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 40d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 40d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 1568160000000d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 1996643324471.9d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 0.0015625d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 10890d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 0.2503448276d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 0.257407702d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.158080329d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 1447.9183234894d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 160.879813721d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.5208116430165E+31d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareChain() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 404.68564224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.0004046856d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 4046856.4224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 404685642.24d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 4.0468564224E+14d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.0404685642d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.1d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 0.00015625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 484d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 4356d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 627264d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.0404685642d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 4.0468564224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 40468.564224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 4.0468564224E+20d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 4.0468564224d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 4.0468564224E+30d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0001562494d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 4355.9825760174d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 798657.32978876d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 4.3402777777778E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 0.00015625d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0999996d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 0.4d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 15.9999360001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 627264000000d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 798657329788.76d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 0.000625d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 4356d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 0.100137931d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 0.1029630808d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.0632321316d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 579.1673293958d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 64.3519254884d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 6.083246572066E+30d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareRod() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 25.29285264d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 2.52929E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 252928.5264d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 25292852.64d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 25292852640000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.0025292853d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.00625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 9.765625E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 30.25d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 272.25d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 39204d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.0025292853d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.2529285264d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 2529.285264d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 2.529285264E+19d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 0.2529285264d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 2.529285264E+29d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 9.765585937539E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 272.2489110011d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 49916.083111797d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 2.7126736111111E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 9.765625E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.006249975d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 0.025d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 0.0625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.999996d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 39204000000d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 49916083111.797d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 3.90625E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 272.25d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 0.0062586207d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 0.0064351925d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.0039520082d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 36.1979580872d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 4.021995343d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 3.8020291075413E+29d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareRodUSSurvey() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 25.2929538117d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 2.5293E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 252929.53811714d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 25292953.811714d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 25292953811714d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.0025292954d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.006250025d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 9.7656640626172E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 30.2501210004d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 272.2510890033d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 39204.15681647d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.0025292954d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.2529295381d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 2529.2953811714d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 2.5292953811714E+19d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 0.2529295381d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 2.5292953811714E+29d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 9.765625E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 272.25d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 49916.282776729d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 2.7126844618381E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 9.7656640626172E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.00625d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 0.0250001d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 0.06250025d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 1.000004d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 1.000004d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 1.000004d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 39204156816.47d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 49916282776.729d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 3.90627E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 272.2510890033d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 0.0062586457d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 0.0064352183d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.003952024d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 36.1981028795d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 4.0220114311d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 3.8020443157033E+29d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquarePerch() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 25.29285264d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 2.52929E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 252928.5264d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 25292852.64d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 25292852640000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.0025292853d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.00625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 9.765625E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 30.25d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 272.25d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 39204d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.0025292853d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.2529285264d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 2529.285264d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 2.529285264E+19d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 0.2529285264d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 2.529285264E+29d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 9.765585937539E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 272.2489110011d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 49916.083111797d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 2.7126736111111E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 9.765625E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.006249975d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 0.025d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 0.0625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.999996d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 39204000000d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 49916083111.797d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 3.90625E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 272.25d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 0.0062586207d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 0.0064351925d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.0039520082d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 36.1979580872d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 4.021995343d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 3.8020291075413E+29d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquarePole() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 25.29285264d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 2.52929E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 252928.5264d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 25292852.64d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 25292852640000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.0025292853d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.00625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 9.765625E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 30.25d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 272.25d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 39204d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.0025292853d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.2529285264d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 2529.285264d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 2.529285264E+19d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 0.2529285264d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 2.529285264E+29d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 9.765585937539E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 272.2489110011d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 49916.083111797d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 2.7126736111111E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 9.765625E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.006249975d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 0.025d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 0.0625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.999996d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 39204000000d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 49916083111.797d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 3.90625E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 272.25d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 0.0062586207d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 0.0064351925d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.0039520082d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 36.1979580872d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 4.021995343d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 3.8020291075413E+29d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSquareMil() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 6.4516E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 6.4516E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 6.4516E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.00064516d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 645.16d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 6.4516E-14d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 1.5942250790736E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 2.4909766860524E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 7.716049382716E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 6.9444444444444E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 6.4516E-14d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 6.4516E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 6.4516E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 645160000d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 6.4516E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 6.4516E+18d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.4909667221557E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 6.9444166666944E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 1.2732395447352E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 6.919379683479E-18d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 2.4909766860524E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 1.5942187021796E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 6.3769003162943E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 1.5942250790736E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 2.5507601265177E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.5507499234874E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 2.5507601265177E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 2.5507601265177E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 1.2732395447d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 9.9639067442098E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 6.9444444444444E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 1.5964240102171E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 1.6414632560049E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 1.0080625E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 9.2332308150277E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 1.0259145350031E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 9.6980642473759E+18d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaCircularMil() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 0.0005067075d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 506.7074790975d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E-14d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 1.2521014491465E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 1.9564085142914E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 6.0601710138692E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 5.4541539124823E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 7.8539816339745E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E-14d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 506707479.0975d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 5.067074790975E+18d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 1.9564006886652E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 5.4541320958884E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 1.0E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 5.434468095254E-18d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 1.9564085142914E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 1.2520964407457E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 5.0084057965861E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 1.2521014491465E-12d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 2.0033623186344E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.0033543051932E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 2.0033623186344E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 2.0033623186344E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 0.7853981634d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 7.8256340571658E-16d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 5.4541539124823E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 1.2538284856281E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 1.2892022265507E-13d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 7.9173043608984E-14d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 7.2517625243475E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 8.0575139159416E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 7.6168418483995E+18d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaHomestead() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 647497.027584d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.6474970276d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 6474970275.84d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 647497027584d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 6.47497027584E+17d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 64.7497027584d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 160d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 0.25d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 774400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 6969600d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1003622400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 64.7497027584d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 6474.97027584d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 64749702.7584d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 6.47497027584E+23d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 6474.97027584d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 6.47497027584E+33d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.249999d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 6969572.1216279d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 1277851727.662d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 0.0069444444d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 0.25d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 159.9993600006d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 640d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 1600d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 25600d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 25599.897600103d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 25600d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 25600d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 1.0036224E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 1.277851727662E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 6969600d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 160.2206896552d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 164.7409292503d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 101.17141056d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 926667.72703321d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 102963.08078147d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 9.7331945153057E+33d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaSabin() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 0.09290304d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 9.290304E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 929.0304d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 92903.04d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 92903040000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 9.290304E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 2.29568E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 3.5870064279155E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 0.1111111111d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 144d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 9.290304E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.0009290304d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 9.290304d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 9.290304E+16d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 0.0009290304d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 9.290304E+26d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 3.5869920799042E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.999996d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 183.3464944419d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 9.9639067442098E-10d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 3.5870064279155E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.29567E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 9.18274E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 0.0002295684d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 0.0036730946d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0036730799d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 0.0036730946d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 0.0036730946d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 144000000d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 183346494.44186d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 1.4348025711662E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 2.29885E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 2.36371E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 1.45161E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 0.1329585237d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 0.0147731693d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.3965212516221E+27d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaArpent() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 4041.28224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.0040412822d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 40412822.4d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 4041282240d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 4.04128224E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.404128224d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.9986225895d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 0.0015603478d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 4833.3333333333d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 43500d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 6264000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.404128224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 40.4128224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 404128.224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 4.04128224E+21d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 40.4128224d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 4.04128224E+31d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0015603416d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 43499.826000174d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 7975572.5082211d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 4.3343E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 0.0015603478d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.998618595d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 3.9944903581d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 9.9862258953d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 159.7796143251d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 159.7789752073d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 159.7796143251d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 159.7796143251d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 6264000000000d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 7975572508221.1d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 0.0062413912d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 43500d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 1.0282125836d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.63145035d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 5783.6957825333d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 642.6328647259d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 6.0748674445563E+31d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaCuerda() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 3930.395625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.0039303956d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 39303956.25d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 3930395625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 3.930395625E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.3930395625d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.9712219102d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 0.0015175342d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 4700.7140455253d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 42306.426409728d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 6092125.4030008d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.3930395625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 39.30395625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 393039.5625d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 3.930395625E+21d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 39.30395625d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 3.930395625E+31d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0015175282d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 42306.257184191d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 7756734.9745863d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 4.21537E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 0.0015175342d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.9712180253d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 3.8848876409d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 9.7122191023d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 155.3955056372d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 155.3948840558d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 155.3955056372d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 155.3955056372d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 6092125403000.8d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 7756734974586.3d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 0.0060701369d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 42306.426409728d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 0.9725615267d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.6141243164d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 5625d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 625d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 5.9081823561373E+31d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaPlaza() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 6400d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 0.0064d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 64000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 6400000000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 6.4E+15d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.64d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 1.5814744414d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 0.0024710538d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 7654.3362963269d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 68889.026666942d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 9920019.8400397d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.64d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 64d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 640000d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 6.4E+21d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 64d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 6.4E+31d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0024710439d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 68888.751111111d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 12630561.544896d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 6.86404E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 0.0024710538d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 1.5814681155d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 6.3258977656d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 15.8147444139d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 253.0359106224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 253.0348984797d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 253.0359106224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 253.0359106224d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 9920019840039.7d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 12630561544896d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 0.0098842153d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 68889.026666942d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 1.5836557854d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 1.6283348066d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 9159.3832872741d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 1017.7092541416d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 9.6204989743949E+31d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaVarasCastellanasCuad() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 0.698737d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 6.98737E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 6987.37d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 698737d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 698737000000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 6.98737E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.0001726617d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 2.6978386395347E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 0.835682497d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 7.5211424728d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1083.044516089d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 6.98737E-5d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.00698737d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 69.8737d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 6.98737E+17d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 0.00698737d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 6.98737E+27d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.697827848191E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 7.5211123883d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 1378.9751065931d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 7.4939962209298E-9d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 2.6978386395347E-7d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.000172661d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 0.0006906467d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 0.0017266167d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 0.0276258677d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0276257572d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 0.0276258677d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 0.0276258677d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 1083044516.089d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 1378975106.5931d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 1.0791354558139E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 7.5211424728d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 0.0001728998d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 0.0001777778d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.0001091777d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue / 9d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 1.05034352998E+28d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaVarasConuquerasCuad() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 6.288633d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 6.288633E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 62886.33d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 6288633d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 6288633000000d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 0.0006288633d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 0.0015539551d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 2.4280547755813E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 7.5211424728d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 67.6902822556d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 9747.4006448013d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 0.0006288633d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 0.06288633d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 628.8633d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 6.288633E+18d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 0.06288633d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 6.288633E+28d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.4280450633719E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 67.6900114947d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 12410.775959338d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 6.7445965988368E-8d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 2.4280547755813E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.0015539488d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 0.0062158202d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 0.0155395506d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 0.248632809d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 0.2486318145d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 0.248632809d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 0.248632809d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 9747400644.8013d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 12410775959.338d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 9.712219102325E-6d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 67.6902822556d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 0.0015560984d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 0.0016d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 0.0009825989d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 9d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue * 9.4530917698196E+28d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void areaElectronCrossSection() {
        if (mContext.getString(R.string.string_units_list_area_square_meter).equals(toUnit)) {
            toValue = fromValue * 6.6524615999999E-29d;
        } else if (mContext.getString(R.string.string_units_list_area_square_kilometer).equals(toUnit)) {
            toValue = fromValue * 6.6524615999999E-35d;
        } else if (mContext.getString(R.string.string_units_list_area_square_centimeter).equals(toUnit)) {
            toValue = fromValue * 6.6524615999999E-25d;
        } else if (mContext.getString(R.string.string_units_list_area_square_millimeter).equals(toUnit)) {
            toValue = fromValue * 6.6524615999999E-23d;
        } else if (mContext.getString(R.string.string_units_list_area_square_micrometer).equals(toUnit)) {
            toValue = fromValue * 6.6524615999999E-17d;
        } else if (mContext.getString(R.string.string_units_list_area_hectare).equals(toUnit)) {
            toValue = fromValue * 6.6524615999999E-33d;
        } else if (mContext.getString(R.string.string_units_list_area_acre).equals(toUnit)) {
            toValue = fromValue * 1.6438590613636E-32d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile).equals(toUnit)) {
            toValue = fromValue * 2.5685297833807E-35d;
        } else if (mContext.getString(R.string.string_units_list_area_square_yard).equals(toUnit)) {
            toValue = fromValue * 7.956277857E-29d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot).equals(toUnit)) {
            toValue = fromValue * 7.1606500713E-28d;
        } else if (mContext.getString(R.string.string_units_list_area_square_inch).equals(toUnit)) {
            toValue = fromValue * 1.0311336102672E-25d;
        } else if (mContext.getString(R.string.string_units_list_area_square_hectometer).equals(toUnit)) {
            toValue = fromValue * 6.6524615999999E-33d;
        } else if (mContext.getString(R.string.string_units_list_area_square_dekameter).equals(toUnit)) {
            toValue = fromValue * 6.6524615999999E-31d;
        } else if (mContext.getString(R.string.string_units_list_area_square_decimeter).equals(toUnit)) {
            toValue = fromValue * 6.6524615999999E-27d;
        } else if (mContext.getString(R.string.string_units_list_area_square_nanometer).equals(toUnit)) {
            toValue = fromValue * 6.6524615999999E-11d;
        } else if (mContext.getString(R.string.string_units_list_area_are).equals(toUnit)) {
            toValue = fromValue * 6.6524615999999E-31d;
        } else if (mContext.getString(R.string.string_units_list_area_barn).equals(toUnit)) {
            toValue = fromValue * 0.66524616d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mile_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.5685195092718E-35d;
        } else if (mContext.getString(R.string.string_units_list_area_square_foot_us_survey).equals(toUnit)) {
            toValue = fromValue * 7.1606214287283E-28d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_inch).equals(toUnit)) {
            toValue = fromValue * 1.3128800884977E-25d;
        } else if (mContext.getString(R.string.string_units_list_area_township).equals(toUnit)) {
            toValue = fromValue * 7.1348049538352E-37d;
        } else if (mContext.getString(R.string.string_units_list_area_section).equals(toUnit)) {
            toValue = fromValue * 2.5685297833807E-35d;
        } else if (mContext.getString(R.string.string_units_list_area_acre_us_survey).equals(toUnit)) {
            toValue = fromValue * 1.643852485934E-32d;
        } else if (mContext.getString(R.string.string_units_list_area_rood).equals(toUnit)) {
            toValue = fromValue * 6.5754362454545E-32d;
        } else if (mContext.getString(R.string.string_units_list_area_square_chain).equals(toUnit)) {
            toValue = fromValue * 1.6438590613636E-31d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod).equals(toUnit)) {
            toValue = fromValue * 2.6301744981818E-30d;
        } else if (mContext.getString(R.string.string_units_list_area_square_rod_us_survey).equals(toUnit)) {
            toValue = fromValue * 2.6301639774943E-30d;
        } else if (mContext.getString(R.string.string_units_list_area_square_perch).equals(toUnit)) {
            toValue = fromValue * 2.6301744981818E-30d;
        } else if (mContext.getString(R.string.string_units_list_area_square_pole).equals(toUnit)) {
            toValue = fromValue * 2.6301744981818E-30d;
        } else if (mContext.getString(R.string.string_units_list_area_square_mil).equals(toUnit)) {
            toValue = fromValue * 1.0311336102672E-19d;
        } else if (mContext.getString(R.string.string_units_list_area_circular_mil).equals(toUnit)) {
            toValue = fromValue * 1.3128800884977E-19d;
        } else if (mContext.getString(R.string.string_units_list_area_homestead).equals(toUnit)) {
            toValue = fromValue * 1.0274119133523E-34d;
        } else if (mContext.getString(R.string.string_units_list_area_sabin).equals(toUnit)) {
            toValue = fromValue * 7.1606500713E-28d;
        } else if (mContext.getString(R.string.string_units_list_area_arpent).equals(toUnit)) {
            toValue = fromValue * 1.6461264531724E-32d;
        } else if (mContext.getString(R.string.string_units_list_area_cuerda).equals(toUnit)) {
            toValue = fromValue * 1.6925679332853E-32d;
        } else if (mContext.getString(R.string.string_units_list_area_plaza).equals(toUnit)) {
            toValue = fromValue * 1.039447125E-32d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_castellanas_cuad).equals(toUnit)) {
            toValue = fromValue * 9.5206946247299E-29d;
        } else if (mContext.getString(R.string.string_units_list_area_varas_conuqueras_cuad).equals(toUnit)) {
            toValue = fromValue * 1.0578549583033E-29d;
        } else if (mContext.getString(R.string.string_units_list_area_electron_cross_section).equals(toUnit)) {
            toValue = fromValue;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }
}