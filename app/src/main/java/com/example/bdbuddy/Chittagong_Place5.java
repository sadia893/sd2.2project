package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Chittagong_Place5 extends AppCompatActivity implements View.OnClickListener{

    RadioButton cm5 , c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__place5);

        cm5 =(RadioButton) findViewById(R.id.Coxmap);
        cm5.setOnClickListener(this);

        c5 =(RadioButton) findViewById(R.id.Coxweather);
        c5.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.Coxmap:

                Intent Intent = new Intent(Chittagong_Place5.this, Maps_Chittagong5.class);
                startActivity(Intent);

                break;

            case R.id.Coxweather:

                Intent aIntent = new Intent(Chittagong_Place5.this, Chittagong5.class);
                startActivity(aIntent);

                break;
        }

    }
}
