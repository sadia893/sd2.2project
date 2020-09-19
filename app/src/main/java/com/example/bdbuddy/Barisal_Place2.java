package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Barisal_Place2 extends AppCompatActivity implements View.OnClickListener{
    RadioButton bm2 , b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal__place2);

        bm2 =(RadioButton) findViewById(R.id.Sonarmap);
        bm2.setOnClickListener(this);

        b2 =(RadioButton) findViewById(R.id.Sonarweather);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Sonarmap:

                Intent d1intent = new Intent(Barisal_Place2.this, Maps_Barisal2.class);
                startActivity(d1intent);

                break;

            case R.id.Sonarweather:

                Intent aIntent = new Intent(Barisal_Place2.this, Barisal2.class);
                startActivity(aIntent);

                break;
        }

    }
}


