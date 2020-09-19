package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Mymensing_Place4 extends AppCompatActivity implements View.OnClickListener{
    RadioButton mm4 ,m4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensing__place4);

        mm4 =(RadioButton) findViewById(R.id.Alexandermap);
        mm4.setOnClickListener(this);

        m4 =(RadioButton) findViewById(R.id.Alexanderweather);
        m4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Alexandermap:

                Intent intent = new Intent(Mymensing_Place4.this, Maps_Mymensing4.class);
                startActivity(intent);

                break;

            case R.id.Alexanderweather:

                android.content.Intent aIntent = new Intent(Mymensing_Place4.this, Mymensing4.class);
                startActivity(aIntent);

                break;

        }
    }
}
