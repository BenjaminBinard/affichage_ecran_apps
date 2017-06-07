package com.example.root.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.util.Log;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private ToggleButton monbouton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test();
    }

    public void test() {
        monbouton = (ToggleButton) findViewById(R.id.id_test);
        monbouton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Log.d(TAG, "Le bouton est allume");
                } else {
                    Log.d(TAG, "Le bouton est eteint");
                }
            }
        });
    }
}
