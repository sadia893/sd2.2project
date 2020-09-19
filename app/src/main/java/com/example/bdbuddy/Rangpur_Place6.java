
package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rangpur_Place6 extends AppCompatActivity implements View.OnClickListener{
    RadioButton rang6 ,ra6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur__place6);

        rang6 =(RadioButton) findViewById(R.id.Teestamap);
        rang6.setOnClickListener(this);

        ra6 =(RadioButton) findViewById(R.id.Teestaweather);
        ra6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Teestamap:

                Intent Intent = new Intent(Rangpur_Place6.this, Maps_Rangpur5.class);
                startActivity(Intent);

                break;

            case R.id.Teestaweather:

                Intent aIntent = new Intent(Rangpur_Place6.this, Rangpur6.class);
                startActivity(aIntent);

                break;
        }
    }
}