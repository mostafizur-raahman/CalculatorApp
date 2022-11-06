package com.mostafiz.textapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number1,number2;
    TextView result;
    String num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.Text1);
        number2 = findViewById(R.id.Text2);
        result = findViewById(R.id.showResult);



    }

    private void getDataFromEditText(){
        num1 = number1.getText().toString();
        num2 = number2.getText().toString();
    }

    public void add(View view) {
        getDataFromEditText();
        cheakNull(0);
    }

    private void cheakNull(int i) {
        if ( num1.isEmpty() ) Toast.makeText(this, "Enter first number", Toast.LENGTH_SHORT).show();
        else if ( num2.isEmpty() ) Toast.makeText(this, "Enter second number", Toast.LENGTH_SHORT).show();
        else{
            switch (i){
                case 0:
                    double res = Double.parseDouble(num1) + Double.parseDouble(num2);
                    result.setText(String.valueOf(res));
                    break;
                case 1:
                    double res1 = Double.parseDouble(num1) - Double.parseDouble(num2);
                    result.setText(String.valueOf(res1));
                    break;
                case 2:
                    double res2 = Double.parseDouble(num1) * Double.parseDouble(num2);
                    result.setText(String.valueOf(res2));
                    break;
                case 3:
                    double res3 = Double.parseDouble(num1) / Double.parseDouble(num2);
                    result.setText(String.valueOf(res3));
                    break;
            }
        }
    }

    public void sub(View view) {
        getDataFromEditText();
        cheakNull(1);
    }

    public void mul(View view) {
        getDataFromEditText();
        cheakNull(2);
    }

    public void div(View view) {
        getDataFromEditText();
        cheakNull(3);
    }
}