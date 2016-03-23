package sungkyul.ac.kr.gravity.activity.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import sungkyul.ac.kr.gravity.R;

/**
 * Created by HunJin on 2016-03-18.
 */
public class SignInActivity extends AppCompatActivity {
    EditText edit_studentnum, edit_pass;
    CheckBox cb_autologin;
    Button btn_login;
    TextView tv_findpass, tv_notmem;
    String id, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        edit_pass = (EditText) findViewById(R.id.edit_pass);
        edit_studentnum = (EditText) findViewById(R.id.edit_id);
        cb_autologin = (CheckBox) findViewById(R.id.cb_autologin);
        btn_login = (Button) findViewById(R.id.btn_login);
        tv_findpass = (TextView) findViewById(R.id.tv_findpass);
        tv_notmem = (TextView) findViewById(R.id.tv_notmem);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = edit_studentnum.getText().toString().trim();
                pass = edit_pass.getText().toString().trim();
                if (id.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "아이디 혹은 비밀번호를 입력해주세요!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "id = " + id + "password = " + pass + "checked = " + cb_autologin.isChecked(), Toast.LENGTH_SHORT).show();
                }

            }
        });

        tv_findpass.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent intent = new Intent(getApplication(), FindpassActivity.class);
                startActivity(intent);
                return false;
            }
        });
        tv_notmem.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent intent = new Intent(getApplication(), SignUpActivity.class);
                startActivity(intent);
                finish();
                return false;
            }
        });


    }
}