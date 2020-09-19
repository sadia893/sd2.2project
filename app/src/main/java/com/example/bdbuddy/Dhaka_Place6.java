package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Dhaka_Place6 extends AppCompatActivity implements View.OnClickListener{

    RadioButton dm6 , d6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place6);
        dm6 =(RadioButton) findViewById(R.id.shaheedmap);
        dm6.setOnClickListener(this);

        d6 =(RadioButton) findViewById(R.id.shaheedweather);
        d6.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.shaheedmap:

                Intent intent = new Intent(Dhaka_Place6.this, Maps_Dhaka6.class);
                startActivity(intent);

                break;

            case R.id.shaheedweather:

                Intent aIntent = new Intent(Dhaka_Place6.this, Dhaka6.class);
                startActivity(aIntent);

                break;
        }
    }
}
