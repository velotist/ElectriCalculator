package com.example.marcus.electricalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainElectric extends AppCompatActivity {

    static int x = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_electric);
        Button btnVolt = findViewById(R.id.id_btn_volt);
        Button btnAmpere = findViewById(R.id.id_btn_ampere);
        Button btnOhm = findViewById(R.id.id_btn_ohm);
        Button btnWatt = findViewById(R.id.id_btn_watt);
        Button btnKwh = findViewById(R.id.id_btn_kwh);
        btnVolt.setOnClickListener(clickListener);
        btnAmpere.setOnClickListener(clickListener);
        btnOhm.setOnClickListener(clickListener);
        btnWatt.setOnClickListener(clickListener);
        btnKwh.setOnClickListener(clickListener);
    }

    public final View.OnClickListener clickListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainElectric.this, InputActivity.class);
            switch (view.getId()) {
                case R.id.id_btn_volt:
                    x = 1;
                    startActivity(intent);
                    break;
                case R.id.id_btn_ampere:
                    x = 2;
                    startActivity(intent);
                    break;
                case R.id.id_btn_ohm:
                    x = 3;
                    startActivity(intent);
                    break;
                case R.id.id_btn_watt:
                    x = 4;
                    startActivity(intent);
                    break;
                case R.id.id_btn_kwh:
                    x = 5;
                    startActivity(intent);
                    break;
                default:
                    break;
            }
        }
    };
}
