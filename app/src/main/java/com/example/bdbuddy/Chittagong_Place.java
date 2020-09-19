package com.example.bdbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class Chittagong_Place extends AppCompatActivity implements View.OnClickListener{

    Button Foy , Khoiyachora ,Kaptai,Boga,Cox,Nilachal,Nilgiri,Sajek,Mainamati ,debotakhum ,Chimbuk ,Alutila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__place);

        Foy =(Button) findViewById(R.id.Foy);
        Khoiyachora =(Button) findViewById(R.id.Khoiyachora);
        Kaptai =(Button) findViewById(R.id.Kaptai);
        Boga =(Button) findViewById(R.id.Boga);
        Cox =(Button) findViewById(R.id.Cox);
        Nilachal =(Button) findViewById(R.id.Nilachal);
        Nilgiri =(Button) findViewById(R.id.Nilgiri);
        Sajek =(Button) findViewById(R.id.Sajek);
        Mainamati =(Button) findViewById(R.id.Mainamati);
        debotakhum =(Button) findViewById(R.id.debotakhum);
        Chimbuk =(Button) findViewById(R.id.Chimbuk);
        Alutila =(Button) findViewById(R.id.Alutila);



        Foy.setOnClickListener(this);
        Khoiyachora.setOnClickListener(this);
        Kaptai.setOnClickListener(this);
        Boga.setOnClickListener(this);
        Cox.setOnClickListener(this);
        Nilachal.setOnClickListener(this);
        Nilgiri.setOnClickListener(this);
        Sajek.setOnClickListener(this);
        Mainamati.setOnClickListener(this);
        debotakhum.setOnClickListener(this);
        Chimbuk.setOnClickListener(this);
        Alutila.setOnClickListener(this);


    }



    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.Foy:

                Intent Intent = new Intent(Chittagong_Place.this, Chittagong_Place1.class);
                startActivity(Intent);

                break;

            case R.id.Khoiyachora:

                Intent aIntent = new Intent(Chittagong_Place.this, Chittagong_Place2.class);
                startActivity(aIntent);

                break;


            case R.id.Kaptai:

                Intent bIntent = new Intent(Chittagong_Place.this, Chittagong_Place3.class);
                startActivity(bIntent);

                break;

            case R.id.Boga:

                Intent cIntent = new Intent(Chittagong_Place.this, Chittagong_Place4.class);
                startActivity(cIntent);

                break;
            case R.id.Cox:

                Intent dIntent = new Intent(Chittagong_Place.this, Chittagong_Place5.class);
                startActivity(dIntent);

                break;

            case R.id.Nilgiri:

                Intent eIntent = new Intent(Chittagong_Place.this, Chittagong_Place6.class);
                startActivity(eIntent);

                break;
            case R.id.Nilachal:

                Intent fIntent = new Intent(Chittagong_Place.this, Chittagong_Place7.class);
                startActivity(fIntent);

                break;

            case R.id.Sajek:

                Intent gIntent = new Intent(Chittagong_Place.this, Chittagong_Place8.class);
                startActivity(gIntent);

                break;

            case R.id.Mainamati:

                Intent hIntent = new Intent(Chittagong_Place.this, Chittagong_Place9.class);
                startActivity(hIntent);

                break;



            case R.id.debotakhum:

                Intent iIntent = new Intent(Chittagong_Place.this, Chittagong_Place10.class);
                startActivity(iIntent);

                break;

            case R.id.Chimbuk:

                Intent jIntent = new Intent(Chittagong_Place.this, Chittagong_Place11.class);
                startActivity(jIntent);

                break;

            case R.id.Alutila:

                Intent kIntent = new Intent(Chittagong_Place.this, Chittagong_Place12.class);
                startActivity(kIntent);

                break;


        }

    }


}
