package com.gravity.sk392.navigationtest.notice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.lang.String;
import com.gravity.sk392.navigationtest.R;

import java.util.ArrayList;

/**
 * Created by SK392 on 2016-01-14.
 */
public class ListViewAdapter extends BaseAdapter {
    private Context mcontext = null;
    public ArrayList<ItemData> mListData = new ArrayList<ItemData>();

    public ListViewAdapter(Context context) {
        super();
        this.mcontext = context;
    }

    private class ViewHolder{
        public TextView noticetitle;
        public TextView noticedate;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            LayoutInflater myInflater = (LayoutInflater)mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = myInflater.inflate(R.layout.item,parent,false);
            holder = new ViewHolder();

            holder.noticetitle = (TextView)convertView.findViewById(R.id.noticetitle);
            holder.noticedate = (TextView)convertView.findViewById(R.id.noticedate);
            convertView.setTag(holder);

        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        ItemData mitem = mListData.get(position);
        holder.noticetitle.setText(mitem.getNotice_title());
        holder.noticedate.setText(mitem.getNotice_date());

        return convertView ;
    }

    @Override
    public int getCount() {
        return mListData.size();
    }

    @Override
    public ItemData getItem(int position) {
        return mListData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void  addItem(String mtitle, String mdate){
        ItemData additem = null;
        additem = new ItemData();
        additem.noticetitle = mtitle;
        additem.noticedate = mdate;
        mListData.add(additem);
        dataChange();
    }

    public void remove(int position){
        mListData.remove(position);
        dataChange();
    }
    /*
    정렬하는 기능.
     */
    public void sort(){

    }
    public void dataChange(){
        notifyDataSetChanged();
    }
}

