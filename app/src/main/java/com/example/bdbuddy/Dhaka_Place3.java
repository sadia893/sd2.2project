package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Dhaka_Place3 extends AppCompatActivity implements View.OnClickListener{

    RadioButton dm3 , d3;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place3);
        dm3 =(RadioButton) findViewById(R.id.lalbagmap);
        dm3.setOnClickListener(this);

        d3 =(RadioButton) findViewById(R.id.lalbagweather);
        d3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.lalbagmap:

                Intent intent = new Intent(Dhaka_Place3.this, Maps_Dhaka3.class);
                startActivity(intent);

                break;

            case R.id.lalbagweather:

                Intent aIntent = new Intent(Dhaka_Place3.this, Dhaka3.class);
                startActivity(aIntent);

                break;
        }
    }
}
