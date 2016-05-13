package sungkyul.ac.kr.gravity.intro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import sungkyul.ac.kr.gravity.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_acitivy);

        Thread mTimer = new Thread() {
            @Override
            public void run() {

                try {
                    sleep(3000);
                    Intent mIntro = new Intent(SplashActivity.this, IntroActivity.class);
                    startActivity(mIntro);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        mTimer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
