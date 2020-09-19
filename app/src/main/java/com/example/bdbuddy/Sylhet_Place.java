package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sylhet_Place extends AppCompatActivity implements View.OnClickListener{


    Button Ali ,Hazrat ,Tanguar ,SREEMANGAL ,Jaflong ,Bisnakandi ,Lova ,Lala ,malnicherra ,Kala ,Ratargul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet__place);


        Ali =(Button) findViewById(R.id.Ali);
        Hazrat =(Button) findViewById(R.id.Hazrat);
        Tanguar =(Button) findViewById(R.id.Tanguar);
        SREEMANGAL=(Button) findViewById(R.id.SREEMANGAL);
        Jaflong =(Button) findViewById(R.id.Jaflong);
        Bisnakandi =(Button) findViewById(R.id.Bisnakandi);
        Lova =(Button) findViewById(R.id.Lova);
        Lala =(Button) findViewById(R.id.Lala);
        malnicherra =(Button) findViewById(R.id.malnicherra);
        Kala =(Button) findViewById(R.id.kala);
        Ratargul =(Button) findViewById(R.id.Ratargul);



        Ali.setOnClickListener(this);
        Hazrat.setOnClickListener(this);
        Tanguar.setOnClickListener(this);
        SREEMANGAL.setOnClickListener(this);
        Jaflong.setOnClickListener(this);
        Bisnakandi.setOnClickListener(this);
        Lova.setOnClickListener(this);
        Lala.setOnClickListener(this);
        malnicherra.setOnClickListener(this);
        Kala.setOnClickListener(this);
        Ratargul.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Ali:

                Intent Intent = new Intent(Sylhet_Place.this, Sylhet_Place1.class);
                startActivity(Intent);

                break;

            case R.id.Hazrat:

                Intent aIntent = new Intent(Sylhet_Place.this,  Sylhet_Place2.class);
                startActivity(aIntent);

                break;


            case R.id.Tanguar:

                Intent bIntent = new Intent(Sylhet_Place.this, Sylhet_Place3.class);
                startActivity(bIntent);

                break;

            case R.id.SREEMANGAL:

                Intent cIntent = new Intent(Sylhet_Place.this, Sylhet_Place4.class);
                startActivity(cIntent);

                break;
            case R.id.Jaflong:

                Intent dIntent = new Intent(Sylhet_Place.this, Sylhet_Place5.class);
                startActivity(dIntent);

                break;


            case R.id.Bisnakandi:

                Intent gIntent = new Intent(Sylhet_Place.this, Sylhet_Place6.class);
                startActivity(gIntent);

                break;


            case R.id.Lova:

                Intent eIntent = new Intent(Sylhet_Place.this, Sylhet_Place7.class);
                startActivity(eIntent);

                break;
            case R.id.Lala:

                Intent fIntent = new Intent(Sylhet_Place.this, Sylhet_Place8.class);
                startActivity(fIntent);

                break;

            case R.id.malnicherra:

                Intent iIntent = new Intent(Sylhet_Place.this, Sylhet_Place9.class);
                startActivity(iIntent);

                break;

            case R.id.kala:

                Intent hIntent = new Intent(Sylhet_Place.this, Sylhet_Place10.class);
                startActivity(hIntent);

                break;


            case R.id.Ratargul:

                Intent jIntent = new Intent(Sylhet_Place.this, Sylhet_Place11.class);
                startActivity(jIntent);

                break;

        }

    }
}
