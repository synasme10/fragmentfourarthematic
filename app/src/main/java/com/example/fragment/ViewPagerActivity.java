package com.example.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import Fragment.FirstFragment;
import Fragment.FourthFragment;
import Fragment.SecondFragment;
import Fragment.ThirdFragment;
import adapter.ViewPagerAdapter;


public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager viewpager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        tabLayout=findViewById(R.id.TabId);
        viewpager=findViewById(R.id.viewpager);

        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());

                adapter.addfragment(new FirstFragment(),"Sum");
        adapter.addfragment(new SecondFragment(),"Area of Circle");
        adapter.addfragment(new ThirdFragment(),"Area of Triangle");
        adapter.addfragment(new FourthFragment(),"Simple Interest");


        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);
    }
}
