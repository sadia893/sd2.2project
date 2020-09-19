package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rajshahi_Place2 extends AppCompatActivity  implements View.OnClickListener {

    RadioButton rm2 ,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi__place2);
        rm2 =(RadioButton) findViewById(R.id.Somapuramap);
        rm2.setOnClickListener(this);

        r2 =(RadioButton) findViewById(R.id.Somapuraweather);
        r2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Somapuramap:

                Intent Intent = new Intent(Rajshahi_Place2.this, Maps_Rajshahi2.class);
                startActivity(Intent);

                break;

            case R.id.Somapuraweather:

                Intent aIntent = new Intent(Rajshahi_Place2.this, Rajshahi2.class);
                startActivity(aIntent);

                break;

        }
    }
}
