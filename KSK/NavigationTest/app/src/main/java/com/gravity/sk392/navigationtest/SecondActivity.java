package com.gravity.sk392.navigationtest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SecondActivity extends View {
    Context context;
    View mview;

    public SecondActivity(Context context,View view){

        super(context);
        this.context = context;
        mview = view;
        TextView textView = (TextView)mview.findViewById(R.id.seconed_text);
        textView.setText("여긴 두번째");
        TextView textView2 = (TextView)mview.findViewById(R.id.seconed_text2);
        textView2.setText("페이지 입니다.");

    }

    /**
     * 현재 뷰가 보여질 때 실행된다.
     * @param canvas
     */
    protected void onDraw(android.graphics.Canvas canvas){
        Toast.makeText(context,"SecondActivity",Toast.LENGTH_SHORT).show();
    }
}
