package com.example.andpicture;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    Switch switch1;
    RadioGroup radiogroup;
    RadioButton radiobutton,radiobutton2,radiobutton3;
    Button button1,button2;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.text1);
        switch1=(Switch) findViewById(R.id.switch1);

        text2 = (TextView) findViewById(R.id.text2);
        radiogroup=(RadioGroup) findViewById(R.id.radioGroup);
        radiobutton = (RadioButton) findViewById(R.id.radiobutton);
        radiobutton2 = (RadioButton) findViewById(R.id.radiobutton2);
        radiobutton3 = (RadioButton) findViewById(R.id.radiobutton3);

        button1 = (Button) findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        imageView = (ImageView) (findViewById(R.id.imageView));

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    text2.setVisibility(View.VISIBLE);
                    radiogroup.setVisibility(View.VISIBLE);
                    button1.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                }else{
                    text2.setVisibility(View.INVISIBLE);
                    radiogroup.setVisibility(View.INVISIBLE);
                    button1.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                    imageView.setVisibility(View.INVISIBLE);
                }
            }
        });
        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                String result;
                if(i==R.id.radiobutton){
                    imageView.setImageResource(R.drawable.android10);
                }
                else if(i==R.id.radiobutton2){
                    imageView.setImageResource(R.drawable.android11);
                }
                else if(i==R.id.radiobutton3){
                    imageView.setImageResource(R.drawable.android12);
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("정말로 종료하시겠습니까?");
                builder.setTitle("종료")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("종료");
                alert.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch1.setChecked(false);
                radiobutton.setChecked(false);
                radiobutton2.setChecked(false);
                radiobutton3.setChecked(false);
                imageView.setImageBitmap(null);
            }
        });
    }
}

