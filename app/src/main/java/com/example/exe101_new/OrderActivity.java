package com.example.exe101_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void backToProductDetail(View view) {
        Intent intent = new Intent(this, ProductDetailActivity.class);
        startActivity(intent);
    }
}