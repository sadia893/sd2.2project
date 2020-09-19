package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rangpur_Place2 extends AppCompatActivity implements View.OnClickListener{
    RadioButton rang2 ,ra2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur__place2);
        rang2 =(RadioButton) findViewById(R.id.tajhatmap);
        rang2.setOnClickListener(this);

        ra2 =(RadioButton) findViewById(R.id.tajhatweather);
        ra2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.tajhatmap:

                Intent Intent = new Intent(Rangpur_Place2.this, Maps_Rangpur1.class);
                startActivity(Intent);

                break;

            case R.id.tajhatweather:

                Intent aIntent = new Intent(Rangpur_Place2.this, Rangpur2.class);
                startActivity(aIntent);

                break;
        }

    }
}
