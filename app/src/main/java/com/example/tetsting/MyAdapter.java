package com.example.tetsting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter  extends BaseAdapter {

    Context context  ;
    ArrayList<String> data;
    int resource ;




    public MyAdapter(Context c ,int resource , ArrayList<String> data ) {

        this.context = c ;
        this.resource= resource;
        this.data= data;
    }


    public void addItem(String item){

        data.add(item);
    }

    @Override
    public int getCount() {
        return data.size() ;
    }

    @Override
    public String getItem(int position) {

        return data.get(position) ;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i , View view, ViewGroup viewGroup) {

        View v = view ;

        if(v ==  null){

            v= LayoutInflater.from(context).inflate(resource,null,false);

        }

        TextView tv =v.findViewById(android.R.id.text1);

        String name = getItem(i);

        tv.setText(name);

        return v;
    }
}
