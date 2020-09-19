package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Khulna extends AppCompatActivity implements View.OnClickListener{
    RadioButton kr1 , kf;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna);
        kr1 = (RadioButton) findViewById(R.id.khuplace);
        kf =(RadioButton)findViewById(R.id.khufood);
        kr1.setOnClickListener(this);
        kf.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        Intent aintent = new Intent(Khulna.this, Khulna_Place.class);
        startActivity(aintent);

        switch (v.getId()) {
            case R.id.khuplace:

                Intent Intent = new Intent(Khulna.this, Khulna_Place.class);
                startActivity(Intent);

                break;

            case R.id.khufood:

                Intent aIntent = new Intent(Khulna.this, Khulnafood.class);
                startActivity(aIntent);

                break;

        }

        }
}



