package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Chittagong_Place10 extends AppCompatActivity  implements View.OnClickListener{

    Button cm10 ,c10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__place10);


        cm10 =(RadioButton) findViewById(R.id.debotakhummap);
        cm10.setOnClickListener(this);

        c10 =(RadioButton) findViewById(R.id.debotakhumweather);
        c10.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.debotakhummap:

                Intent Intent = new Intent(Chittagong_Place10.this, Maps_Chittagong10.class);
                startActivity(Intent);

                break;

            case R.id.debotakhumweather:

                Intent aIntent = new Intent(Chittagong_Place10.this, Chittagong10.class);
                startActivity(aIntent);

                break;
        }
    }
}
