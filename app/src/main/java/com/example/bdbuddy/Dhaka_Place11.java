package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Dhaka_Place11 extends AppCompatActivity implements View.OnClickListener{
    RadioButton dm11, d11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place11);
        dm11 =(RadioButton) findViewById(R.id.dhakesharimap);
        dm11.setOnClickListener(this);

        d11 =(RadioButton) findViewById(R.id.dhakeshariweather);
        d11.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {




        switch (v.getId()) {
            case R.id.dhakesharimap:

                Intent intent = new Intent(Dhaka_Place11.this, Maps_Dhaka11.class);
                startActivity(intent);

                break;

            case R.id.dhakeshariweather:

                Intent aIntent = new Intent(Dhaka_Place11.this, Dhaka11.class);
                startActivity(aIntent);

                break;
        }
    }
}
