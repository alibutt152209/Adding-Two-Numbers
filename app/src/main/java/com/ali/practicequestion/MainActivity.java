package com.ali.practicequestion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtGoodmorning, showAnswer;
    EditText editText1, editText2;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtGoodmorning = findViewById(R.id.txtgoodmorning);
        editText1 = findViewById(R.id.editTxt1);
        editText2 = findViewById(R.id.editTxt2);
        calculate = findViewById(R.id.calculate);
        showAnswer = findViewById(R.id.txtView);

        txtGoodmorning.setText("Good Morning");

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String s1 = editText1.getText().toString();
//                String s2 = editText2.getText().toString();
//                double val1 = Integer.parseInt(s1);
//                double val2 = Integer.parseInt(s2);
//                double val1 = Integer.parseInt(editText1.getText().toString());
//                double val2 = Integer.parseInt(editText2.getText().toString());
//                double calculatedValue = val1 + val2;
                double calculatedValue = Integer.parseInt(editText1.getText().toString()) + Integer.parseInt(editText2.getText().toString());
                showAnswer.setText("The answer is: " + calculatedValue);
            }
        });
    }
}