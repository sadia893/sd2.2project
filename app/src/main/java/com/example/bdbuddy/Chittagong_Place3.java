package com.example.bdbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Chittagong_Place3 extends AppCompatActivity implements View.OnClickListener{

    RadioButton cm3 , c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__place3);

        cm3 =(RadioButton) findViewById(R.id.Kaptaimap);
        cm3.setOnClickListener(this);

        c3 =(RadioButton) findViewById(R.id.Kaptaiweather);
        c3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Kaptaimap:

                Intent Intent = new Intent(Chittagong_Place3.this, Maps_Chittagong3.class);
                startActivity(Intent);

                break;

            case R.id.Kaptaiweather:

                Intent aIntent = new Intent(Chittagong_Place3.this, Chittagong3.class);
                startActivity(aIntent);

                break;
        }
    }
}
