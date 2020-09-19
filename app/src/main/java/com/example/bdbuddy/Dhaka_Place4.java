package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Dhaka_Place4 extends AppCompatActivity implements View.OnClickListener{
    RadioButton dm4 ,d4;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place4);
        dm4 =(RadioButton) findViewById(R.id.parlamentmap);
        dm4.setOnClickListener(this);

        d4 =(RadioButton) findViewById(R.id.parlamentweather);
        d4.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.parlamentmap:

                Intent intent = new Intent(Dhaka_Place4.this, Maps_Dhaka4.class);
                startActivity(intent);

                break;

            case R.id.parlamentweather:

                Intent aIntent = new Intent(Dhaka_Place4.this, Dhaka4.class);
                startActivity(aIntent);

                break;
        }
    }
}
