package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Khulna_Place1 extends AppCompatActivity implements View.OnClickListener{
    RadioButton km1 , k1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna__place1);

        km1 =(RadioButton) findViewById(R.id.Rabindranathmap);
        km1.setOnClickListener(this);

        k1 =(RadioButton) findViewById(R.id.Rabindranathweather);
        k1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.Rabindranathmap:

                Intent Intent = new Intent(Khulna_Place1.this, Maps_Khulna1.class);
                startActivity(Intent);

                break;

            case R.id.Rabindranathweather:

                Intent aIntent = new Intent(Khulna_Place1.this, Khulna1.class);
                startActivity(aIntent);

                break;
        }
    }
}
