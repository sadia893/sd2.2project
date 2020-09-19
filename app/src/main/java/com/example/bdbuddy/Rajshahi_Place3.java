package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rajshahi_Place3 extends AppCompatActivity  implements View.OnClickListener{


    RadioButton rm3 , r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi__place3);
        rm3=(RadioButton) findViewById(R.id.Puthiamap);
        rm3.setOnClickListener(this);

        r3 =(RadioButton) findViewById(R.id.Puthiaweather);
        r3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Puthiamap:

                Intent Intent = new Intent(Rajshahi_Place3.this, Maps_Rajshahi3.class);
                startActivity(Intent);

                break;

            case R.id.Puthiaweather:

                Intent aIntent = new Intent(Rajshahi_Place3.this, Rajshahi3.class);
                startActivity(aIntent);

                break;

        }
    }
}
