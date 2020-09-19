package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class Sylhet_Place3 extends AppCompatActivity implements View.OnClickListener{

    RadioButton sm3 ,s3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet__place3);

        sm3 =(RadioButton) findViewById(R.id.Tanguarmap);
        sm3.setOnClickListener(this);


        s3 =(RadioButton) findViewById(R.id.Tanguarweather);
        s3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Tanguarmap:

                Intent Intent = new Intent(Sylhet_Place3.this, Maps_Sylhet3.class);
                startActivity(Intent);

                break;

            case R.id.Tanguarweather:

                Intent aIntent = new Intent(Sylhet_Place3.this, Sylhet3.class);
                startActivity(aIntent);

                break;
        }

    }

}
