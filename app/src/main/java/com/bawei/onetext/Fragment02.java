package com.bawei.onetext;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bonnenu1t丶 on 2017/6/10.
 */

public class Fragment02 extends Fragment {

    private View view;
    private RecyclerView mRecyclerView;
    List<Beans> list = new ArrayList<Beans>();
    private SecondAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view = inflater.inflate(R.layout.fragment02, container, false);
        initView();
        //init();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    /*private void initView(View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.main_recylist2);
    }*/




        //SecondAdapter adapter = new SecondAdapter(list, getActivity());

        //recyclerView.setAdapter(adapter);

    private void initView() {
        //找到这个Listview
        mRecyclerView = (RecyclerView) view.findViewById(R.id.main_recylist2);
        //设置线性管理器
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        for (int i = 0; i < 20; i++) {
            Beans beans = new Beans();
            beans.setTitle("新闻标题");
            //beans.setCon("新闻内容缩略");
            list.add(beans);
        }
        adapter = new SecondAdapter(list, getActivity());
        //adapter = new MyAdapter(list,getActivity());
        mRecyclerView.setAdapter(adapter);
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager);
    }
        /*//设置布局管理器
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        adapter = new SecondAdapter(list,getActivity());
        mRecyclerView.setAdapter(adapter);*/


}
