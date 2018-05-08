package com.example.demo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.demo.R;
import java.util.List;

public class GoodsListActivity extends AppCompatActivity {
    private ListView listView;
    private GridView gridView;
    private static final String TAG = "GoodsListActivity---";
    private boolean flag = true;
    private ImageView change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goods_list_layout);
}
}