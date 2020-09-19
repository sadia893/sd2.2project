package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Barisal_Place1 extends AppCompatActivity implements View.OnClickListener{

    RadioButton bm1 ,b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal__place1);

        bm1 =(RadioButton) findViewById(R.id.Kuakatamap);
        bm1.setOnClickListener(this);


        b1 =(RadioButton) findViewById(R.id.Kuakataweather);
        b1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Kuakatamap:

                Intent Intent = new Intent(Barisal_Place1.this, Maps_Barisal1.class);
                startActivity(Intent);

                break;

            case R.id.Kuakataweather:

                Intent aIntent = new Intent(Barisal_Place1.this, Barisal1.class);
                startActivity(aIntent);

                break;

        }

    }
}


