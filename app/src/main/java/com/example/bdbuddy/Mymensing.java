package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Mymensing extends AppCompatActivity implements View.OnClickListener{
    RadioButton myr1 ,mf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensing);
        myr1 = (RadioButton) findViewById(R.id.myplace);
        mf =(RadioButton)findViewById(R.id.myfood);
        myr1.setOnClickListener(this);
        mf.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.myplace:

                Intent Intent = new Intent(Mymensing.this, Mymensing_Place.class);
                startActivity(Intent);

                break;

            case R.id.myfood:

                Intent aIntent = new Intent(Mymensing.this, Mymensingfood.class);
                startActivity(aIntent);

                break;


        }
        }
}



