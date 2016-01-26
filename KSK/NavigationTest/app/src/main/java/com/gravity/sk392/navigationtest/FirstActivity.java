package com.gravity.sk392.navigationtest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class FirstActivity extends View {
    Context context;
    View mview;

    public FirstActivity(Context context,View view){

        super(context);
        this.context = context;
        mview = view;
        TextView textView = (TextView)mview.findViewById(R.id.first_text);
        textView.setText("여긴 첫번째 페이지 입니다.");
    }

    /**
     * 현재 뷰가 보여질 때 실행된다.
     * @param canvas
     */
    protected void onDraw(android.graphics.Canvas canvas){
        Toast.makeText(context,"FirstActivity",Toast.LENGTH_SHORT).show();
    }
}
