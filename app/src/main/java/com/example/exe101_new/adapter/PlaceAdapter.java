package com.example.exe101_new.adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exe101_new.BookingDetailActivity;
import com.example.exe101_new.R;
import com.example.exe101_new.model.Place;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceHolder>{

    public List<Place> places;
    Context context;

    public PlaceAdapter(Context context, List<Place> places){
        this.context = context;
        this.places = places;
    }

    @NonNull
    @Override
    public PlaceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.place_item, parent, false);

        return new PlaceHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceHolder holder, int position) {
        holder.img.setImageResource(places.get(position).getImg());
        holder.tv_name.setText(places.get(position).getName());
        holder.tv_price.setText("$" + places.get(position).getPrice());

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BookingDetailActivity.class);
                context.startActivity(intent);
            }
        });
        holder.tv_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BookingDetailActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    public class PlaceHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView tv_name, tv_price;

        public PlaceHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.pl_img);
            tv_name = itemView.findViewById(R.id.pl_tv);
            tv_price = itemView.findViewById(R.id.pl_price);
        }
    }
}
