package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rajshahi extends AppCompatActivity implements View.OnClickListener {

    RadioButton raj1 ,rajf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi);
        raj1 = (RadioButton) findViewById(R.id.rajplace);
        rajf=(RadioButton)findViewById(R.id.rajfood);
        raj1.setOnClickListener(this);
        rajf.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.rajplace:

                Intent Intent = new Intent(Rajshahi.this, Rajshahi_Place.class);
                startActivity(Intent);

                break;

            case R.id.rajfood:

                Intent aIntent = new Intent(Rajshahi.this, Rajshahifood.class);
                startActivity(aIntent);

                break;


        }


    }
}
