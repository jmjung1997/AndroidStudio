package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnDivrest;
    TextView textResult;
    String num1, num2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnDivrest=(Button) findViewById(R.id.Divrest);
        textResult = (TextView) findViewById(R.id.TextResult);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if((num1.trim().equals("")) || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값을 넣어주세요", Toast.LENGTH_SHORT).show();
                }
                else{

                    result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    textResult.setText("계산결과 : " + result.toString());
                }
            }
        });


        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if((num1.trim().equals("")) || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값을 넣어주세요", Toast.LENGTH_SHORT).show();
                }
                else{

                    result = Integer.parseInt(num1)-Integer.parseInt(num2);
                    textResult.setText("계산결과 : " + result.toString());
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if((num1.trim().equals("")) || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값을 넣어주세요", Toast.LENGTH_SHORT).show();
                }
                else{

                    result = Integer.parseInt(num1) *Integer.parseInt(num2);
                    textResult.setText("계산결과 : " + result.toString());
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if((num1.trim().equals("")) || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값을 넣어주세요", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(num2.trim().equals("0")){
                        Toast.makeText(getApplicationContext(), "0으로 나누면 안됩니다.", Toast.LENGTH_SHORT).show();
                    }else{

                        result = Integer.parseInt(num1) / Integer.parseInt(num2);
                        textResult.setText("계산결과 : " + result.toString());
                    }
                }
            }
        });
        btnDivrest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if((num1.trim().equals("")) || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값을 넣어주세요", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(num2.trim().equals("0")){
                        Toast.makeText(getApplicationContext(), "0으로 나누면 안됩니다.", Toast.LENGTH_SHORT).show();
                    }else{

                        result = Integer.parseInt(num1) % Integer.parseInt(num2);
                        textResult.setText("계산결과 : " + result.toString());
                    }
                }
            }
        });
    }
}