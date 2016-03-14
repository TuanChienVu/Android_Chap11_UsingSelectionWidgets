package com.vutuanchien.android_chap11_autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    TextView tvSelection;
    AutoCompleteTextView singleComplete;
    MultiAutoCompleteTextView multiComplete;
    String[] cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSelection = (TextView) findViewById(R.id.tvSelection);
        singleComplete = (AutoCompleteTextView) findViewById(R.id.edSingleAuto);
        multiComplete = (MultiAutoCompleteTextView) findViewById(R.id.edMultiAuto);
        cities = getResources().getStringArray(R.array.cities_array);
        singleComplete.addTextChangedListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, cities);
        singleComplete.setAdapter(adapter);
        multiComplete.setAdapter(adapter);
        multiComplete.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

        tvSelection.setText(singleComplete.getText());
//        tvSelection.setText(multiComplete.getText());
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
