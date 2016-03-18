package com_0311_01.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IntentTestActivity extends AppCompatActivity {
    TextView txtName,txtNumber,txtPw,txtMajor;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_test);

        txtName=(TextView)findViewById(R.id.txtName);
        txtNumber=(TextView)findViewById(R.id.txtNumber);
        txtPw=(TextView)findViewById(R.id.txtPw);
        txtMajor=(TextView)findViewById(R.id.txtMajor);

        Intent intent=getIntent();

        txtName.setText(intent.getStringExtra("Name"));
        txtNumber.setText(intent.getStringExtra("Number"));
        txtPw.setText(intent.getStringExtra("PassWord"));
        txtMajor.setText(intent.getStringExtra("Major"));

         s=intent.getStringExtra("Name")+intent.getStringExtra("Number")+intent.getStringExtra("PassWord");
    }
    public void Go(View v){
        switch (v.getId()){
            case R.id.btnGo:
                Intent outIntent=new Intent(getApplicationContext(),MemberActivity.class);
                outIntent.putExtra("Total",s);
                setResult(RESULT_OK, outIntent);
                finish();
        }
    }
}
