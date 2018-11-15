package com.example.marcus.electricalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Float.valueOf;

public class InputActivity extends AppCompatActivity {

    //  MainElectric now = new MainElectric();
    int z = MainElectric.x;
    int dauer = 0;

    TextView input1;
    TextView input2;
    TextView input3;
    TextView output;
    TextView lblInput1;
    TextView lblInput2;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input);
        lblInput1 = findViewById(R.id.id_txt_input1);
        lblInput2 = findViewById(R.id.id_txt_input2);
        input1 = findViewById(R.id.id_edTxt_input1);
        input2 = findViewById(R.id.id_edTxt_input2);
        input3 = findViewById(R.id.id_edTxt_input3);
        output = findViewById(R.id.id_txt_result);
        btnCalc = findViewById(R.id.id_btn_calc);
        btnCalc.setOnClickListener(clickListener);
        if(z==1) {
            lblInput1.setText("Widerstand in Ohm");
            lblInput2.setText("Strom in Ampere");
        } else if(z==2) {
            lblInput1.setText("Spannung in Volt");
            lblInput2.setText("Widerstand in Ohm");
        } else {
            lblInput1.setText("Spannung in Volt");
            lblInput2.setText("Strom in Ampere");
        }
    }

    public final View.OnClickListener clickListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            //Intent intent = new Intent(InputActivity.this, InputActivity.class);
            switch (view.getId()) {
                case R.id.id_btn_calc:
                    if (z == 1) {
                        float in1MalIn2 = (Float.valueOf(input2.getText().toString())) * (Float.valueOf(input1.getText().toString())); // u = r * i
                        output.setText(Float.toString(in1MalIn2) + " Volt"); //(String.valueOf(spannung));
                    } else if (z == 2) {
                        float strom = (Float.valueOf(input1.getText().toString())) / (Float.valueOf(input2.getText().toString())); // i = u / r
                        output.setText(Float.toString(strom) + " Ampere"); //(String.valueOf(strom));
                    } else if (z == 3) {
                        float widerstand = (Float.valueOf(input2.getText().toString())) / (Float.valueOf(input1.getText().toString())); // r = u / i
                        output.setText(Float.toString(widerstand) + " Ohm"); //(String.valueOf(widerstand));
                    } else if (z == 4) {
                        float leistung = (Float.valueOf(input2.getText().toString())) * (Float.valueOf(input1.getText().toString())); // p = u * i
                        output.setText(Float.toString(leistung) + " Watt"); //(String.valueOf(leistung));
                    } else {
                        int dauer = Integer.valueOf(input3.getText().toString());
                        float arbeit = (Float.valueOf(input2.getText().toString())) * (Float.valueOf(input1.getText().toString())) * ((dauer)/60); // p = u * i * t
                        output.setText(Float.toString(arbeit) + " kWh"); //(String.valueOf(arbeit));
                    }
                    break;
                default:
                    break;
            }
        }
    };
}
