package com.project.android.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.project.android.adapter.RecyleAdapter;
import com.project.android.bean.ExampleBean;
import com.project.kotlintest.R;
import com.zhouyou.recyclerview.adapter.BaseRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class RecyclViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycl_view);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyle);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyleAdapter mAdapter = new RecyleAdapter(this);

        mRecyclerView.setAdapter(mAdapter);

        List<ExampleBean> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ExampleBean exampleBean = new ExampleBean();

            exampleBean.setInfo("说明" + i);
            exampleBean.setTitle("我是Title" + i);
            exampleBean.setUrl("网络请求");

            list.add(exampleBean);
        }
        mAdapter.setListAll(list);

        mAdapter.setOnItemClickListener(new BaseRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, Object item, int position) {
                Toast.makeText(RecyclViewActivity.this, "点击了"+position, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
