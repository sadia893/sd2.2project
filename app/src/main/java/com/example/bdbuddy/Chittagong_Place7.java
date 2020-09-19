package com.example.bdbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Chittagong_Place7 extends AppCompatActivity implements View.OnClickListener {

    RadioButton cm7 , c7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__place7);

        cm7 =(RadioButton) findViewById(R.id.Nilgirimap);
        cm7.setOnClickListener(this);

        c7 =(RadioButton) findViewById(R.id.Nilgiriweather);
        c7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Nilgirimap:

                Intent Intent = new Intent(Chittagong_Place7.this, Maps_Chittagong7.class);
                startActivity(Intent);

                break;

            case R.id.Nilgiriweather:

                Intent aIntent = new Intent(Chittagong_Place7.this, Chittagong7.class);
                startActivity(aIntent);

                break;
        }
    }
}

