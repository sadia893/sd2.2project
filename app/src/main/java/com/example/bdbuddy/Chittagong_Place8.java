package com.example.bdbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Chittagong_Place8 extends AppCompatActivity implements View.OnClickListener{
    RadioButton cm8 , c8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__place8);

        cm8 =(RadioButton) findViewById(R.id.Sajekmap);
        cm8.setOnClickListener(this);


        c8 =(RadioButton) findViewById(R.id.Sajekweather);
        c8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Sajekmap:

                Intent Intent = new Intent(Chittagong_Place8.this, Maps_Chittagong8.class);
                startActivity(Intent);

                break;

            case R.id.Sajekweather:

                Intent aIntent = new Intent(Chittagong_Place8.this, Chittagong8.class);
                startActivity(aIntent);

                break;
        }
    }
}

