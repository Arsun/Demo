package com.scau.mimi.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scau.mimi.R;
import com.scau.mimi.base.BaseFragment;

/**
 * Created by admin on 2017/5/13.
 */

public class EssayFragment extends BaseFragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_essay, container, false);
        return view;
    }

    //  public method
    public static Fragment newInstance() {
        return new EssayFragment();
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews(View view) {

    }

    @Override
    protected void loadData() {

    }
}
