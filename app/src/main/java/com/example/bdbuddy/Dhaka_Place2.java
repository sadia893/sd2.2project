package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Dhaka_Place2 extends AppCompatActivity implements View.OnClickListener{

    RadioButton dm2 , d2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place2);

        dm2 =(RadioButton) findViewById(R.id.ahsanmap);
        dm2.setOnClickListener(this);

        d2 =(RadioButton) findViewById(R.id.ahsanweather);
        d2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.ahsanmap:

                Intent intent = new Intent(Dhaka_Place2.this, Maps_Dhaka2.class);
                startActivity(intent);

                break;

            case R.id.ahsanweather:

                Intent aIntent = new Intent(Dhaka_Place2.this, Dhaka2.class);
                startActivity(aIntent);

                break;
        }
    }
}
