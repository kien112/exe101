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
import com.example.exe101_new.OrderActivity;
import com.example.exe101_new.ProductDetailActivity;
import com.example.exe101_new.R;
import com.example.exe101_new.model.Place;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder>{

    public List<Place> places;
    Context context;

    public ProductAdapter(Context context, List<Place> places){
        this.context = context;
        this.places = places;
    }

    @NonNull
    @Override
    public ProductAdapter.ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_item, parent, false);

        return new ProductAdapter.ProductHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ProductHolder holder, int position) {
        holder.img.setBackgroundResource(places.get(position).getImg());
        holder.tv_name.setText(places.get(position).getName());
        holder.tv_price.setText("$" + places.get(position).getPrice());

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ProductDetailActivity.class);
                context.startActivity(intent);
            }
        });
        holder.tv_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ProductDetailActivity.class);
                context.startActivity(intent);
            }
        });
        holder.btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, OrderActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    public class ProductHolder extends RecyclerView.ViewHolder{
        ImageView img, btn_add;
        TextView tv_name, tv_price;


        public ProductHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.pro_img_1);
            tv_name = itemView.findViewById(R.id.pro_name_1);
            tv_price = itemView.findViewById(R.id.pro_price_1);
            btn_add = itemView.findViewById(R.id.btn_add_to_cart);
        }
    }
}
