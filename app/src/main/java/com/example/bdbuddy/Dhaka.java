package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Dhaka extends AppCompatActivity implements View.OnClickListener{

    RadioButton dr1 ,df;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka);
        dr1 = (RadioButton) findViewById(R.id.dhakaplace);
        df = (RadioButton)findViewById(R.id.dhakafood);
        dr1.setOnClickListener(this);
        df.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent aintent = new Intent(Dhaka.this, Dhaka_Place.class);
        startActivity(aintent);



        switch (v.getId()) {
            case R.id.dhakaplace:

                Intent Intent = new Intent(Dhaka.this, Dhaka_Place.class);
                startActivity(Intent);

                break;

            case R.id.dhakafood:

                Intent aIntent = new Intent(Dhaka.this, Dhakafood.class);
                startActivity(aIntent);

                break;
        }

        }
}
