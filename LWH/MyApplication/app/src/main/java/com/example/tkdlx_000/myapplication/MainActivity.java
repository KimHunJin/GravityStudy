package com.example.tkdlx_000.myapplication;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void custom(View v) {

        switch (v.getId()) {
            case R.id.hotel: {

                // 인텐트를 추가할 경우 매니페스트에 액티비티를 추가해줘야한다.
                Intent intent = new Intent(getApplicationContext(), starActivity.class);
                startActivity(intent);
                finish();
                break;
            }
            case R.id.airport: {
//                AlertDialog.Builder dlg = new AlertDialog.Builder();
//                dlg.setTitle("숫자 입력");
//                dlg.setMessage("숫자 입력해주세요");
//                dlg.setIcon(R.mipmap.ic_launcher);
//                dlg.setPositiveButton("확인", null);
//                dlg.show();
//
//                break;
            }
        }
    }
}