package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Barisal_Place3 extends AppCompatActivity implements View.OnClickListener{
    RadioButton bm3 , b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal__place3);

        bm3 =(RadioButton) findViewById(R.id.Fatrarmap);
        bm3.setOnClickListener(this);

        b3 =(RadioButton) findViewById(R.id.Fatrarweather);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Fatrarmap:

                Intent Intent = new Intent(Barisal_Place3.this, Maps_Barisal3.class);
                startActivity(Intent);

                break;

            case R.id.Fatrarweather:

                Intent aIntent = new Intent(Barisal_Place3.this, Barisal3.class);
                startActivity(aIntent);

                break;
        }

    }
}


