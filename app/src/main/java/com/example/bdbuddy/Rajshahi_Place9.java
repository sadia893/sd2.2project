package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rajshahi_Place9 extends AppCompatActivity implements View.OnClickListener{

    RadioButton rm9, r9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi__place9);
        rm9 =(RadioButton) findViewById(R.id.Lalonmap);
        rm9.setOnClickListener(this);


        r9 =(RadioButton) findViewById(R.id.Lalonweather);
        r9.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Lalonmap:

                Intent Intent = new Intent(Rajshahi_Place9.this, Maps_Rajshahi9.class);
                startActivity(Intent);

                break;

            case R.id.Lalonweather:

                Intent aIntent = new Intent(Rajshahi_Place9.this, Rajshahi9.class);
                startActivity(aIntent);

                break;

        }
    }
}
