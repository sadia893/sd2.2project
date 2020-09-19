package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class Sylhet_Place8 extends AppCompatActivity implements View.OnClickListener{
    RadioButton sm8 , s8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet__place8);

        sm8 =(RadioButton) findViewById(R.id.Lalamap);
        sm8.setOnClickListener(this);


        s8 =(RadioButton) findViewById(R.id.Lalaweather);
        s8.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Lalamap:

                Intent Intent = new Intent(Sylhet_Place8.this, Maps_Sylhet8.class);
                startActivity(Intent);

                break;

            case R.id.Lalaweather:

                Intent aIntent = new Intent(Sylhet_Place8.this, Sylhet8.class);
                startActivity(aIntent);

                break;
        }
    }
}
