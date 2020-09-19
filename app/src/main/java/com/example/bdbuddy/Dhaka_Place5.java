package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Dhaka_Place5 extends AppCompatActivity implements View.OnClickListener{
    RadioButton dm5 , d5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place5);
        dm5 =(RadioButton) findViewById(R.id.zoomap);
        dm5.setOnClickListener(this);

        d5 =(RadioButton) findViewById(R.id.zooweather);
        d5.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {




        switch (v.getId()) {
            case R.id.zoomap:

                Intent intent = new Intent(Dhaka_Place5.this, Maps_Dhaka5.class);
                startActivity(intent);

                break;

            case R.id.zooweather:

                Intent aIntent = new Intent(Dhaka_Place5.this, Dhaka5.class);
                startActivity(aIntent);

                break;
        }
    }
}
