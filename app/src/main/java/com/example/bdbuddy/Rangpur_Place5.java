package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rangpur_Place5 extends AppCompatActivity  implements View.OnClickListener{
    RadioButton rang5 ,ra5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur__place5);

        rang5 =(RadioButton) findViewById(R.id.Begummap);
        rang5.setOnClickListener(this);
        ra5 =(RadioButton) findViewById(R.id.Begumweather);
        ra5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Begummap:

                Intent Intent = new Intent(Rangpur_Place5.this, Maps_Rangpur5.class);
                startActivity(Intent);

                break;

            case R.id.Begumweather:

                Intent aIntent = new Intent(Rangpur_Place5.this, Rangpur5.class);
                startActivity(aIntent);

                break;
        }

    }
}
