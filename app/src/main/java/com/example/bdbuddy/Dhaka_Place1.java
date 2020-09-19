package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Dhaka_Place1 extends AppCompatActivity implements View.OnClickListener{
    RadioButton dm1  , d1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place1);

        dm1 =(RadioButton) findViewById(R.id.arialmap);
        dm1.setOnClickListener(this);

        d1 =(RadioButton) findViewById(R.id.arialweather);
        d1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.arialmap:

                Intent intent = new Intent(Dhaka_Place1.this, Maps_Dhaka1.class);
                startActivity(intent);

                break;

            case R.id.arialweather:

                Intent aIntent = new Intent(Dhaka_Place1.this, Dhaka1.class);
                startActivity(aIntent);

                break;
        }
    }
}


