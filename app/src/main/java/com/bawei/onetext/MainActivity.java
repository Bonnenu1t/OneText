package com.bawei.onetext;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private List<Fragment> listfrg;
    private String[] titles = {"页面1", "页面2","页面3", "页面4", "页面5","页面6", "页面7", "页面8","页面9"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.viewpager);


        //页面，数据源
        listfrg = new ArrayList<>();
        listfrg.add(new Fragment01());
        listfrg.add(new Fragment02());
        listfrg.add(Fragment03.newInstance(""));
        listfrg.add(Fragment03.newInstance(""));
        listfrg.add(Fragment03.newInstance(""));
        listfrg.add(Fragment03.newInstance(""));
        listfrg.add(Fragment03.newInstance(""));
        listfrg.add(Fragment03.newInstance(""));
        listfrg.add(Fragment03.newInstance(""));
        pager();
    }


    private void pager() {
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return listfrg.get(position);
            }
            //返回fragment的个数
            @Override
            public int getCount() {
                return listfrg.size();
            }
            //设置title标题
            @Override
            public CharSequence getPageTitle(int position) {
                return titles[position];
            }
        });
//tabLayout和viewPager进行关联
        tabLayout.setupWithViewPager(viewPager);


    }
    }

