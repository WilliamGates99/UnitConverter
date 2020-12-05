package com.realbarrel.unitconverter.converters;

import android.content.Context;
import android.widget.TextView;

import com.realbarrel.unitconverter.R;

public class TemperatureConverter {

    private final Context mContext;
    private final String fromUnit;
    private final String toUnit;
    private final double fromValue;
    private double toValue;
    private final TextView mToNumberTV;

    public TemperatureConverter(Context context, String fromUnit, String toUnit, double fromValue,
                                double toValue, TextView toNumberTV) {
        this.mContext = context;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.mToNumberTV = toNumberTV;
    }

    public void convert() {
        if (mContext.getString(R.string.string_units_list_temperature_celsius).equals(fromUnit)) {
            temperatureCelsius();
        } else if (mContext.getString(R.string.string_units_list_temperature_fahrenheit).equals(fromUnit)) {
            temperatureFahrenheit();
        } else if (mContext.getString(R.string.string_units_list_temperature_kelvin).equals(fromUnit)) {
            temperatureKelvin();
        } else if (mContext.getString(R.string.string_units_list_temperature_rankine).equals(fromUnit)) {
            temperatureRankine();
        } else if (mContext.getString(R.string.string_units_list_temperature_newton).equals(fromUnit)) {
            temperatureNewton();
        } else if (mContext.getString(R.string.string_units_list_temperature_reaumur).equals(fromUnit)) {
            temperatureReaumur();
        } else if (mContext.getString(R.string.string_units_list_temperature_romer).equals(fromUnit)) {
            temperatureRomer();
        } else if (mContext.getString(R.string.string_units_list_temperature_delisle).equals(fromUnit)) {
            temperatureDelisle();
        }
    }

    private void temperatureCelsius() {
        if (mContext.getString(R.string.string_units_list_temperature_celsius).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_temperature_fahrenheit).equals(toUnit)) {
            toValue = (fromValue * 1.8d) + 32d;
        } else if (mContext.getString(R.string.string_units_list_temperature_kelvin).equals(toUnit)) {
            toValue = fromValue + 273.15d;
        } else if (mContext.getString(R.string.string_units_list_temperature_rankine).equals(toUnit)) {
            toValue = (fromValue * 1.8d) + 491.67d;
        } else if (mContext.getString(R.string.string_units_list_temperature_newton).equals(toUnit)) {
            toValue = fromValue * 0.33d;
        } else if (mContext.getString(R.string.string_units_list_temperature_reaumur).equals(toUnit)) {
            toValue = fromValue * 0.8d;
        } else if (mContext.getString(R.string.string_units_list_temperature_romer).equals(toUnit)) {
            toValue = (fromValue * 0.525d) + 7.5d;
        } else if (mContext.getString(R.string.string_units_list_temperature_delisle).equals(toUnit)) {
            toValue = (fromValue * 1.5d) - 100d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void temperatureFahrenheit() {
        if (mContext.getString(R.string.string_units_list_temperature_celsius).equals(toUnit)) {
            toValue = (fromValue - 32d) / 1.8d;
        } else if (mContext.getString(R.string.string_units_list_temperature_fahrenheit).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_temperature_kelvin).equals(toUnit)) {
            toValue = ((fromValue - 32d) / 1.8d) + 273.15d;
        } else if (mContext.getString(R.string.string_units_list_temperature_rankine).equals(toUnit)) {
            toValue = (fromValue - 32d) + 491.67d;
        } else if (mContext.getString(R.string.string_units_list_temperature_newton).equals(toUnit)) {
            toValue = (fromValue - 32d) * 0.18333d;
        } else if (mContext.getString(R.string.string_units_list_temperature_reaumur).equals(toUnit)) {
            toValue = (fromValue - 32d) * 0.44444d;
        } else if (mContext.getString(R.string.string_units_list_temperature_romer).equals(toUnit)) {
            toValue = ((fromValue - 32d) * 0.29167d) + 7.50d;
        } else if (mContext.getString(R.string.string_units_list_temperature_delisle).equals(toUnit)) {
            toValue = ((fromValue - 32d) * 0.83333d) - 100d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void temperatureKelvin() {
        if (mContext.getString(R.string.string_units_list_temperature_celsius).equals(toUnit)) {
            toValue = fromValue - 273.15d;
        } else if (mContext.getString(R.string.string_units_list_temperature_fahrenheit).equals(toUnit)) {
            toValue = ((fromValue * -273.15d) * 1.8) + 32d;
        } else if (mContext.getString(R.string.string_units_list_temperature_kelvin).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_temperature_rankine).equals(toUnit)) {
            toValue = ((fromValue * -273.15d) * 1.8d) + 491.67d;
        } else if (mContext.getString(R.string.string_units_list_temperature_newton).equals(toUnit)) {
            toValue = (fromValue * -273.15d) * 0.33d;
        } else if (mContext.getString(R.string.string_units_list_temperature_reaumur).equals(toUnit)) {
            toValue = (fromValue - 273.15d) * 0.8d;
        } else if (mContext.getString(R.string.string_units_list_temperature_romer).equals(toUnit)) {
            toValue = ((fromValue - 273.15d) * 0.525d) + 7.5d;
        } else if (mContext.getString(R.string.string_units_list_temperature_delisle).equals(toUnit)) {
            toValue = ((fromValue * -273.15d) * 1.5d) - 100d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void temperatureRankine() {
        if (mContext.getString(R.string.string_units_list_temperature_celsius).equals(toUnit)) {
            toValue = (fromValue - 491.67d) / 1.8d;
        } else if (mContext.getString(R.string.string_units_list_temperature_fahrenheit).equals(toUnit)) {
            toValue = (fromValue - 491.67d) + 32d;
        } else if (mContext.getString(R.string.string_units_list_temperature_kelvin).equals(toUnit)) {
            toValue = ((fromValue - 491.67) / 1.8d) + 273.15d;
        } else if (mContext.getString(R.string.string_units_list_temperature_rankine).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_temperature_newton).equals(toUnit)) {
            toValue = (fromValue - 491.67d) * 0.18333d;
        } else if (mContext.getString(R.string.string_units_list_temperature_reaumur).equals(toUnit)) {
            toValue = (fromValue - 491.67d) * 0.44444d;
        } else if (mContext.getString(R.string.string_units_list_temperature_romer).equals(toUnit)) {
            toValue = ((fromValue - 491.67d) * 0.29167d) + 7.5d;
        } else if (mContext.getString(R.string.string_units_list_temperature_delisle).equals(toUnit)) {
            toValue = ((fromValue - 491.67d) * 0.83333d) - 100d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void temperatureNewton() {
        if (mContext.getString(R.string.string_units_list_temperature_celsius).equals(toUnit)) {
            toValue = fromValue / 0.33d;
        } else if (mContext.getString(R.string.string_units_list_temperature_fahrenheit).equals(toUnit)) {
            toValue = (fromValue * 5.4545d) + 32d;
        } else if (mContext.getString(R.string.string_units_list_temperature_kelvin).equals(toUnit)) {
            toValue = (fromValue / 0.33d) + 273.15d;
        } else if (mContext.getString(R.string.string_units_list_temperature_rankine).equals(toUnit)) {
            toValue = (fromValue * 5.4545d) + 491.67d;
        } else if (mContext.getString(R.string.string_units_list_temperature_newton).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_temperature_reaumur).equals(toUnit)) {
            toValue = fromValue * 2.4242d;
        } else if (mContext.getString(R.string.string_units_list_temperature_romer).equals(toUnit)) {
            toValue = (fromValue * 1.5909d) + 7.5d;
        } else if (mContext.getString(R.string.string_units_list_temperature_delisle).equals(toUnit)) {
            toValue = (fromValue * 4.5455d) - 100d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void temperatureReaumur() {
        if (mContext.getString(R.string.string_units_list_temperature_celsius).equals(toUnit)) {
            toValue = fromValue / 0.8d;
        } else if (mContext.getString(R.string.string_units_list_temperature_fahrenheit).equals(toUnit)) {
            toValue = (fromValue * 2.25d) + 32d;
        } else if (mContext.getString(R.string.string_units_list_temperature_kelvin).equals(toUnit)) {
            toValue = (fromValue / 0.8d) + 273.15d;
        } else if (mContext.getString(R.string.string_units_list_temperature_rankine).equals(toUnit)) {
            toValue = (fromValue * 2.25d) + 491.67d;
        } else if (mContext.getString(R.string.string_units_list_temperature_newton).equals(toUnit)) {
            toValue = fromValue * 0.4125d;
        } else if (mContext.getString(R.string.string_units_list_temperature_reaumur).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_temperature_romer).equals(toUnit)) {
            toValue = (fromValue * 0.65625d) + 7.5d;
        } else if (mContext.getString(R.string.string_units_list_temperature_delisle).equals(toUnit)) {
            toValue = (fromValue * 1.875d) - 100d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void temperatureRomer() {
        if (mContext.getString(R.string.string_units_list_temperature_celsius).equals(toUnit)) {
            toValue = (fromValue - 7.5d) / 0.525d;
        } else if (mContext.getString(R.string.string_units_list_temperature_fahrenheit).equals(toUnit)) {
            toValue = ((fromValue - 7.5d) * 3.4286d) + 32d;
        } else if (mContext.getString(R.string.string_units_list_temperature_kelvin).equals(toUnit)) {
            toValue = ((fromValue - 7.5d) / 0.525d) + 273.15d;
        } else if (mContext.getString(R.string.string_units_list_temperature_rankine).equals(toUnit)) {
            toValue = ((fromValue - 7.5d) * 3.4286d) + 491.67d;
        } else if (mContext.getString(R.string.string_units_list_temperature_newton).equals(toUnit)) {
            toValue = (fromValue - 7.5d) * 0.62857d;
        } else if (mContext.getString(R.string.string_units_list_temperature_reaumur).equals(toUnit)) {
            toValue = (fromValue - 7.5d) * 1.5238d;
        } else if (mContext.getString(R.string.string_units_list_temperature_romer).equals(toUnit)) {
            toValue = fromValue;
        } else if (mContext.getString(R.string.string_units_list_temperature_delisle).equals(toUnit)) {
            toValue = ((fromValue - 7.5d) * 2.8571d) - 100d;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }

    private void temperatureDelisle() {
        if (mContext.getString(R.string.string_units_list_temperature_celsius).equals(toUnit)) {
            toValue = (fromValue + 100d) / 1.5d;
        } else if (mContext.getString(R.string.string_units_list_temperature_fahrenheit).equals(toUnit)) {
            toValue = ((fromValue + 100d) * 1.2d) + 32d;
        } else if (mContext.getString(R.string.string_units_list_temperature_kelvin).equals(toUnit)) {
            toValue = ((fromValue + 100d) / 1.5d) + 273.15d;
        } else if (mContext.getString(R.string.string_units_list_temperature_rankine).equals(toUnit)) {
            toValue = ((fromValue + 100d) * 1.2d) + 491.67d;
        } else if (mContext.getString(R.string.string_units_list_temperature_newton).equals(toUnit)) {
            toValue = (fromValue + 100d) * 0.22d;
        } else if (mContext.getString(R.string.string_units_list_temperature_reaumur).equals(toUnit)) {
            toValue = (fromValue + 100d) * 0.53333d;
        } else if (mContext.getString(R.string.string_units_list_temperature_romer).equals(toUnit)) {
            toValue = ((fromValue + 100d) * 0.35d) + 7.5d;
        } else if (mContext.getString(R.string.string_units_list_temperature_delisle).equals(toUnit)) {
            toValue = fromValue;
        }

        mToNumberTV.setText(String.valueOf(toValue));
    }
}