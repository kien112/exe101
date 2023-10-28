package com.example.exe101_new;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.exe101_new.adapter.ImagePagerAdapter;

public class SelectMoodActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private ImagePagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_mood);

        viewPager = findViewById(R.id.viewPager);

        int[] imageArray = {R.drawable.m6, R.drawable.m5, R.drawable.m4, R.drawable.m3, R.drawable.m2, R.drawable.m1};
        adapter = new ImagePagerAdapter(this, imageArray);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(3);
    }

    public void goToBookingPage(View view) {
        Intent intent = new Intent(this, BookingActivity.class);
        startActivity(intent);
    }
}