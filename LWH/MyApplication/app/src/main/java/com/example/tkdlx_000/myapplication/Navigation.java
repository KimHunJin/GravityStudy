package com.example.tkdlx_000.myapplication;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Navigation extends AppCompatActivity {
    TextView student, notice, news, question, free, tree, setting;
    ImageView logo, image1, image2, image3, image4, image5, image6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        logo = (ImageView) findViewById(R.id.logo);
        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        image3 = (ImageView) findViewById(R.id.image3);
        image4 = (ImageView) findViewById(R.id.image4);
        image5 = (ImageView) findViewById(R.id.image5);
        image6 = (ImageView) findViewById(R.id.image6);


         }


    public void custom(View v) {

        switch (v.getId()) {

            case R.id.noticeLayout: {

                break;
            }
            case R.id.newsLayout: {

                break;
            }
            case R.id.questionLayout: {

                break;
            }
            case R.id.freeLayout: {

                break;
            }
            case R.id.treeLayout: {

                break;
            }
            case R.id.settingLayout: {

                break;
            }


        }

    }
}
