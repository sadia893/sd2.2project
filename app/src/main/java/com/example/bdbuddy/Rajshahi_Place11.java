package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rajshahi_Place11 extends AppCompatActivity implements View.OnClickListener{

    RadioButton rm11 ,r11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi__place11);
        rm11 =(RadioButton) findViewById(R.id.Behularmap);
        rm11.setOnClickListener(this);

        r11 =(RadioButton) findViewById(R.id.Behularweather);
        r11.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Behularmap:

                Intent Intent = new Intent(Rajshahi_Place11.this, Maps_Rajshahi11.class);
                startActivity(Intent);

                break;

            case R.id.Behularweather:

                Intent aIntent = new Intent(Rajshahi_Place11.this, Rajshahi11.class);
                startActivity(aIntent);

                break;

        }
    }
}
