package com.dhsk.tourguide;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class listCategory extends AppCompatActivity {
    int citynum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_category);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        citynum=getIntent().getIntExtra("citynumb",citynum);
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager(), citynum);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
