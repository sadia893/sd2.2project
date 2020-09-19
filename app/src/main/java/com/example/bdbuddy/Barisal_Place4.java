package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Barisal_Place4 extends AppCompatActivity implements View.OnClickListener{

    RadioButton bm4, b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal__place4);

        bm4 =(RadioButton) findViewById(R.id.Payramap);
        bm4.setOnClickListener(this);


        b4 =(RadioButton) findViewById(R.id.Payraweather);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {




        switch (v.getId()) {
            case R.id.Payramap:

                Intent Intent = new Intent(Barisal_Place4.this, Maps_Barisal4.class);
                startActivity(Intent);

                break;

            case R.id.Payraweather:

                Intent aIntent = new Intent(Barisal_Place4.this, Barisal4.class);
                startActivity(aIntent);

                break;
        }

    }
}


