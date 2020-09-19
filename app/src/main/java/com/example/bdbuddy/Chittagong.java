package com.example.bdbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Chittagong extends AppCompatActivity implements View.OnClickListener {
    RadioButton cr1 ,cf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong);
        cr1 = (RadioButton) findViewById(R.id.chplace);
        cf =(RadioButton)findViewById(R.id.chfood);
        cr1.setOnClickListener(this);
        cf.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent aintent = new Intent(Chittagong.this, Chittagong_Place.class);
        startActivity(aintent);

        switch (v.getId()) {
            case R.id.chplace:

                Intent Intent = new Intent(Chittagong.this, Chittagong_Place.class);
                startActivity(Intent);

                break;

            case R.id.chfood:

                Intent aIntent = new Intent(Chittagong.this, Chittagongfood.class);
                startActivity(aIntent);

                break;

        }

        }
}
