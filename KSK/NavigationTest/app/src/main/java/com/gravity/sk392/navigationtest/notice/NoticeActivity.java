package com.gravity.sk392.navigationtest.notice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.gravity.sk392.navigationtest.R;

import java.util.Calendar;

public class NoticeActivity extends AppCompatActivity {
    private ListView mlistview = null;
    private ListViewAdapter madapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        mlistview = (ListView) findViewById(R.id.noticeList);
        madapter = new ListViewAdapter(this);

        mlistview.setAdapter(madapter);
        madapter.addItem("안녕?? 첫번째 아이템 타이틀이야",getTime());
        madapter.addItem("안녕?? 두번째 아이템 타이틀이야",getTime());
        madapter.addItem("안녕?? 세번째 아이템 타이틀이야",getTime());
        madapter.addItem("안녕?? 네번째 아이템 타이틀이야",getTime());

        mlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ItemData mdata = madapter.getItem(position);
                Toast(mdata.getNotice_title());
            }
        });
    }
    public String getTime(){
        Calendar cal = Calendar.getInstance();
        String time = "";
        time = String.format("%04d-%02d-%02d-%02d-%02d",
                cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH),
                cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
        return time;
    }
    public void Toast(String message){
        Toast.makeText(NoticeActivity.this,message,Toast.LENGTH_SHORT).show();

    }

}

