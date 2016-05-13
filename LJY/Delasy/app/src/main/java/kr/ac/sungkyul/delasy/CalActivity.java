package kr.ac.sungkyul.delasy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by com on 2016-03-11.
 */
public class CalActivity extends AppCompatActivity{

    EditText edtInput;
    EditText edtResult;
    static int cnt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        edtInput = (EditText)findViewById(R.id.input0);
        edtResult = (EditText)findViewById(R.id.result);

    }

    public void input(View view){


        String a = edtInput.getText().toString();
      // int cnt=0;
        switch (view.getId()){

            case R.id.cancle : {
                edtInput.setText(" ");
                edtResult.setText(" ");
                break;
            }
            case R.id.bracket : {

                if(cnt<1){
                    edtInput.setText(a+"(");
                    cnt=1;
                }else{
                    edtInput.setText(a+")");
                    cnt=0;
                }
                break;
            }
            case R.id.percent : {
                edtInput.setText(a+"%");
                break;
            }
            case R.id.division : {
                edtInput.setText(a+"/");
                break;
            }
            case R.id.seven : {
                edtInput.setText(a + 7);
                break;
            }
            case R.id.eight :{
                edtInput.setText(a+8);
                break;
            }
            case R.id.nine :{
                edtInput.setText(a+9);
                break;
            }
            case R.id.multiple :{
                edtInput.setText(a+"+");
                break;
            }
            case R.id.four :{
                edtInput.setText(a+4);
                break;
            }
            case R.id.five :{
                edtInput.setText(a+5);
                break;
            }
            case R.id.six :{
                edtInput.setText(a+6);
                break;
            }
            case R.id.minus :{
                edtInput.setText(a+"-");
                break;
            }
            case R.id.one :{
                edtInput.setText(a+1);
                break;
            }
            case R.id.two :{
                edtInput.setText(a+2);
                break;
            }
            case R.id.three :{
                edtInput.setText(a+3);
                break;
            }
            case R.id.plus :{
                edtInput.setText(a+"+");
                break;
            }
            case R.id.dot :{
                edtInput.setText(a+".");
                break;
            }
            case R.id.zero :{
                edtInput.setText(a+0);
                break;
            }
            case R.id.equals :{

                break;
            }
        }
    }
}
