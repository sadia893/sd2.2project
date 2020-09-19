package com.example.bdbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Chittagong_Place2 extends AppCompatActivity implements View.OnClickListener{

    RadioButton cm2 , c2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__place2);
        cm2 =(RadioButton) findViewById(R.id.Khoiyachoramap);
        cm2.setOnClickListener(this);

        c2 =(RadioButton) findViewById(R.id.Khoiyachoraweather);
        c2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Khoiyachoramap:

                Intent Intent = new Intent(Chittagong_Place2.this, Maps_Chittagong2.class);
                startActivity(Intent);

                break;

            case R.id.Khoiyachoraweather:

                Intent aIntent = new Intent(Chittagong_Place2.this, Chittagong2.class);
                startActivity(aIntent);

                break;
        }
    }
}
