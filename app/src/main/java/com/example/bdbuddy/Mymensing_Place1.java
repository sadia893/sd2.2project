package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Mymensing_Place1 extends AppCompatActivity implements View.OnClickListener{
    RadioButton mm1 ,m2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensing__place1);

        mm1 =(RadioButton) findViewById(R.id.Shilpacharyamap);
        mm1.setOnClickListener(this);

        m2 =(RadioButton) findViewById(R.id.Shilpacharyaweather);
        m2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Shilpacharyamap:

                Intent intent = new Intent(Mymensing_Place1.this, Maps_Mymensing1.class);
                startActivity(intent);

                break;

            case R.id.Shilpacharyaweather:

                android.content.Intent aIntent = new Intent(Mymensing_Place1.this, Mymensing1.class);
                startActivity(aIntent);

                break;
        }

    }
}
