package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class Sylhet_Place2 extends AppCompatActivity implements View.OnClickListener{

    RadioButton sm2 ,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet__place2);
        sm2 =(RadioButton) findViewById(R.id.Hazratmap);
        sm2.setOnClickListener(this);


        s2 =(RadioButton) findViewById(R.id.Hazratweather);
        s2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Hazratmap:

                Intent Intent = new Intent(Sylhet_Place2.this, Maps_Sylhet2.class);
                startActivity(Intent);

                break;

            case R.id.Hazratweather:

                Intent aIntent = new Intent(Sylhet_Place2.this, Sylhet2.class);
                startActivity(aIntent);

                break;
        }
    }
}
