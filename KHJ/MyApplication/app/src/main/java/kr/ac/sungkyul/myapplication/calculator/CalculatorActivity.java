package kr.ac.sungkyul.myapplication.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import kr.ac.sungkyul.myapplication.R;

/**
 * 계산기 액티비티 입니다.
 * <p/>
 * 계산기를 완성하세요.
 * <p/>
 * 후에는 우선순위 계산기도 만들어 보세요.
 * <p/>
 * ex) 10 + 30 * 5 - 40 = 120 을 계산 할 수 있는 프로그램
 * <p/>
 * input  : 10 + 30 * 5 - 40
 * <p/>
 * output : 120
 */
public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtFirstNumber, edtSecondNumber, edtCalResult;
    Button btnPlus, btnMinus, btnMulti, btnDiv, btnMod, btnRoot, btnSquare, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        initialize();

    }

    /**
     * 캐스팅 메서드 입니다.
     *
     * @param number
     * @return type double
     */
    double castingNumber(String number) {
        return Double.parseDouble(number);
    }

    /**
     * 이벤트 처리 메서드 입니다.
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        String strFirstNumber = edtFirstNumber.getText().toString();  // 첫번째 입력한 문자를 저장합니다.
        String strSecondNumber = edtSecondNumber.getText().toString();  // 두번째 입력한 문자를 저장합니다.
        if (strFirstNumber.equals("") || strSecondNumber.equals("")) {
            Toast.makeText(getApplicationContext(), "수를 입력하세요.", Toast.LENGTH_SHORT).show();
        } else {
            double firstNumber = castingNumber(strFirstNumber);  // 문자열을 double형으로 변환합니다.
            double secondNumber = castingNumber(strSecondNumber);  // 문자열을 double형으로 변환합니다.

            switch (v.getId()) {  // switch case 문을 사용하여 주어진 아이디를 사용합니다.

                case R.id.btnPlus: {
                    double result = firstNumber + secondNumber;
                    edtCalResult.setText(result + "");
                    break;
                }

                case R.id.btnMinus: {
                    // - 연산을 완성하세요.
                    break;
                }

                //나머지 버튼 이벤트들도 완성하세요.
            }
        }
    }


    /**
     * 초기화 메서드 입니다.
     */
    void initialize() {
        edtFirstNumber = (EditText) findViewById(R.id.edtFirstNumber);
        edtSecondNumber = (EditText) findViewById(R.id.edtSecondNumber);
        edtCalResult = (EditText) findViewById(R.id.edtCalResult);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMod = (Button) findViewById(R.id.btnMod);
        btnRoot = (Button) findViewById(R.id.btnRoot);
        btnSquare = (Button) findViewById(R.id.btnSquare);
        btnClear = (Button) findViewById(R.id.btnClear);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMod.setOnClickListener(this);
        btnRoot.setOnClickListener(this);
        btnSquare.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }
}
