package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText inputAmountView = (EditText) findViewById(R.id.inputAmountText);
        String inputAmountStr = inputAmountView.getText().toString();
        double conversionRate = 1.3;
        double inputAmountDouble = Double.parseDouble(inputAmountStr);
        double conversionResult = conversionRate * inputAmountDouble;
        String outputStr = "£" + String.format("%.2f", inputAmountDouble) + " is $" + String.format("%.2f", conversionResult);
        Toast.makeText(this, outputStr, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}