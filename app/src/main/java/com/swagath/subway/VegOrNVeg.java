package com.swagath.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class VegOrNVeg extends AppCompatActivity {

    RadioGroup rgrp;
    RadioButton vegOption, nonVegOption;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg_or_nveg);
    }

    public void nextPage(View view){

        rgrp = (RadioGroup)findViewById(R.id.vegOrNonVegOption);
        //vegOption = (RadioButton)findViewById(R.id.vegButton);
        //nonVegOption = (RadioButton)findViewById(R.id.nVegButton);

        if (R.id.vegButton == rgrp.getCheckedRadioButtonId()){
            Toast.makeText(VegOrNVeg.this, "Veg's selected", Toast.LENGTH_SHORT).show();

            Intent i = new Intent (getApplicationContext(), vegScreen.class);
            startActivity(i);
        }
        else{
            Toast.makeText(VegOrNVeg.this, "Non-veg's selected", Toast.LENGTH_SHORT).show();
            Intent i = new Intent (getApplicationContext(), vegScreen.class);
            startActivity(i);
        }

    }
}
