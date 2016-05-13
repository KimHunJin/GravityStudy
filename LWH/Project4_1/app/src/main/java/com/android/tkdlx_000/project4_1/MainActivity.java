package com.android.tkdlx_000.project4_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;

    int number1;
    int number2;
    Integer resultNum;
    float resultFloat;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        result = (TextView) findViewById(R.id.result);

    }

    public void custom(View v) {


        if (edit1.getText().toString().trim().equals("") || edit2.getText().toString().trim().equals("") | edit2.getText().toString().equals("0")) {
            Toast.makeText(MainActivity.this, "re try(입력 x , 문자 x , number2 - zero x)", Toast.LENGTH_SHORT).show();
            return;
        }

        number1 = Integer.parseInt(edit1.getText().toString().trim());
        number2 = Integer.parseInt(edit2.getText().toString().trim());

        switch (v.getId()) {
            case R.id.btnAdd: {
                resultNum = number1 + number2;
                result.setText("" + resultNum);
                break;
            }
            case R.id.btnMius: {
                resultNum = number1 - number2;
                result.setText("" + resultNum);
                break;
            }
            case R.id.btnMultiple: {
                resultNum = number1 * number2;
                result.setText("" + resultNum);
                break;
            }
            case R.id.btnDivide: {
                resultFloat = (float) number1 / (float) number2;

                result.setText("" + (resultFloat * 100) / 100);
                break;
            }

        }
    }
}
