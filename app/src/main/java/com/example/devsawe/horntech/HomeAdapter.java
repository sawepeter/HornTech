package com.example.devsawe.horntech;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.devsawe.horntech.Model.ModelFood;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private ArrayList<ModelFood> mlist;

    private Context mContext;
    HomeAdapter(Context context, ArrayList<ModelFood> list){
        mContext = context;
        mlist = list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.home_item, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        ModelFood homeItem = mlist.get(position);

        ImageView imageView = viewHolder.item_image;
        TextView name,route,book;

        name = viewHolder.item_name;
        route = viewHolder.item_route;
        book = viewHolder.item_book;

        imageView.setImageResource();

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView item_image;
        TextView item_name,item_route,item_book;

        public ViewHolder(View itemView){
            super(itemView);

            item_image = itemView.findViewById(R.id.item_image);

            item_name = itemView.findViewById(R.id.item_name);
            item_route = itemView.findViewById(R.id.item_route);
            item_book = itemView.findViewById(R.id.item_book);
        }
    }
}
