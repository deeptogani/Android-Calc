package com.example.practical5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    int n1 = 0, n2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb);

        Button add = findViewById(R.id.addBtn);
        Button sub = findViewById(R.id.subBtn);
        Button mul = findViewById(R.id.mulBtn);
        Button div = findViewById(R.id.divBtn);
        Button clear = findViewById(R.id.clearBtn);

        TextInputEditText num1 = findViewById(R.id.num1);
        TextInputEditText num2 = findViewById(R.id.num2);

        TextView resultText = findViewById(R.id.resultView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().equals("") || num2.getText().toString().equals("")){
                    resultText.setText("LOL....");
                    return;
                }

                n1 = Integer.parseInt(num1.getText().toString());

                n2 = Integer.parseInt(num2.getText().toString());

                resultText.setText("Addition is " + (n1+n2));

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().equals("") || num2.getText().toString().equals("")){
                    resultText.setText("LOL....");
                    return;
                }

                n1 = Integer.parseInt(num1.getText().toString());

                n2 = Integer.parseInt(num2.getText().toString());

                resultText.setText("Subtraction is " + (n1-n2));

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().equals("") || num2.getText().toString().equals("")){
                    resultText.setText("LOL....");
                    return;
                }

                n1 = Integer.parseInt(num1.getText().toString());

                n2 = Integer.parseInt(num2.getText().toString());

                resultText.setText("Multiplication is " + (n1*n2));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().equals("") || num2.getText().toString().equals("")){
                    resultText.setText("LOL....");
                    return;
                }

                n1 = Integer.parseInt(num1.getText().toString());

                n2 = Integer.parseInt(num2.getText().toString());

                resultText.setText("Division is " + (n1/n2));

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");

            }
        });


    }
}