package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rangpur_Place extends AppCompatActivity implements View.OnClickListener{

    Button kantajew, tajhat , Nayabad , Choto , Begum , Teesta ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur__place);


        kantajew =(Button) findViewById(R.id.kantajew);
        tajhat =(Button) findViewById(R.id.tajhat);
        Nayabad =(Button) findViewById(R.id.Nayabad);
        Choto=(Button) findViewById(R.id.Choto);
        Begum =(Button) findViewById(R.id.Begum);
        Teesta =(Button) findViewById(R.id.Teesta);


        kantajew.setOnClickListener(this);
        tajhat.setOnClickListener(this);
        Nayabad.setOnClickListener(this);
        Choto.setOnClickListener(this);
        Begum.setOnClickListener(this);
        Teesta.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.kantajew:

                Intent Intent = new Intent(Rangpur_Place.this, Rangpur_Place1.class);
                startActivity(Intent);

                break;

            case R.id.tajhat:

                Intent aIntent = new Intent(Rangpur_Place.this, Rangpur_Place2.class);
                startActivity(aIntent);

                break;


            case R.id.Nayabad:

                Intent bIntent = new Intent(Rangpur_Place.this, Rangpur_Place3.class);
                startActivity(bIntent);

                break;

            case R.id.Choto:

                Intent cIntent = new Intent(Rangpur_Place.this, Rangpur_Place4.class);
                startActivity(cIntent);

                break;
            case R.id.Begum:

                Intent dIntent = new Intent(Rangpur_Place.this, Rangpur_Place5.class);
                startActivity(dIntent);

                break;


            case R.id.Teesta:

                Intent gIntent = new Intent(Rangpur_Place.this, Rangpur_Place6.class);
                startActivity(gIntent);

                break;
        }
        }
}
