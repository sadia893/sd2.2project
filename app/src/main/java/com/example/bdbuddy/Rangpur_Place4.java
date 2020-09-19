package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rangpur_Place4 extends AppCompatActivity implements View.OnClickListener{
    RadioButton rang4 ,ra4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur__place4);
        rang4 =(RadioButton) findViewById(R.id.Chotomap);
        rang4.setOnClickListener(this);

        ra4 =(RadioButton) findViewById(R.id.Chotoweather);
        ra4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Chotomap:

                Intent Intent = new Intent(Rangpur_Place4.this, Maps_Rangpur4.class);
                startActivity(Intent);

                break;

            case R.id.Chotoweather:

                Intent aIntent = new Intent(Rangpur_Place4.this, Rangpur4.class);
                startActivity(aIntent);

                break;


        }
    }
}
