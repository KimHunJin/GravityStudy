package com.gravity.sk392.navigationtest.notice;

/**
 * Created by SK392 on 2016-01-14.
 */
public class ItemData {
    String noticetitle;
    String noticedate;
    public ItemData(String title, String date){
        super();
        noticedate = date;
        noticetitle = title;
    }
    public ItemData(){
        super();
        noticedate = null;
        noticetitle = null;

    }
    public String getNotice_date() {
        return noticedate;
    }

    public String getNotice_title() {
        return noticetitle;
    }

    public void setNotice_date(String noticedate) {
        this.noticedate = noticedate;
    }

    public void setNotice_title(String noticetitle) {
        this.noticetitle = noticetitle;
    }

}
