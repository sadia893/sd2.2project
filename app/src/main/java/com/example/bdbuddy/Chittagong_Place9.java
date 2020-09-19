package com.example.bdbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Chittagong_Place9 extends AppCompatActivity implements View.OnClickListener{
    Button cm9 , c9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__place9);

        cm9 =(RadioButton) findViewById(R.id.Mainamatimap);
        cm9.setOnClickListener(this);

        c9 =(RadioButton) findViewById(R.id.Mainamatiweather);
        c9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Mainamatimap:

                Intent Intent = new Intent(Chittagong_Place9.this, Maps_Chittagong9.class);
                startActivity(Intent);

                break;

            case R.id.Mainamatiweather:

                Intent aIntent = new Intent(Chittagong_Place9.this, Chittagong9.class);
                startActivity(aIntent);

                break;
        }
    }
}

