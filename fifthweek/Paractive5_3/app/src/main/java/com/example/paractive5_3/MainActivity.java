package com.example.paractive5_3;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit;
    Button btn;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT
        );
        setTitle("Practice 5_3 2018038067정재민");
        LinearLayout linear=new LinearLayout(this);
        linear.setOrientation(LinearLayout.VERTICAL);
        setContentView(linear,params);

        edit=new EditText(this);
        edit.setHint("입력하세요");
        linear.addView(edit);
        btn=new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.rgb(150,150,0));
        linear.addView(btn);
        text=new TextView(this);
        text.setTextSize(30);
        text.setTextColor(Color.MAGENTA);
        linear.addView(text);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sentence;
                sentence=edit.getText().toString();
                text.setText(sentence);
            }
        });
    }
}