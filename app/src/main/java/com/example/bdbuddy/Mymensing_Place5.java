package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Mymensing_Place5 extends AppCompatActivity implements View.OnClickListener{
    RadioButton mm5 , m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensing__place5);

        mm5 =(RadioButton) findViewById(R.id.Shashimap);
        mm5.setOnClickListener(this);

        m5 =(RadioButton) findViewById(R.id.Shashiweather);
        m5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Shashimap:

                Intent intent = new Intent(Mymensing_Place5.this, Maps_Mymensing5.class);
                startActivity(intent);

                break;

            case R.id.Shashiweather:

                android.content.Intent aIntent = new Intent(Mymensing_Place5.this, Mymensing5.class);
                startActivity(aIntent);

                break;
        }

    }
}
