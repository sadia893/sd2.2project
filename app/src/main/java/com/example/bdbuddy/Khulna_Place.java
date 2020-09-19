package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Khulna_Place extends AppCompatActivity implements View.OnClickListener{

    Button Rabindranath , Hiron, Sundarbans, Mongla , Rampal, shat ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna__place);

        Rabindranath =(Button) findViewById(R.id.Rabindranath);
        Hiron =(Button) findViewById(R.id.Hiron);
        Sundarbans =(Button) findViewById(R.id.Sundarbans);
        Mongla =(Button) findViewById(R.id.Mongla);
        Rampal =(Button) findViewById(R.id.Rampal);
        shat =(Button) findViewById(R.id.shat);



        Rabindranath.setOnClickListener(this);
        Hiron.setOnClickListener(this);
        Sundarbans.setOnClickListener(this);
        Mongla.setOnClickListener(this);
        Rampal.setOnClickListener(this);
        shat.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Rabindranath:

                Intent Intent = new Intent(Khulna_Place.this, Khulna_Place1.class);
                startActivity(Intent);

                break;

            case R.id.Hiron:

                Intent aIntent = new Intent(Khulna_Place.this, Khulna_Place2.class);
                startActivity(aIntent);

                break;


            case R.id.Sundarbans:

                Intent bIntent = new Intent(Khulna_Place.this, Khulna_Place3.class);
                startActivity(bIntent);

                break;

            case R.id.Mongla:

                Intent cIntent = new Intent(Khulna_Place.this, Khulna_Place4.class);
                startActivity(cIntent);

                break;

            case R.id.Rampal:

                Intent dIntent = new Intent(Khulna_Place.this, Khulna_Place5.class);
                startActivity(dIntent);

                break;
            case R.id.shat:

                Intent eIntent = new Intent(Khulna_Place.this, Khulna_Place6.class);
                startActivity(eIntent);

                break;

        }


        }
}
