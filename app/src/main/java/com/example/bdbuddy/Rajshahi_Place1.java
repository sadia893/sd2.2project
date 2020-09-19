package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rajshahi_Place1 extends AppCompatActivity implements View.OnClickListener{


    RadioButton rm1 , r1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi__place1);
        rm1 =(RadioButton) findViewById(R.id.Varendramap);
        rm1.setOnClickListener(this);

        r1 =(RadioButton) findViewById(R.id.Varendraweather);
        r1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Varendramap:

                Intent Intent = new Intent(Rajshahi_Place1.this, Maps_Rajshahi1.class);
                startActivity(Intent);

                break;

            case R.id.Varendraweather:

                Intent aIntent = new Intent(Rajshahi_Place1.this, Rajshahi1.class);
                startActivity(aIntent);

                break;

        }
    }
}
