package com.example.admin.baitapnhom4.com.example.admin.Profil;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin.baitapnhom4.R;

import java.util.List;


/**
 * Created by admin on 8/11/2016.
 */
public class ProfilAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<CityEvent> mList;

    public ProfilAdapter(List<CityEvent> list) {
        this.mList = list;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case CityEvent.TITRE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profil_layoutitem1, parent, false);
                return new TitreViewHolder(view);
            case CityEvent.ACTIVITE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profil_layoutitem2, parent, false);
                return new ActiviteViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        CityEvent object = mList.get(position);
        if (object != null) {
            switch (object.getType()) {
                case CityEvent.TITRE:
                    ((TitreViewHolder) holder).mTitle.setText(object.getTitle());
                    ((TitreViewHolder) holder).mName.setText(object.getName());
                    if (position==2 || position==3){
                        ((TitreViewHolder) holder).mName.setTextColor(Color.parseColor("#fd2d55"));
                    }
                    break;
                case CityEvent.ACTIVITE:
                    ((ActiviteViewHolder) holder).mTitle.setText(object.getTitle());
                    ((ActiviteViewHolder) holder).mName.setText(object.getName());

                    ((ActiviteViewHolder) holder).mDescription.setText(object.getDescription());
                    break;
            }
        }

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        if (mList == null)
            return 0;
        return mList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (mList != null) {
            CityEvent object = mList.get(position);
            if (object != null) {
                return object.getType();
            }
        }
        return 0;
    }

    public static class TitreViewHolder extends RecyclerView.ViewHolder {
        private TextView mTitle;
        private TextView mName;

        public TitreViewHolder(View itemView) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.txtLeft);
            mName = (TextView) itemView.findViewById(R.id.txtRight);
        }
    }

    public static class ActiviteViewHolder extends RecyclerView.ViewHolder {
        private TextView mTitle;
        private TextView mName;
        private TextView mDescription;

        public ActiviteViewHolder(View itemView) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.txtLarge);
            mName = (TextView) itemView.findViewById(R.id.txtMedium);
            mDescription = (TextView) itemView.findViewById(R.id.txtSmall);
        }
    }
}
