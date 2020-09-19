package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Khulna_Place2 extends AppCompatActivity implements View.OnClickListener{
    RadioButton km2 , k2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna__place2);

        km2 =(RadioButton) findViewById(R.id.Hironmap);
        km2.setOnClickListener(this);

        k2 =(RadioButton) findViewById(R.id.Hironweather);
        k2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Hironmap:

                Intent Intent = new Intent(Khulna_Place2.this, Maps_Khulna2.class);
                startActivity(Intent);

                break;

            case R.id.Hironweather:

                Intent aIntent = new Intent(Khulna_Place2.this, Khulna2.class);
                startActivity(aIntent);

                break;
        }
    }
}
