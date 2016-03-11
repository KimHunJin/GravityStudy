package com.gravity.sk392.navigationtest;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SK392 on 2016-01-21.
 */
public class ViewpagerAdapter extends PagerAdapter {

    LayoutInflater inflater;
    Context context;
    View first;
    View second;
    View third;

    public ViewpagerAdapter(LayoutInflater inflater, Context context) {
        // TODO Auto-generated constructor stub

        //전달 받은 LayoutInflater를 멤버변수로 전달
        this.inflater = inflater;
        this.context = context;
    }

    //PagerAdapter가 가지고 잇는 View의 개수를 리턴
    //보통 보여줘야하는 이미지 배열 데이터의 길이를 리턴
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 3; //뷰페이저 총 페이지 수 리턴(엑티비티가 3개라 3을 리턴)
    }

    //ViewPager가 현재 보여질 Item(View객체)를 생성할 필요가 있는 때 자동으로 호출
    //쉽게 말해, 스크롤을 통해 현재 보여져야 하는 View를 만들어냄.
    //첫번째 파라미터 : ViewPager
    //두번째 파라미터 : ViewPager가 보여줄 View의 위치(가장 처음부터 0,1,2,3...)
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // TODO Auto-generated method stub

        View view = null;
        switch (position) {
            case 0:
                if (first == null) {
                    view = inflater.inflate(R.layout.activity_first, null);
                    new FirstActivity(context, view);
                    first = view;
                } else view = first;
                break;

            case 1:
                if (second == null) {
                    view = inflater.inflate(R.layout.activity_second, null);
                    new SecondActivity(context, view);

                    second = view;
                } else view = second;
                break;

            case 2:
                if (third == null) {
                    view = inflater.inflate(R.layout.activity_third, null);
                    new ThirdActivity(context, view);
                    third = view;
                } else view = third;
                break;
        }
        container.addView(view);
        return view;
    }



    //화면에 보이지 않은 View는파괴를 해서 메모리를 관리함.
    //첫번째 파라미터 : ViewPager
    //두번째 파라미터 : 파괴될 View의 인덱스(가장 처음부터 0,1,2,3...)
    //세번째 파라미터 : 파괴될 객체(더 이상 보이지 않은 View 객체)
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // TODO Auto-generated method stub

        //ViewPager에서 보이지 않는 View는 제거
        //세번째 파라미터가 View 객체 이지만 데이터 타입이 Object여서 형변환 실시
        container.removeView((View)object);

    }

    //instantiateItem() 메소드에서 리턴된 Ojbect가 View가  맞는지 확인하는 메소드
    @Override
    public boolean isViewFromObject(View v, Object obj) {
        // TODO Auto-generated method stub
        return v==obj;
    }



}
