package com.bawei.onetext;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bonnenu1t丶 on 2017/6/10.
 */

public class Fragment01 extends Fragment {
    private List<Beans> list=new ArrayList<Beans>();
    private View view;
    private RecyclerView mRecyclerView;
    private MyAdapter adapter;
    private LinearLayoutManager linearLayoutManager;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.list_fragment, container, false);
        initView();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

    /**
     * 初始化
     */
    private void initView() {
        //找到这个Listview
        mRecyclerView = (RecyclerView) view.findViewById(R.id.main_recylist);
        //设置线性管理器
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        for (int i = 0; i < 20; i++) {
            Beans beans = new Beans();
            beans.setTitle("新闻标题");
            beans.setCon("新闻内容缩略");
            list.add(beans);
        }
        adapter = new MyAdapter(list,getActivity());
        mRecyclerView.setAdapter(adapter);
        

        linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);


        /*adapter.setOnItemClickListener(new AAdapter.MyItemClickListener() {
            @Override
            public void onItemClick(View view, int postion) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra("content", list.get(postion).getContent());
                startActivity(intent);
            }
        });*/
    }
}
