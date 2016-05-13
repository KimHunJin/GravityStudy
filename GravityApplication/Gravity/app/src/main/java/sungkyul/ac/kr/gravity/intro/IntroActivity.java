package sungkyul.ac.kr.gravity.intro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.viewpagerindicator.CirclePageIndicator;

import sungkyul.ac.kr.gravity.R;
import sungkyul.ac.kr.gravity.activity.login.SignUpActivity;
import sungkyul.ac.kr.gravity.adapter.ViewPagerAdapter;

public class IntroActivity extends Activity {

    ViewPager mViewPager;
    PagerAdapter mAdapter;

    int[] mImage;
    CirclePageIndicator mIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        mImage = new int[]{
                R.drawable.gravity_intro_one,
                R.drawable.gravity_intro_two
        };


        mViewPager = (ViewPager) findViewById(R.id.pager);
        mAdapter = new ViewPagerAdapter(IntroActivity.this, mImage);

        mViewPager.setAdapter(mAdapter);

        mIndicator = (CirclePageIndicator) findViewById(R.id.indicator);
        mIndicator.setViewPager(mViewPager);

        mIndicator.setPageColor(0x212121);
        mIndicator.setFillColor(0x880000FF);
        mIndicator.setStrokeColor(0xFF000000);
    }

    public void onPause() {
        super.onPause();
        finish();
    }

    public void introClickEvent(View v) {
        switch (v.getId()) {
            case R.id.btnGoSignIn : {

                break;
            }
            case R.id.btnGoSignUp : {
                startActivity(new Intent(getApplicationContext(), SignUpActivity.class));
                break;
            }
        }
    }
}
