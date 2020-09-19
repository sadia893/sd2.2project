package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rajshahi_Place10 extends AppCompatActivity implements View.OnClickListener{

    RadioButton rm10 , r10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi__place10);
        rm10 =(RadioButton) findViewById(R.id.Hardingemap);
        rm10.setOnClickListener(this);

        r10 =(RadioButton) findViewById(R.id.Hardingeweather);
        r10.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Hardingemap:

                Intent Intent = new Intent(Rajshahi_Place10.this, Maps_Rajshahi10.class);
                startActivity(Intent);

                break;

            case R.id.Hardingeweather:

                Intent aIntent = new Intent(Rajshahi_Place10.this, Rajshahi10.class);
                startActivity(aIntent);

                break;

        }
    }
}
