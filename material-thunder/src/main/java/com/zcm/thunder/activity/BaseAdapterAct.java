package com.zcm.thunder.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import com.zcm.support.mvp.IPresenter;
import com.zcm.thunder.R;
import com.zcm.thunder.adapter.SuperRVAdapter;

import butterknife.Bind;

/**
 * Created by zcm on 17-3-28.
 */

public class BaseAdapterAct extends THBaseActivity {
    @Bind(R.id.function_list)
    RecyclerView function_list;
    SuperRVAdapter rvAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_test);
        rvAdapter=new SuperRVAdapter(this);
        function_list.setLayoutManager(new GridLayoutManager(this,2));
        function_list.setAdapter(rvAdapter);
    }

    @Override
    protected IPresenter getPresenter() {
        return null;
    }
}