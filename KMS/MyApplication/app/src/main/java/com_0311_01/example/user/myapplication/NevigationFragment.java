package com_0311_01.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NevigationFragment extends AppCompatActivity {
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_nevigation);
        btn1=(Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(getApplicationContext(),PrintStar.class));
            }
        });
    }

    public void num(View v){
        switch (v.getId()){
            case R.id.btn2:{
                startActivity(new Intent(getApplicationContext(),MemberActivity.class));
            }
        }
    }
}
