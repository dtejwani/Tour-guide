package com.dhsk.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
        int citynum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView wel_text=findViewById(R.id.wel_tex);
        String text="<font color=#ff8000>Namaste </font><font color=#008000>India</font>";
        wel_text.setText(Html.fromHtml(text));
        ImageButton mum_btn=findViewById(R.id.mum_btn);
        mum_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                citynum=1;
                get_started(citynum);
            }
        });
        ImageButton del_btn=findViewById(R.id.del_btn);
        del_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                citynum=2;
                get_started(citynum);
            }
        });
        ImageButton jai_btn=findViewById(R.id.jai_btn);
        jai_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                citynum=5;
                get_started(citynum);
            }
        });
        ImageButton ban_btn=findViewById(R.id.ban_btn);
        ban_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                citynum=3;
                get_started(citynum);
            }
        });
        ImageButton hyd_btn=findViewById(R.id.hyd_btn);
        hyd_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                citynum=6;
                get_started(citynum);
            }
        });
        ImageButton kol_btn=findViewById(R.id.kol_btn);
        kol_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                citynum=4;
                get_started(citynum);
            }
        });
        ImageButton chen_btn=findViewById(R.id.chen_btn);
        chen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                citynum=7;
                get_started(citynum);
            }
        });
        ImageButton ahm_btn=findViewById(R.id.ahm_btn);
        ahm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                citynum=8;
                get_started(citynum);
            }
        });
    }
    private void get_started(int citynum){

        Intent listOfCategories = new Intent(MainActivity.this, listCategory.class);
        listOfCategories.putExtra("citynumb",citynum);
        startActivity(listOfCategories);}
    }


