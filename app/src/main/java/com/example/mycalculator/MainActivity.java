package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView resultField, operationField;
    Button b7, b8, b9, bslesh, b4, b5, b6, bastx, b1, b2, b3, bminus, b0, bstoraket, bplyus, bhavasar, c;
    EditText numberField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultField = findViewById(R.id.resultField);
        operationField = findViewById(R.id.operationField);
        numberField = findViewById(R.id.numberField);

        c = findViewById(R.id.c);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);

        bhavasar = findViewById(R.id.bhavasar);
        bslesh = findViewById(R.id.bslesh);
        bastx = findViewById(R.id.bastx);
        bplyus = findViewById(R.id.bplyus);
        bminus = findViewById(R.id.bminus);
        bstoraket = findViewById(R.id.bstoraket);

        c.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);

        bhavasar.setOnClickListener(this);
        bslesh.setOnClickListener(this);
        bminus.setOnClickListener(this);
        bastx.setOnClickListener(this);
        bplyus.setOnClickListener(this);
        bstoraket.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.b1:
                numberField.setText(numberField.getText() + "1");

                break;
            case R.id.b2:
                numberField.setText(numberField.getText() + "2");
                break;
            case R.id.b3:
                numberField.setText(numberField.getText() + "3");
                break;
            case R.id.b4:

                numberField.setText(numberField.getText() + "4");
                break;
            case R.id.b5:
                numberField.setText(numberField.getText() + "5");
                break;
            case R.id.b6:
                numberField.setText(numberField.getText() + "6");
                break;
            case R.id.b7:
                numberField.setText(numberField.getText() + "7");
                break;
            case R.id.b8:
                numberField.setText(numberField.getText() + "8");
                break;
            case R.id.b9:
                numberField.setText(numberField.getText() + "9");
                break;
            case R.id.b0:
                numberField.setText(numberField.getText() + "0");
                break;
            case R.id.bplyus:
                numberField.setText(numberField.getText() + "+");
                break;
            case R.id.bminus:
                numberField.setText(numberField.getText() + "-");
                break;
            case R.id.bslesh:
                numberField.setText(numberField.getText() + "/");
                break;
            case R.id.bastx:
                numberField.setText(numberField.getText() + "*");
                break;
            case R.id.bhavasar:
                resultField.setText(resultField.getText() + "=");

                char[] array = numberField.getText().toString().toCharArray();
                StringBuilder finalResult = new StringBuilder();
                for (char c1 : array) {
                    if (c1 == '+' || c1 == '-' ||
                            c1 == '*' || c1 == '/') {
                        finalResult.append(" ").append(c1).append(" ");
                    } else {
                        finalResult.append(c1);
                    }
                }
                TranslationInScr translationInScr = new TranslationInScr();
                int tx = translationInScr.evaluate(finalResult.toString());
                String txt = Integer.toString(tx);
                operationField.setText(txt);
                break;
            case R.id.bstoraket:
                numberField.setText(numberField.getText() + ",");

                break;
            case R.id.c:
                numberField.setText("");
                resultField.setText("");
                operationField.setText("");
                break;


        }

    }


}
