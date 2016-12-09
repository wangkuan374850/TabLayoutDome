package com.example.wangkuan.tablayoutdome;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 1：左右
 * 2：名字
 * 3：日期
 */
public class MyFragment extends Fragment {

    private TextView tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.item, container, false);
        tv = (TextView) inflate.findViewById(R.id.a1);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Bundle arguments = getArguments();
        String key = arguments.getString("key");
        tv.setText(key);
    }

    //写一个静态的方法，传值
    public static MyFragment newInstance(String page) {
        Bundle args = new Bundle();
        args.putString("key", page);
        MyFragment fragment = new MyFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
