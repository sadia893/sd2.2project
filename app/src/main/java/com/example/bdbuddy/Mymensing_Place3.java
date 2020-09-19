package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Mymensing_Place3 extends AppCompatActivity implements View.OnClickListener{
    RadioButton mm3 , m3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensing__place3);

        mm3 =(RadioButton) findViewById(R.id.Niklimap);
        mm3.setOnClickListener(this);

        m3 =(RadioButton) findViewById(R.id.Nikliweather);
        m3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Niklimap:

                Intent intent = new Intent(Mymensing_Place3.this, Maps_Mymensing3.class);
                startActivity(intent);

                break;

            case R.id.Nikliweather:

                android.content.Intent aIntent = new Intent(Mymensing_Place3.this, Mymensing3.class);
                startActivity(aIntent);

                break;
        }

    }
}
