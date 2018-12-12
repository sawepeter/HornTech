package com.example.devsawe.horntech.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.devsawe.horntech.Model.HomeModel;
import com.example.devsawe.horntech.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private ArrayList<HomeModel> mlist;
    private Context mContext;

    public HomeAdapter(Context context, ArrayList<HomeModel> list){
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

        HomeModel homeItem = mlist.get(position);

        ImageView imageView = viewHolder.item_image;
        TextView name,route,book;

        name = viewHolder.item_name;
        route = viewHolder.item_route;
        book = viewHolder.item_book;

        imageView.setImageResource(homeItem.getImage());

        name.setText(homeItem.getName());
        route.setText(homeItem.getRoute());
        book.setText(homeItem.getBook());

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView profile_photo,backgroung_img;
        TextView DriverContact,DriverName,item_book;

        public ViewHolder(View itemView){
            super(itemView);

            profile_photo = itemView.findViewById(R.id.profileImage);

            backgroung_img = itemView.findViewById(R.id.cardBackGround);
            DriverName = itemView.findViewById(R.id.Driver_Name);
            item_book = itemView.findViewById(R.id.btn_book);
            DriverContact = itemView.findViewById(R.id.Driver_Contact);
        }
    }
}
