package com_0311_01.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MemberActivity extends AppCompatActivity {
    EditText edtName,edtNumber,edtPw;
    RadioGroup group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);
        edtName=(EditText)findViewById(R.id.edtName);
        edtNumber=(EditText)findViewById(R.id.edtNumber);
        edtPw=(EditText)findViewById(R.id.edtPw);
        group=(RadioGroup)findViewById(R.id.group);

    }
    public  void register(View v){
        switch (v.getId()){
            case R.id.btnResister:
                RadioButton select=(RadioButton)findViewById(group.getCheckedRadioButtonId());
                Intent intent=new Intent(getApplicationContext(),IntentTestActivity.class);
                intent.putExtra("Name",edtName.getText().toString());
                intent.putExtra("Number",edtNumber.getText().toString());
                intent.putExtra("PassWord",edtPw.getText().toString());
                intent.putExtra("Major",select.getText().toString());
                startActivityForResult(intent,0);

        }
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode==RESULT_OK){
           String name=data.getStringExtra("Total");
            Toast.makeText(getApplicationContext(),"a"+name, Toast.LENGTH_SHORT).show();
        }
    }
}
