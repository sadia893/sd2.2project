package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Khulna_Place5 extends AppCompatActivity implements View.OnClickListener{

    RadioButton km5 , k5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna__place5);

        km5 =(RadioButton) findViewById(R.id.Rampalmap);
        km5.setOnClickListener(this);

        k5 =(RadioButton) findViewById(R.id.Rampalweather);
        k5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Rampalmap:

                Intent Intent = new Intent(Khulna_Place5.this, Maps_Khulna5.class);
                startActivity(Intent);

                break;

            case R.id.Rampalweather:

                Intent aIntent = new Intent(Khulna_Place5.this, Khulna5.class);
                startActivity(aIntent);

                break;
        }
    }
}
