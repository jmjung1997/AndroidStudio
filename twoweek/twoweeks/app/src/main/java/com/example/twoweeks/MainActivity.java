package com.example.twoweeks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button button1;
    Button mbtn_url;
    EditText editText1;

    private RadioGroup rg;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mbtn_url=findViewById(R.id.button2);
        button1=(Button) findViewById((R.id.button1));
        editText1=(EditText) findViewById(R.id.editText1);
        rg=(RadioGroup)findViewById(R.id.radiogroup);
        img=(ImageView)findViewById(R.id.radioButton2_image);
        mbtn_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com"));
                        startActivity(urlintent);
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                String result;
                if (checkedId==R.id.radioButton){
                    img.setImageResource(R.drawable.image11);
                }
                else if(checkedId==R.id.radioButton2){
                    img.setImageResource(R.drawable.android12);
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {



                Toast.makeText(getApplicationContext(),editText1.getText()
                        ,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
