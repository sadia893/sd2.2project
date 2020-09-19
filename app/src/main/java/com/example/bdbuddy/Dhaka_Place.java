package com.example.bdbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dhaka_Place extends AppCompatActivity implements View.OnClickListener {

    Button arial ,ahsan ,lal ,parlament,zoo ,shaheed,martyrs,museum,hossani,curzon,dhakeshari,bytul,sonargaon,baldha ,safari;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place);
        arial =(Button) findViewById(R.id.arial);
        ahsan =(Button) findViewById(R.id.ahsan);
        lal =(Button) findViewById(R.id.lal);
        parlament =(Button) findViewById(R.id.parlament);
        zoo =(Button) findViewById(R.id.zoo);
        shaheed =(Button) findViewById(R.id.shaheed);
        martyrs =(Button) findViewById(R.id.martyrs);
        museum =(Button) findViewById(R.id.museum);
        hossani =(Button) findViewById(R.id.hossani);
        curzon =(Button) findViewById(R.id.curzon);
        dhakeshari =(Button) findViewById(R.id.dhakeshari);
        bytul =(Button) findViewById(R.id.bytul);
        sonargaon =(Button) findViewById(R.id.sonargaon);
        baldha =(Button) findViewById(R.id.baldha);
        safari =(Button) findViewById(R.id.safari);






        arial.setOnClickListener(this);
        ahsan.setOnClickListener(this);
        lal.setOnClickListener(this);
        parlament.setOnClickListener(this);
        zoo.setOnClickListener(this);
        shaheed.setOnClickListener(this);
        martyrs.setOnClickListener(this);
        museum.setOnClickListener(this);
        hossani.setOnClickListener(this);
        curzon.setOnClickListener(this);
        dhakeshari.setOnClickListener(this);
        bytul.setOnClickListener(this);
        sonargaon.setOnClickListener(this);
        baldha.setOnClickListener(this);
        safari.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.arial:

                Intent intent = new Intent(Dhaka_Place.this, Dhaka_Place1.class);
                startActivity(intent);

                break;

            case R.id.ahsan:

                Intent aIntent = new Intent(Dhaka_Place.this, Dhaka_Place2.class);
                startActivity(aIntent);

                break;


            case R.id.lal:

                Intent bIntent = new Intent(Dhaka_Place.this, Dhaka_Place3.class);
                startActivity(bIntent);

                break;

            case R.id.parlament:

                Intent cIntent = new Intent(Dhaka_Place.this, Dhaka_Place4.class);
                startActivity(cIntent);

                break;
            case R.id.zoo:

                Intent dIntent = new Intent(Dhaka_Place.this, Dhaka_Place5.class);
                startActivity(dIntent);

                break;

            case R.id.shaheed:

                Intent eIntent = new Intent(Dhaka_Place.this, Dhaka_Place6.class);
                startActivity(eIntent);

                break;
            case R.id.martyrs:

                Intent fIntent = new Intent(Dhaka_Place.this, Dhaka_Place7.class);
                startActivity(fIntent);

                break;

            case R.id.museum:

                Intent gIntent = new Intent(Dhaka_Place.this, Dhaka_Place8.class);
                startActivity(gIntent);

                break;

            case R.id.hossani:

                Intent hIntent = new Intent(Dhaka_Place.this, Dhaka_Place9.class);
                startActivity(hIntent);

                break;

            case R.id.curzon:

                Intent iIntent = new Intent(Dhaka_Place.this, Dhaka_Place10.class);
                startActivity(iIntent);

                break;
            case R.id.dhakeshari:

                Intent jIntent = new Intent(Dhaka_Place.this, Dhaka_Place11.class);
                startActivity(jIntent);

                break;

            case R.id.bytul:

                Intent kIntent = new Intent(Dhaka_Place.this, Dhaka_Place12.class);
                startActivity(kIntent);

                break;


            case R.id.sonargaon:

                Intent lIntent = new Intent(Dhaka_Place.this, Dhaka_Place13.class);
                startActivity(lIntent);

                break;
            case R.id.baldha:

                Intent mIntent = new Intent(Dhaka_Place.this, Dhaka_Place14.class);
                startActivity(mIntent);

                break;

            case R.id.safari:

                Intent nIntent = new Intent(Dhaka_Place.this, Dhaka_Place15.class);
                startActivity(nIntent);

                break;


        }

    }
}
