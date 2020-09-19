package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Dhaka_Place8 extends AppCompatActivity implements View.OnClickListener {
    RadioButton dm8 , d8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place8);
        dm8 =(RadioButton) findViewById(R.id.museummap);
        dm8.setOnClickListener(this);

        d8 =(RadioButton) findViewById(R.id.museumweather);
        d8.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {




        switch (v.getId()) {
            case R.id.museummap:

                Intent intent = new Intent(Dhaka_Place8.this, Maps_Dhaka8.class);
                startActivity(intent);

                break;

            case R.id.museumweather:

                Intent aIntent = new Intent(Dhaka_Place8.this, Dhaka8.class);
                startActivity(aIntent);

                break;
        }
    }
}
