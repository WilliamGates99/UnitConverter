package com.realbarrel.unitconverter;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.realbarrel.unitconverter.database.DataSource;
import com.realbarrel.unitconverter.fragments.FavoritesFragment;
import com.realbarrel.unitconverter.fragments.MoreFragment;
import com.realbarrel.unitconverter.fragments.QuantitiesFragment;

public class MainActivity extends AppCompatActivity {

    public static final String DEVICE_INFORMATION = "Device model: " +
            Build.MODEL + "\nAndroid version: " + Build.VERSION.RELEASE;
    public static String APP_VERSION;
    public static String BACK_FROM_CHILD_KEY = "quantities_fragment";

    private AHBottomNavigation bottomNavigationView;
    private DataSource mDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        bottomNavigationView();
        mDataSource = new DataSource(this);
        mDataSource.open();
        fragmentsSwitch();

        try {
            APP_VERSION = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        mDataSource.close();
    }

    @Override
    public void onResume() {
        super.onResume();
        mDataSource.open();
    }

    private void bottomNavigationView() {
        bottomNavigationView = findViewById(R.id.bnv_main);
        bottomNavigationView.setDefaultBackgroundColor(Color.WHITE);
        bottomNavigationView.setAccentColor(ContextCompat.getColor(this, R.color.colorAccent));
        bottomNavigationView.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);

        bottomNavigationView.addItem(new AHBottomNavigationItem(
                getString(R.string.string_main_bnv_quantities), R.drawable.ic_bnv_quantities));
        bottomNavigationView.addItem(new AHBottomNavigationItem(
                getString(R.string.string_main_bnv_favorites), R.drawable.ic_bnv_favorites));
        bottomNavigationView.addItem(new AHBottomNavigationItem(
                getString(R.string.string_main_bnv_more), R.drawable.ic_bnv_more));

        bottomNavigationView.setCurrentItem(0);

        bottomNavigationView.setOnTabSelectedListener((position, wasSelected) -> {
            switch (position) {
                case 0:
                    getSupportFragmentManager().beginTransaction().replace(
                            R.id.fl_main, new QuantitiesFragment(), "quantities_fragment").commit();
                    setTitle(R.string.app_name);
                    return true;
                case 1:
                    getSupportFragmentManager().beginTransaction().replace(
                            R.id.fl_main, new FavoritesFragment(), "favorites_fragment").commit();
                    setTitle(R.string.string_main_bnv_favorites);
                    return true;
                case 2:
                    getSupportFragmentManager().beginTransaction().replace(
                            R.id.fl_main, new MoreFragment(), "more_fragment").commit();
                    setTitle(R.string.string_main_bnv_more);
                    return true;
                default:
                    return false;
            }
        });
    }

    private void fragmentsSwitch() {
        switch (BACK_FROM_CHILD_KEY) {
            case "quantities_fragment":
                getSupportFragmentManager().beginTransaction().replace(
                        R.id.fl_main, new QuantitiesFragment(), "quantities_fragment").commit();
                setTitle(R.string.app_name);
                bottomNavigationView.setCurrentItem(0);
                BACK_FROM_CHILD_KEY = "quantities_fragment";
                break;
            case "favorites_fragment":
                getSupportFragmentManager().beginTransaction().replace(
                        R.id.fl_main, new FavoritesFragment(), "favorites_fragment").commit();
                setTitle(R.string.string_main_bnv_favorites);
                bottomNavigationView.setCurrentItem(1);
                BACK_FROM_CHILD_KEY = "quantities_fragment";
                break;
            case "more_fragment":
                getSupportFragmentManager().beginTransaction().replace(
                        R.id.fl_main, new MoreFragment(), "more_fragment").commit();
                setTitle(R.string.string_main_bnv_more);
                bottomNavigationView.setCurrentItem(2);
                BACK_FROM_CHILD_KEY = "quantities_fragment";
                break;
        }
    }
}