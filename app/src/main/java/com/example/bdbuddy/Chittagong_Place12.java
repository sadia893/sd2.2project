package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Chittagong_Place12 extends AppCompatActivity implements View.OnClickListener{

    Button cm12 , c12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__place12);

        cm12 =(RadioButton) findViewById(R.id.Alutilamap);
        cm12.setOnClickListener(this);


        c12 =(RadioButton) findViewById(R.id.Alutilaweather);
        c12.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Alutilamap:

                Intent Intent = new Intent(Chittagong_Place12.this, Maps_Chittagong12.class);
                startActivity(Intent);

                break;

            case R.id.Alutilaweather:

                Intent aIntent = new Intent(Chittagong_Place12.this, Chittagong12.class);
                startActivity(aIntent);

                break;
        }
    }
}
