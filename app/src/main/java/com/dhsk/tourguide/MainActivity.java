package com.dhsk.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
        int citynum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void get_started(View view){
        if(citynum==0){
            Toast.makeText(this,"Please choose a city", Toast.LENGTH_SHORT).show();
        }
        else{
        Intent listOfCategories = new Intent(MainActivity.this, listCategory.class);
        listOfCategories.putExtra("citynumb",citynum);
        startActivity(listOfCategories);}
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.city1:
                if (checked)
                    citynum = 1;
                break;
            case R.id.city2:
                if (checked)
                    citynum = 2;
                break;
            case R.id.city3:
                if (checked)
                    citynum = 3;
                break;
            case R.id.city4:
                if (checked)
                    citynum = 4;
                break;
            case R.id.city5:
                if (checked)
                    citynum = 5;
                break;
            case R.id.city6:
                if (checked)
                    citynum = 6;
                break;
        }
    }
}
