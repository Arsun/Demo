package com.scau.mimi.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;

import com.scau.mimi.R;
import com.scau.mimi.adapter.FragmentListAdapter;
import com.scau.mimi.fragment.EssayFragment;
import com.scau.mimi.fragment.MeFragment;
import com.scau.mimi.fragment.MomentFragment;
import com.scau.mimi.fragment.NewsFragment;
import com.scau.mimi.utils.ToastUtil;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //  Constant
    private static final String TAG = "MainActivity";

    //  Variables
    private boolean isExit;
    private List<Fragment> mFragments;
    private List<String> mTabTitles;

    //  View
    private ViewPager mFragmentsPager;
    private TabLayout mTabLayout;

    //  Data


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initVariables();
        initViews();
        loadData();

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (isExit) {
                finish();
            } else {
                ToastUtil.toast(this, getString(R.string.activity_main_exit_toast));
                isExit = true;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        isExit = false;
                    }
                }, 2000);
            }
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    //  private methods
    private void initVariables() {

        mTabTitles = new ArrayList<>();
        mFragments = new ArrayList<>();

        mTabTitles.add(0, getString(R.string.activity_main_tab_title_0));
        mTabTitles.add(1, getString(R.string.activity_main_tab_title_1));
        mTabTitles.add(2, getString(R.string.activity_main_tab_title_2));
        mTabTitles.add(3, getString(R.string.activity_main_tab_title_3));

        mFragments.add(0, MomentFragment.newInstance());
        mFragments.add(1, NewsFragment.newInstance());
        mFragments.add(2, EssayFragment.newInstance());
        mFragments.add(3, MeFragment.newInstance());

    }

    private void initViews() {
        mFragmentsPager = (ViewPager) findViewById(R.id.vp_main_fragments_pager);
        mTabLayout = (TabLayout) findViewById(R.id.tabl_main_tab);


        FragmentManager fm = getSupportFragmentManager();
        mFragmentsPager.setAdapter(new FragmentListAdapter(fm, mFragments, mTabTitles));
        addTab();
        mTabLayout.setupWithViewPager(mFragmentsPager, true);
        setTabIcon();

    }

    private void loadData() {

    }

    private void addTab() {
        for (int i = 0; i < 4; i++) {
            mTabLayout.addTab(mTabLayout.newTab());
            Log.d(TAG, "addTab: " + mTabTitles.get(i));
        }
    }

    private void setTabIcon() {
        for (int i = 0; i < 4; i++) {
            TabLayout.Tab tab =mTabLayout.getTabAt(i);
            tab.setIcon(R.drawable.ic_tab);
        }
    }

    //  public method
    public static void actionStart(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }


}
