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

public class DesAdapter extends RecyclerView.Adapter<DesAdapter.DesHolder>{

    public List<Place> places;
    Context context;

    public DesAdapter(Context context, List<Place> places){
        this.context = context;
        this.places = places;
    }

    @NonNull
    @Override
    public DesAdapter.DesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.des_item, parent, false);

        return new DesAdapter.DesHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DesAdapter.DesHolder holder, int position) {
        holder.img.setImageResource(places.get(position).getImg());
        holder.tv_name.setText(places.get(position).getName());

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

    public class DesHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView tv_name;

        public DesHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.des_img);
            tv_name = itemView.findViewById(R.id.des_name);
        }
    }
}
