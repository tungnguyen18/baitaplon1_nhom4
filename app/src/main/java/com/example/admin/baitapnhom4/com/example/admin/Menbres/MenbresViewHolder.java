package com.example.admin.baitapnhom4.com.example.admin.Menbres;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.baitapnhom4.R;

/**
 * Created by admin on 8/12/2016.
 */
public class MenbresViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView tvTitle,tvLabel;
    ImageView tvPhoto;
    OnRecyclerViewItemClick onRecyclerViewItemClick;

    public MenbresViewHolder(View itemView) {
        super(itemView);

        tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
        tvLabel = (TextView) itemView.findViewById(R.id.tvDescription);
        tvPhoto = (ImageView) itemView.findViewById(R.id.view);

       itemView.setOnClickListener(this);
    }

    public void bind(Menbres menbres){
        tvTitle.setText(menbres.title);
        tvLabel.setText(menbres.description);
        tvPhoto.setImageResource(R.drawable.person);
      //  tvLabel.setOnClickListener(this);
       // Glide.with(itemView.getContext()).load(demoBean.imageUrl).into(tvPhoto);
    }

    public void setOnRecyclerViewItemClick(OnRecyclerViewItemClick onRecyclerViewItemClick) {
        this.onRecyclerViewItemClick = onRecyclerViewItemClick;

    }

    @Override
    public void onClick(View view) {
        if(onRecyclerViewItemClick != null){
            onRecyclerViewItemClick.onItemClick(view,getAdapterPosition());
        }

    }
}
