package com.polamr.recyclerwithgridview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GridAdapter  extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    List<EndangeredItem> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<EndangeredItem>();
        EndangeredItem species = new EndangeredItem();
        species.setName("Amur Leopard");
        species.setValue("3");
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("Black Rhino");
        species.setValue("10");
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("Orangutan");
        species.setValue("13");
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("Sea Lions");
        species.setValue("23");
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("Indian Elephant");
        species.setValue("20");
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("Giant Panda");
        species.setValue("33");
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("Snow Leopard");
        species.setValue("21");
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("Dolphin");
        species.setValue("21");
        mItems.add(species);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        EndangeredItem nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setText(nature.getValue());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public TextView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (TextView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.tv_species);
        }
    }

}
