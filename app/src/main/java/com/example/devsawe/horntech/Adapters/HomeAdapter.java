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

        viewHolder.backgroung_img.setImageResource(mlist.get(position).getBackground());
        viewHolder.profile_photo.setImageResource(mlist.get(position).getProfilePhoto());
        viewHolder.item_book.setText(mlist.get(position).getBtnfollow());
        viewHolder.DriverName.setText(mlist.get(position).getDriverName());
        viewHolder.DriverContact.setText(mlist.get(position).getDriverContact());

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
