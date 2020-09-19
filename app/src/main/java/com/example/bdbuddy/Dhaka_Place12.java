package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Dhaka_Place12 extends AppCompatActivity implements View.OnClickListener{

    RadioButton dm12 , d12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place12);
        dm12 =(RadioButton) findViewById(R.id.bytulmap);
        dm12.setOnClickListener(this);

        d12 =(RadioButton) findViewById(R.id.bytulweather);
        d12.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {




        switch (v.getId()) {
            case R.id.bytulmap:

                Intent intent = new Intent(Dhaka_Place12.this, Maps_Dhaka12.class);
                startActivity(intent);

                break;

            case R.id.bytulweather:

                Intent aIntent = new Intent(Dhaka_Place12.this, Dhaka12.class);
                startActivity(aIntent);

                break;
        }
    }
}
