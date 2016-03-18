package com.sk392.kr.gravity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {
    EditText edit_name, edit_studentnum, edit_password, edit_passcheck;
    RadioButton rb_devel, rb_plan, rb_design;
    RadioGroup rg_depart;
    Button btn_signup;
    TextView tv_ismem;
    String password,passcheck,name,studentnum,checkdepart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        edit_passcheck = (EditText)findViewById(R.id.edit_passcheck);
        edit_password = (EditText)findViewById(R.id.edit_password);
        edit_name = (EditText)findViewById(R.id.edit_name);
        edit_studentnum = (EditText)findViewById(R.id.edit_studentnum);
        rg_depart = (RadioGroup)findViewById(R.id.rg_depart);
        rb_design = (RadioButton)findViewById(R.id.rb_design);
        rb_devel = (RadioButton)findViewById(R.id.rb_devel);
        rb_plan = (RadioButton)findViewById(R.id.rb_plan);
        btn_signup = (Button)findViewById(R.id.btn_signup);
        tv_ismem = (TextView)findViewById(R.id.tv_ismem);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentnum = edit_studentnum.getText().toString().trim();
                password = edit_password.getText().toString().trim();
                passcheck = edit_passcheck.getText().toString().trim();
                name = edit_name.getText().toString().trim();
                rg_depart.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        if(checkedId == R.id.rb_devel){
                            checkdepart = "개발부서";
                        }else if(checkedId == R.id.rb_design){
                            checkdepart = "디자인부서";
                        }else {
                            checkdepart = "기획부서";
                        }

                    }
                });
                if (studentnum.isEmpty() || password.isEmpty() || passcheck.isEmpty() || name.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "입력란을 확인해주세요!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "이름 = " + name +"학번 = "+ studentnum + "password = " + password + "passwordcheck = "
                            +passcheck+" 부서 = " +checkdepart, Toast.LENGTH_SHORT).show();
                }

            }
        });


        tv_ismem.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
                return false;
            }
        });
    }
}
