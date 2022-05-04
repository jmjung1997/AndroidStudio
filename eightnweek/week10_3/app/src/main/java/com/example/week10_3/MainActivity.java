package com.example.week10_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   setTitle("메인 엑티비티 ");

   Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
    btnNewActivity.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            EditText edtNum1 = (EditText) findViewById(R.id.edtNum1);
            EditText edtNum2 = (EditText) findViewById(R.id.edtNum2);
            Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
            intent.putExtra("Num1", Integer.parseInt(edtNum1.getText().toString()));
            intent.putExtra("Num2", Integer.parseInt(edtNum2.getText().toString()));
            startActivityForResult(intent, 0);
        }
    });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            int hap = data.getIntExtra("Hap", 0);
            Toast.makeText(getApplicationContext(), "결과 :" + hap,
                    Toast.LENGTH_SHORT).show();
        }
    }
}