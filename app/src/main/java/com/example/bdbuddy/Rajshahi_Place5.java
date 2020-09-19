package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rajshahi_Place5 extends AppCompatActivity  implements View.OnClickListener{

    RadioButton rm5 ,r5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi__place5);
        rm5 =(RadioButton) findViewById(R.id.Royalmap);
        rm5.setOnClickListener(this);

        r5 =(RadioButton) findViewById(R.id.Royalweather);
        r5.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Royalmap:

                Intent Intent = new Intent(Rajshahi_Place5.this, Maps_Rajshahi5.class);
                startActivity(Intent);

                break;

            case R.id.Royalweather:

                Intent aIntent = new Intent(Rajshahi_Place5.this, Rajshahi5.class);
                startActivity(aIntent);

                break;


        }
    }
}
