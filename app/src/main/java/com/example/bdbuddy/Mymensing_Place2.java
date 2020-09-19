package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Mymensing_Place2 extends AppCompatActivity implements View.OnClickListener{
    RadioButton mm2 , m2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensing__place2);

        mm2 =(RadioButton) findViewById(R.id.Birishirimap);
        mm2.setOnClickListener(this);

        m2 =(RadioButton) findViewById(R.id.Birishiriweather);
        m2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Birishirimap:

                Intent intent = new Intent(Mymensing_Place2.this, Maps_Mymensing2.class);
                startActivity(intent);

                break;

            case R.id.Birishiriweather:

                android.content.Intent aIntent = new Intent(Mymensing_Place2.this, Mymensing2.class);
                startActivity(aIntent);

                break;
        }

    }
}
