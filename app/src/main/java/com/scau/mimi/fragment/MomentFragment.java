package com.scau.mimi.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.scau.mimi.R;
import com.scau.mimi.base.BaseFragment;

import java.util.List;

/**
 * Created by admin on 2017/5/13.
 */

public class MomentFragment extends BaseFragment {

    //  Constant
    private static final String TAG = "MomentFragment";

    //  Variables


    //  Views
    private ImageButton mEditMoment;
    private SwipeRefreshLayout mMomentRefresh;
    private RecyclerView mMomentRecyclerView;

    //  Data

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_moment, container, false);
        return view;
    }

    //  public method
    public static Fragment newInstance() {
        return new MomentFragment();
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews(View view) {
        mEditMoment = (ImageButton) view.findViewById(R.id.imgbtn_edit_moment);
        mMomentRefresh = (SwipeRefreshLayout) view.findViewById(R.id.srl_frag_moment_refresh_moment);
        mMomentRecyclerView = (RecyclerView) view.findViewById(R.id.rv_frag_moment_moment_list);
    }

    @Override
    protected void loadData() {

    }
}
