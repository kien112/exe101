package com.example.exe101_new;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.exe101_new.adapter.ProductAdapter;
import com.example.exe101_new.model.Place;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        List<Place> list = new ArrayList<>();
        list.add(new Place("Sương Dala Latte", R.drawable.h1, 123));
        list.add(new Place("Hương Mây Dala", R.drawable.h2, 234));
        list.add(new Place("Coffee Dala", R.drawable.h3, 110));
        list.add(new Place("View Nắng Dala", R.drawable.h4, 123));

        ProductAdapter adapter = new ProductAdapter(this, list);


        RecyclerView rec = findViewById(R.id.rec_pro);
        rec.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        rec.setLayoutManager(layoutManager);
    }

    public void goToBooking(View view) {
        Intent intent = new Intent(this, BookingActivity.class);
        startActivity(intent);
    }
}