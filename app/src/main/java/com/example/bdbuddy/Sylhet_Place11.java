package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Sylhet_Place11 extends AppCompatActivity implements View.OnClickListener{

    RadioButton sm11 , s11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet__place11);
        sm11 =(RadioButton) findViewById(R.id.Ratargulmap);
        sm11.setOnClickListener(this);


        s11 =(RadioButton) findViewById(R.id.Ratargulweather);
        s11.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Ratargulmap:

                Intent Intent = new Intent(Sylhet_Place11.this, Maps_Sylhet11.class);
                startActivity(Intent);

                break;

            case R.id.Ratargulweather:

                Intent aIntent = new Intent(Sylhet_Place11.this, Sylhet11.class);
                startActivity(aIntent);

                break;
        }
    }
}
