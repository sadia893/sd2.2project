package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Khulna_Place3 extends AppCompatActivity implements View.OnClickListener{
    RadioButton km3 , k3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna__place3);

        km3 =(RadioButton) findViewById(R.id.Sundarbansmap);
        km3.setOnClickListener(this);

        k3 =(RadioButton) findViewById(R.id.Sundarbansweather);
        k3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Sundarbansmap:

                Intent Intent = new Intent(Khulna_Place3.this, Maps_Khulna3.class);
                startActivity(Intent);

                break;

            case R.id.Sundarbansweather:

                Intent aIntent = new Intent(Khulna_Place3.this, Khulna3.class);
                startActivity(aIntent);

                break;
        }
    }
}
