package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mymensing_Place extends AppCompatActivity implements View.OnClickListener{

    Button Shilpacharya , Birishiri, Nikli , Alexander , Shashi ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensing__place);

        Shilpacharya =(Button) findViewById(R.id.Shilpacharya);
        Birishiri =(Button) findViewById(R.id.Birishiri);
        Nikli =(Button) findViewById(R.id.Nikli);
        Alexander =(Button) findViewById(R.id.Alexander);
        Shashi =(Button) findViewById(R.id.Shashi);


        Shilpacharya.setOnClickListener(this);
        Birishiri.setOnClickListener(this);
        Nikli.setOnClickListener(this);
        Alexander.setOnClickListener(this);
        Shashi.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Shilpacharya:

                Intent intent = new Intent(Mymensing_Place.this, Mymensing_Place1.class);
                startActivity(intent);

                break;

            case R.id.Birishiri:

                android.content.Intent aIntent = new Intent(Mymensing_Place.this, Mymensing_Place2.class);
                startActivity(aIntent);

                break;


            case R.id.Nikli:

                Intent bIntent = new Intent(Mymensing_Place.this, Mymensing_Place3.class);
                startActivity(bIntent);

                break;

            case R.id.Alexander:

                Intent cIntent = new Intent(Mymensing_Place.this, Mymensing_Place4.class);
                startActivity(cIntent);

                break;


            case R.id.Shashi:

                Intent dIntent = new Intent(Mymensing_Place.this, Mymensing_Place5.class);
                startActivity(dIntent);

                break;

        }
    }
}
