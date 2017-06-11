package com.bawei.onetext;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bonnenu1t丶 on 2017/6/10.
 */

public class Fragment03 extends Fragment {
    private List<Beans> list=new ArrayList<Beans>();
    private View view;
    private RecyclerView mRecyclerView;
    private MyAdapter adapter;

    public Fragment03(){

    }
    public static Fragment03 newInstance(String name) {
        Bundle args = new Bundle();
        args.putString("name", name);
        Fragment03 fragment = new Fragment03();
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment03, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }


}
