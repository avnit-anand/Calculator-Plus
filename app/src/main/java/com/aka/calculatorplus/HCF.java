package com.aka.calculatorplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HCF extends AppCompatActivity {
    EditText firstNumber,secondNumber;
    TextView result;
    Button hcf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hcf);

        getSupportActionBar().hide();

        firstNumber = findViewById(R.id.etFirstNumber);
        secondNumber = findViewById(R.id.etSecondNumber);
        result = findViewById(R.id.tvResult);
        hcf = findViewById(R.id.btnHCF);

        hcf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNum , secondNum, ans;

                firstNum = Integer.parseInt(firstNumber.getText().toString());
                secondNum = Integer.parseInt(secondNumber.getText().toString());
                int min;
                if(firstNum>secondNum){
                    min=secondNum;
                }else{
                    min=firstNum;
                }

                ans=1;

                for(int i=2 ; i<=min;i++){
                    if(firstNum%i==0 && secondNum%i==0){
                        ans=i;
                    }
                }
                result.setText("HCF is : "+ans);
            }
        });



    }
}