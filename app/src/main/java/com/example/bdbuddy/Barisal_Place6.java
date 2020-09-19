package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Barisal_Place6 extends AppCompatActivity implements View.OnClickListener {

    RadioButton bm6 , b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal__place6);

        bm6 =(RadioButton) findViewById(R.id.barisaldmmap);
        bm6.setOnClickListener(this);

        b6 =(RadioButton) findViewById(R.id.barisaldmweather);
        b6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {




        switch (v.getId()) {
            case R.id.barisaldmmap:

                Intent Intent = new Intent(Barisal_Place6.this, Maps_Barisal6.class);
                startActivity(Intent);

                break;

            case R.id.barisaldmweather:

                Intent aIntent = new Intent(Barisal_Place6.this, Barisal6.class);
                startActivity(aIntent);

                break;
        }
    }
}


