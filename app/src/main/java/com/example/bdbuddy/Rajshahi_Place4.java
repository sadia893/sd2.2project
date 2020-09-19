package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rajshahi_Place4 extends AppCompatActivity  implements View.OnClickListener{

    RadioButton rm4 , r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi__place4);
        rm4 =(RadioButton) findViewById(R.id.Baghamap);
        rm4.setOnClickListener(this);

        r4 =(RadioButton) findViewById(R.id.Baghaweather);
        r4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Baghamap:

                Intent Intent = new Intent(Rajshahi_Place4.this, Maps_Rajshahi4.class);
                startActivity(Intent);

                break;

            case R.id.Baghaweather:

                Intent aIntent = new Intent(Rajshahi_Place4.this, Rajshahi4.class);
                startActivity(aIntent);

                break;

        }
    }
}
