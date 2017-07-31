package com.scau.mimi.base;

import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by admin on 2017/5/13.
 */

public abstract class BaseFragment extends Fragment {

    protected abstract void initVariables();

    protected abstract void initViews(View view);

    protected abstract void loadData();
}
