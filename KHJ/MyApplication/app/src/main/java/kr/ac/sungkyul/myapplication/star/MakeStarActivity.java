package kr.ac.sungkyul.myapplication.star;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import kr.ac.sungkyul.myapplication.R;

public class MakeStarActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtStarNumber;
    Button btnTypeA, btnTypeB, btnTypeC, btnTypeD;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_star);

        initialize();
    }

    /**
     * 초기화 메서드 입니다.
     */
    void initialize() {
        edtStarNumber = (EditText) findViewById(R.id.edtStarNumber);
        btnTypeA = (Button) findViewById(R.id.btnTypeA);
        btnTypeB = (Button) findViewById(R.id.btnTypeB);
        btnTypeC = (Button) findViewById(R.id.btnTypeC);
        btnTypeD = (Button) findViewById(R.id.btnTypeD);
        txtResult = (TextView) findViewById(R.id.txtStarResult);

        btnTypeA.setOnClickListener(this);
        btnTypeB.setOnClickListener(this);
        btnTypeC.setOnClickListener(this);
        btnTypeD.setOnClickListener(this);
    }

    /**
     * 버튼 클릭 이벤트 입니다.
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        String number = edtStarNumber.getText().toString();
        if (number.equals("")) {
            Toast.makeText(getApplicationContext(), "수를 입력하세요.", Toast.LENGTH_SHORT).show();
        } else {
            txtResult.setText("");  // txtResult를 초기화 합니다.
            int starNumber = Integer.parseInt(number);
            switch (v.getId()) {
                case R.id.btnTypeA: {
                    starTypeA(starNumber);
                    break;
                }
                case R.id.btnTypeB: {
                    // 주어진 메서드를 채워보세요.
                    starTypeB(starNumber);
                    break;
                }
                case R.id.btnTypeC: {
                    // 주어진 메서드를 채워보세요.
                    starTypeC(starNumber);
                    break;
                }
                case R.id.btnTypeD: {
                    // 주어진 메서드를 채워보세요.
                    starTypeD(starNumber);
                    break;
                }
            }
        }
    }

    /**
     * 삼각형을 만드는 메서드 입니다.
     * <p/>
     * ex) number = 4
     * *
     * **
     * ***
     * ****
     *
     * @param starNumber
     */
    void starTypeA(int starNumber) {
        for (int i = 1; i <= starNumber; i++) {
            for (int j = 0; j < i; j++) {
                txtResult.setText(txtResult.getText() + "*");
            }
            txtResult.setText(txtResult.getText() + "\n");
        }
    }

    /**
     * 다음과 같은 삼각형을 만들어 보세요.
     * <p/>
     * ex) number = 4
     * *
     * **
     * ***
     * ****
     *
     * @param starNumber
     */
    void starTypeB(int starNumber) {

    }

    /**
     * 다음과 같은 삼각형을 만들어 보세요.
     * ex) number = 4
     * ****
     * ***
     * **
     * *
     *
     * @param starNumber
     */
    void starTypeC(int starNumber) {

    }

    /**
     * 다음과 같은 삼각형을 만들어 보세요.
     * ex) number = 4
     * *
     * ***
     * *****
     * *******
     *
     * @param starNumber
     */
    void starTypeD(int starNumber) {

    }
}
