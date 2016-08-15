package com.example.admin.baitapnhom4.com.example.admin.Menbres;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.admin.baitapnhom4.R;

import java.util.List;

/**
 * Created by admin on 8/12/2016.
 */
public class MenbresAdapter extends RecyclerView.Adapter<MenbresViewHolder>{
    List<Menbres> menbresList;
    OnRecyclerViewItemClick onRecyclerViewItemClick;

    public void setOnRecyclerViewItemClick(OnRecyclerViewItemClick onRecyclerViewItemClick) {
        this.onRecyclerViewItemClick = onRecyclerViewItemClick;
    }

    public MenbresAdapter(List<Menbres> menbresList){
        this.menbresList = menbresList;
    }

    @Override
    public MenbresViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new MenbresViewHolder(layoutInflater.inflate(R.layout.item_membres,parent,false));
    }

    @Override
    public void onBindViewHolder(MenbresViewHolder holder, int position) {
        holder.bind(menbresList.get(position));
        holder.setOnRecyclerViewItemClick(onRecyclerViewItemClick);

    }

    @Override
    public int getItemCount() {
        return menbresList.size();
    }
}
