package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rangpur extends AppCompatActivity implements View.OnClickListener{


    RadioButton rang1 ,rangf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur);
        rang1 = (RadioButton) findViewById(R.id.rangplace);
        rangf =(RadioButton)findViewById(R.id.rangfood);

        rang1.setOnClickListener(this);
        rangf.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent aintent = new Intent(Rangpur.this, Rangpur_Place.class);
        startActivity(aintent);
        switch (v.getId()) {
            case R.id.rangplace:

                Intent Intent = new Intent(Rangpur.this, Rangpur_Place.class);
                startActivity(Intent);

                break;

            case R.id.rangfood:

                Intent aIntent = new Intent(Rangpur.this, Rangpurfood.class);
                startActivity(aIntent);

                break;


        }

    }
}





