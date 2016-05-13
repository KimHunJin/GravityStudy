package com.android.tkdlx_000.basetest;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void custom(View v) {

        switch (v.getId()) {

            case R.id.button1:
                Toast.makeText(getApplicationContext(), "글씨먼저", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
                startActivity(intent);
                break;

            case R.id.button2: {
                Intent meintent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/119"));
                startActivity(meintent);
                break;
            }

            case R.id.button3: {
                Intent meintent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(meintent);
                break;
            }
            case R.id.button4: {
               finish();
                break;
            }
        }
    }



}

