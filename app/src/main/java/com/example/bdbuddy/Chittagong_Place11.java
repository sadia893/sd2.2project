package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Chittagong_Place11 extends AppCompatActivity  implements View.OnClickListener{

    Button cm11 , c11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__place11);


        cm11 =(RadioButton) findViewById(R.id.Chimbukmap);
        cm11.setOnClickListener(this);

        c11 =(RadioButton) findViewById(R.id.Chimbukweather);
        c11.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Chimbukmap:

                Intent Intent = new Intent(Chittagong_Place11.this, Maps_Chittagong11.class);
                startActivity(Intent);

                break;

            case R.id.Chimbukweather:

                Intent aIntent = new Intent(Chittagong_Place11.this, Chittagong11.class);
                startActivity(aIntent);

                break;
        }
    }
}
