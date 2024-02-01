package com.example.tetsting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv ;
    EditText et ;
    Button bt ;
    MyAdapter adapter;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        et = findViewById(R.id.get_text);
        bt= findViewById(R.id.list_btn_add);
        lv = findViewById(R.id.list_view);

        adapter = new MyAdapter(this, android.R.layout.simple_list_item_1, new ArrayList<String>());
        lv.setAdapter(adapter);



        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                adapter.addItem(et.getText().toString());
                adapter.notifyDataSetChanged();

            }
        });










    }
}