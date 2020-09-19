package com.example.bdbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Dhaka_Place10 extends AppCompatActivity implements View.OnClickListener{
    RadioButton dm10 , d10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place10);
        dm10 =(RadioButton) findViewById(R.id.curzonmap);
        dm10.setOnClickListener(this);

        d10 =(RadioButton) findViewById(R.id.curzonweather);
        d10.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.curzonmap:

                Intent intent = new Intent(Dhaka_Place10.this, Maps_Dhaka10.class);
                startActivity(intent);

                break;

            case R.id.curzonweather:

                Intent aIntent = new Intent(Dhaka_Place10.this, Dhaka10.class);
                startActivity(aIntent);

                break;
        }
    }
}
