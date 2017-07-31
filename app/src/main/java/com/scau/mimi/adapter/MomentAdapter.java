package com.scau.mimi.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.scau.mimi.bean.Moment;

import java.util.List;

/**
 * Created by admin on 2017/5/13.
 */

public class MomentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    //  Constant
    private static final int VIEWTYPE_NORMAL = 0;
    private static final int VIEWTYPE_LOAD_MORE = 1;

    //  Variables
    private List<Moment> mMoments;

    //  ViewHolder
    static class NormalHolder extends RecyclerView.ViewHolder {

        public NormalHolder(View itemView) {
            super(itemView);
        }

        public void bindNormalHolder(Moment moment) {

        }
    }

    static class LoadMoreHolder extends RecyclerView.ViewHolder {

        public LoadMoreHolder(View itemView) {
            super(itemView);
        }

        public void bindHolder() {

        }
    }

    //  Constructor
    public MomentAdapter(List<Moment> moments) {
        mMoments = moments;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mMoments.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }
}
