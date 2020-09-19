package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class Sylhet_Place5 extends AppCompatActivity implements View.OnClickListener{
    RadioButton sm5 , s5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet__place5);
        sm5 =(RadioButton) findViewById(R.id.Jaflongmap);
        sm5.setOnClickListener(this);


        s5 =(RadioButton) findViewById(R.id.Jaflongweather);
        s5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Jaflongmap:

                Intent Intent = new Intent(Sylhet_Place5.this, Maps_Sylhet5.class);
                startActivity(Intent);

                break;

            case R.id.Jaflongweather:

                Intent aIntent = new Intent(Sylhet_Place5.this, Sylhet5.class);
                startActivity(aIntent);

                break;
        }
    }
}
