package com.project.android.adapter;

import android.content.Context;

import com.project.android.bean.ExampleBean;
import com.project.kotlintest.R;
import com.zhouyou.recyclerview.adapter.HelperRecyclerViewAdapter;
import com.zhouyou.recyclerview.adapter.HelperRecyclerViewHolder;

/**
 * Created by guolong on 2018/11/16.
 */

public class RecyleAdapter extends HelperRecyclerViewAdapter<ExampleBean> {


    public RecyleAdapter(Context context) {
        super(context, R.layout.item_recyle);
    }

    @Override
    protected void HelperBindData(HelperRecyclerViewHolder viewHolder, int position, ExampleBean item) {
        viewHolder.setText(R.id.title, item.getTitle()).setText(R.id.remark,item.getInfo());
    }
}
