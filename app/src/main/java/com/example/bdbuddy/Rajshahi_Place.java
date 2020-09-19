package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rajshahi_Place extends AppCompatActivity implements View.OnClickListener {


    Button Varendra ,Somapura ,Puthia ,Bagha ,Royal ,Mahasthangarh,Shona ,Kushumba ,Lalon ,Hardinge ,Behular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi__place);

        Varendra =(Button) findViewById(R.id.Varendra);
        Somapura =(Button) findViewById(R.id.Somapura);
        Puthia =(Button) findViewById(R.id.Puthia);
        Bagha=(Button) findViewById(R.id.Bagha);
        Royal =(Button) findViewById(R.id.Royal);
        Mahasthangarh =(Button) findViewById(R.id.Mahasthangarh);
        Shona =(Button) findViewById(R.id.Shona);
        Kushumba =(Button) findViewById(R.id.Kushumba);
        Lalon =(Button) findViewById(R.id.Lalon);
        Hardinge =(Button) findViewById(R.id.Hardinge);
        Behular =(Button) findViewById(R.id.Behular);




        Varendra.setOnClickListener(this);
        Somapura.setOnClickListener(this);
        Puthia.setOnClickListener(this);
        Bagha.setOnClickListener(this);
        Royal.setOnClickListener(this);
        Mahasthangarh.setOnClickListener(this);
        Shona.setOnClickListener(this);
        Kushumba.setOnClickListener(this);
        Lalon.setOnClickListener(this);
        Hardinge.setOnClickListener(this);
        Behular.setOnClickListener(this);
    }





    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Varendra:

                Intent Intent = new Intent(Rajshahi_Place.this, Rajshahi_Place1.class);
                startActivity(Intent);

                break;

            case R.id.Somapura:

                Intent aIntent = new Intent(Rajshahi_Place.this, Rajshahi_Place2.class);
                startActivity(aIntent);

                break;


            case R.id.Puthia:

                Intent bIntent = new Intent(Rajshahi_Place.this, Rajshahi_Place3.class);
                startActivity(bIntent);

                break;

            case R.id.Bagha:

                Intent cIntent = new Intent(Rajshahi_Place.this, Rajshahi_Place4.class);
                startActivity(cIntent);

                break;
            case R.id.Royal:

                Intent dIntent = new Intent(Rajshahi_Place.this, Rajshahi_Place5.class);
                startActivity(dIntent);

                break;


            case R.id.Mahasthangarh:

                Intent gIntent = new Intent(Rajshahi_Place.this, Rajshahi_Place6.class);
                startActivity(gIntent);

                break;


            case R.id.Shona:

                Intent eIntent = new Intent(Rajshahi_Place.this, Rajshahi_Place7.class);
                startActivity(eIntent);

                break;
            case R.id.Kushumba:

                Intent fIntent = new Intent(Rajshahi_Place.this, Rajshahi_Place8.class);
                startActivity(fIntent);

                break;

            case R.id.Lalon:

                Intent iIntent = new Intent(Rajshahi_Place.this, Rajshahi_Place9.class);
                startActivity(iIntent);

                break;

            case R.id.Hardinge:

                Intent hIntent = new Intent(Rajshahi_Place.this, Rajshahi_Place10.class);
                startActivity(hIntent);

                break;


            case R.id.Behular:

                Intent jIntent = new Intent(Rajshahi_Place.this, Rajshahi_Place11.class);
                startActivity(jIntent);

                break;

        }

    }
}
