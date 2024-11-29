package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etWeight = findViewById(R.id.etWeight);
        EditText etHeight = findViewById(R.id.etHeight);
        Button btnCalculate = findViewById(R.id.btnCalculate);
        TextView tvResult = findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weightStr = etWeight.getText().toString();
                String heightStr = etHeight.getText().toString();

                if (weightStr.isEmpty() || heightStr.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter valid inputs", Toast.LENGTH_SHORT).show();
                    return;
                }

                double weight = Double.parseDouble(weightStr);
                double height = Double.parseDouble(heightStr);

                if (height <= 0 || weight <= 0) {
                    Toast.makeText(MainActivity.this, "Height and weight must be greater than zero", Toast.LENGTH_SHORT).show();
                    return;
                }

                double bmi = weight / (height * height);
                String category;

                if (bmi < 18.5) {
                    category = "Underweight";
                } else if (bmi < 24.9) {
                    category = "Normal weight";
                } else if (bmi < 29.9) {
                    category = "Overweight";
                } else if (bmi < 34.9) {
                    category = "Obese Class I";
                } else if (bmi < 39.9) {
                    category = "Obese Class II";
                } else {
                    category = "Obese Class III";
                }

                String result = String.format("Your BMI: %.2f\nCategory: %s", bmi, category);
                tvResult.setText(result);
            }
        });
    }
}
