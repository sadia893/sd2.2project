package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Dhaka_Place14 extends AppCompatActivity implements View.OnClickListener{
    RadioButton dm14 ,d14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place14);
        dm14 =(RadioButton) findViewById(R.id.baldhamap);
        dm14.setOnClickListener(this);

        d14 =(RadioButton) findViewById(R.id.baldhaweather);
        d14.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.baldhamap:

                Intent intent = new Intent(Dhaka_Place14.this, Maps_Dhaka14.class);
                startActivity(intent);

                break;

            case R.id.baldhaweather:

                Intent aIntent = new Intent(Dhaka_Place14.this, Dhaka14.class);
                startActivity(aIntent);

                break;
        }
    }
}
