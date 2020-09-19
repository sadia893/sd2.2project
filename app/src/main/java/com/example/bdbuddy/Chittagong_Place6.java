package com.example.bdbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Chittagong_Place6 extends AppCompatActivity implements View.OnClickListener{
    RadioButton cm6 , c6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__place6);
        cm6 =(RadioButton) findViewById(R.id.Nilachalmap);
        cm6.setOnClickListener(this);

        c6 =(RadioButton) findViewById(R.id.Nilachalweather);
        c6.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Nilachalmap:

                Intent Intent = new Intent(Chittagong_Place6.this, Maps_Chittagong6.class);
                startActivity(Intent);

                break;

            case R.id.Nilachalweather:

                Intent aIntent = new Intent(Chittagong_Place6.this, Chittagong6.class);
                startActivity(aIntent);

                break;
        }
    }
}


