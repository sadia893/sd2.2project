package com.example.bdbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;


public class Chittagong_Place4 extends AppCompatActivity implements View.OnClickListener{

    RadioButton cm4 , c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__place4);

        cm4 =(RadioButton) findViewById(R.id.Bogamap);
        cm4.setOnClickListener(this);

        c4 =(RadioButton) findViewById(R.id.Bogaweather);
        c4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.Bogamap:

                Intent Intent = new Intent(Chittagong_Place4.this, Maps_Chittagong4.class);
                startActivity(Intent);

                break;

            case R.id.Bogaweather:

                Intent aIntent = new Intent(Chittagong_Place4.this, Chittagong4.class);
                startActivity(aIntent);

                break;

        }
    }
}
