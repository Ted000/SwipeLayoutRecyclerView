package com.diy.swipelayoutrecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.diy.swipelayoutrecyclerview.R;
import com.diy.swipelayoutrecyclerview.entity.TestData;
import com.diycoder.library.adapter.HeaderBottomAdapter;


/**
 * Created by lq on 16/6/29.
 */
public class TestHeaderBottomAdapter extends HeaderBottomAdapter<TestData, TestHeaderBottomAdapter.HeaderViewHolder, TestHeaderBottomAdapter.ItemViewHolder, TestHeaderBottomAdapter.BottomViewHolder> {

    private final LayoutInflater mLayoutInflater;
    private final Context mContext;

    public TestHeaderBottomAdapter(Context context) {
        super(context);
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public ItemViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        return new ItemViewHolder(mLayoutInflater.inflate(R.layout.item_test_item, parent, false));
    }

    @Override
    public void onBindItemViewHolder(ItemViewHolder holder, int position) {
        TestData data = getItemData(position);
        if (data != null) {
            String url = data.icon;
            Glide.with(mContext).load(url).centerCrop().into(holder.textView);
        }
    }

    @Override
    public HeaderViewHolder onCreateHeaderViewHolder(ViewGroup parent, int viewType) {
        return new HeaderViewHolder(mLayoutInflater.inflate(R.layout.item_test_header, parent, false));
    }

    @Override
    public void onBindHeaderViewHolder(HeaderViewHolder holder, int position) {

    }

    @Override
    public BottomViewHolder onCreateBottomViewHolder(ViewGroup parent, int viewType) {
        return new BottomViewHolder(mLayoutInflater.inflate(R.layout.item_test_footer, parent, false));
    }

    @Override
    public void onBindBottomViewHolder(BottomViewHolder holder, int position) {

    }

    //内容 ViewHolder
    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        private ImageView textView;

        public ItemViewHolder(View itemView) {
            super(itemView);
            textView = (ImageView) itemView.findViewById(R.id.tv_item_text);
        }
    }

    //头部 ViewHolder
    public static class HeaderViewHolder extends RecyclerView.ViewHolder {
        public HeaderViewHolder(View itemView) {
            super(itemView);
        }
    }

    //底部 ViewHolder
    public static class BottomViewHolder extends RecyclerView.ViewHolder {
        public BottomViewHolder(View itemView) {
            super(itemView);
        }
    }
}
