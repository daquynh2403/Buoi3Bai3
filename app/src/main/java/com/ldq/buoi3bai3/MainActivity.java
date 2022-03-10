package com.ldq.buoi3bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoText = findViewById(R.id.autoComplete);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,COUNTRIES);
        autoText.setAdapter(adapter);
    }

    private static final String[] COUNTRIES = new String[]{
            "Autralia","China","US","England","Germany","Spain","Japan","Korea","NewZeland","VietNam"
    };
}