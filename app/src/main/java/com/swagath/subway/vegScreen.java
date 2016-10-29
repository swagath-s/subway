package com.swagath.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class vegScreen extends AppCompatActivity {

    /*RadioGroup breadGrp; RadioButton breadChoice;
    CheckBox onion, tomato, lettuce, beet;
    Spinner outletSpinner;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg_screen);
    }

    public void showOrder(View view){


        Intent x = new Intent(getApplicationContext(), Confirmation.class);
        startActivity(x);

        // LET THE CASTING BEGIN!
        /*breadGrp = (RadioGroup) findViewById(R.id.breadGroupVeg);


        onion = (CheckBox)findViewById(R.id.onionBox);
        tomato = (CheckBox) findViewById(R.id.tomatoBox);
        lettuce = (CheckBox) findViewById(R.id.lettuceBox);
        beet  = (CheckBox) findViewById(R.id.beetBox);

        outletSpinner = (Spinner)findViewById(R.id.vegSpinner);

        //


        int Checked = breadGrp.getCheckedRadioButtonId();
        if (Checked == R.id.wheatRadioVeg){
            Toast.makeText(vegScreen.this, "Wheat", Toast.LENGTH_SHORT).show();
            breadChoice = (RadioButton) findViewById(R.id.wheatRadioVeg);
        }
        else if (Checked == R.id.mixRadioVeg){
            breadChoice = (RadioButton) findViewById(R.id.mixRadioVeg);

        }
        else if (Checked == R.id.oatRadioVeg){
            breadChoice = (RadioButton) findViewById(R.id.oatRadioVeg);
        }
        else if (Checked == R.id.whiteRadioVeg){
            breadChoice = (RadioButton) findViewById(R.id.whiteRadioVeg);
        }

        String vegString = "";

        if (onion.isChecked())
            vegString = vegString+" Onions";
        if (tomato.isChecked())
            vegString = vegString+" Tomato";
        if (lettuce.isChecked())
            vegString = vegString+" Lettuce";
        if (beet.isChecked())
            vegString = vegString+" Beets";

        String branch = outletSpinner.getSelectedItem().toString();

        Toast.makeText(vegScreen.this, vegString, Toast.LENGTH_SHORT).show();*/







    }


}
