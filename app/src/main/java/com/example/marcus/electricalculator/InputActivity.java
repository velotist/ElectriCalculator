package com.example.marcus.electricalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        TextView input1 = findViewById(R.id.id_txtView_input1);
        TextView input2 = findViewById(R.id.id_txtView_input2);

    }
}
