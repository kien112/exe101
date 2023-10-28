package com.example.exe101_new;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.exe101_new.adapter.DesAdapter;
import com.example.exe101_new.adapter.PlaceAdapter;
import com.example.exe101_new.model.Place;

import java.util.ArrayList;
import java.util.List;

public class BookingActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        Place p = new Place("View Ngược Nắng", R.drawable.item1, 109);
        Place p2 = new Place("View Vườn Hoa", R.drawable.item2, 229);
        Place p3 = new Place("View Sân Cỏ", R.drawable.item4, 119);

        List<Place> places = new ArrayList<>();
        places.add(p);
        places.add(p2);
        places.add(p3);

        PlaceAdapter placeAdapter = new PlaceAdapter(this, places);
        RecyclerView rec = findViewById(R.id.rec_place);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rec.setLayoutManager(layoutManager);
        rec.setAdapter(placeAdapter);

        List<Place> des = new ArrayList<>();
        des.add(new Place("View Gió Dala", R.drawable.des1, 0));
        des.add(new Place("View Mây Dala", R.drawable.des2, 0));
        des.add(new Place("View Nắng Dala", R.drawable.des3, 0));

        DesAdapter adapter = new DesAdapter(this, des);
        RecyclerView rec_des = findViewById(R.id.rec_des);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rec_des.setLayoutManager(layoutManager1);
        rec_des.setAdapter(adapter);
    }

    public void goToProduct(View view) {
        Intent intent = new Intent(this, ProductActivity.class);
        startActivity(intent);
    }
}