package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rangpur_Place1 extends AppCompatActivity implements View.OnClickListener{

    RadioButton rang1 , ra1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur__place1);
        rang1 =(RadioButton) findViewById(R.id.kantajewamap);
        rang1.setOnClickListener(this);

        ra1 =(RadioButton) findViewById(R.id.kantajewaweather);
        ra1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.kantajewamap:

                Intent Intent = new Intent(Rangpur_Place1.this, Maps_Rangpur1.class);
                startActivity(Intent);

                break;

            case R.id.kantajewaweather:

                Intent aIntent = new Intent(Rangpur_Place1.this, Rangpur1.class);
                startActivity(aIntent);

                break;
        }
    }
}
