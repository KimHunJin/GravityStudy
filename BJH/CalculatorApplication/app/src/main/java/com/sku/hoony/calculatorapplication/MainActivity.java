package com.sku.hoony.calculatorapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnPlus, btnMinus, btnMultiplication, btnDivision, btnCalculation;
    Button btnPoint, btnReset, btnMark, btnPercent;
    TextView tv;
    int num;
    int result=0;
    boolean isClickPlus=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnPlus = (Button)findViewById(R.id.btnPlus);
        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnMultiplication = (Button)findViewById(R.id.btnMultiplication);
        btnDivision = (Button)findViewById(R.id.btnDivision);
        btnReset = (Button)findViewById(R.id.btnReset);
        btnMark = (Button)findViewById(R.id.btnMark);
        btnPercent = (Button)findViewById(R.id.btnPercent);
        btnPoint = (Button)findViewById(R.id.btnPoint);
        btnCalculation = (Button)findViewById(R.id.btnCalculation);
        tv = (TextView)findViewById(R.id.tv);*/
        findViewById(R.id.btn0).setOnClickListener(bClickListener);
    }
    Button.OnClickListener bClickListener = new View.OnClickListener(){
        public void onClick(View v){
            TextView tv = (TextView)findViewById(R.id.tv);
            switch (v.getId()){
                case R.id.btn0:
                    if (isClickPlus==true) {
                       result= num+=0;
                        isClickPlus=false;
                        tv.setText(result);
                    }
                    tv.setText("0");
                    num=0;
                    break;
                case R.id.btn1:
                    if(isClickPlus==true){
                        result = num+=1;
                        isClickPlus=false;
                        tv.setText(result);
                    }
                    tv.setText("1");
                    num=1;
                    break;
                case R.id.btn2:
                    tv.setText("2");
                    num=2;
                    break;
                case R.id.btn3:
                    tv.setText("3");
                    break;
                case R.id.btn4:
                    tv.setText("4");
                    break;
                case R.id.btn5:
                    tv.setText("5");
                    break;
                case R.id.btn6:
                    tv.setText("6");
                    break;
                case R.id.btn7:
                    tv.setText("7");
                    break;
                case R.id.btn8:
                    tv.setText("8");
                    break;
                case R.id.btn9:
                    tv.setText("9");
                    break;
            }
        }
    };
}
