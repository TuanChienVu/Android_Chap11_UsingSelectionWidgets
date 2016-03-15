package com.vutuanchien.android_chap11_spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] countryName = {"Argentina", "Canada", "Japan", "Korea", "Vatican", "Vietnam"};
    int[] flags = {R.drawable.argentina, R.drawable.canada, R.drawable.japan, R.drawable.korea, R.drawable.vatican_city, R.drawable.vietnam};

    Spinner simpleSpinner;
    Spinner customSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customSpinner = (Spinner) findViewById(R.id.customSpinner);
        simpleSpinner = (Spinner) findViewById(R.id.simpleSpinner);

        ArrayAdapter<String> simpleAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, countryName);
        simpleAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        simpleSpinner.setAdapter(simpleAdapter);

        CustomAdapter adapter = new CustomAdapter(getBaseContext(), flags, countryName);
        customSpinner.setAdapter(adapter);
        customSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), countryName[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        simpleSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), countryName[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
