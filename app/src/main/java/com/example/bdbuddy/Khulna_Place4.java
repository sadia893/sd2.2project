package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Khulna_Place4 extends AppCompatActivity implements View.OnClickListener {
    RadioButton km4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna__place4);

        km4 =(RadioButton) findViewById(R.id.Monglamap);
        km4.setOnClickListener(this);

        km4 =(RadioButton) findViewById(R.id.Monglaweather);
        km4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Monglamap:

                Intent Intent = new Intent(Khulna_Place4.this, Maps_Khulna4.class);
                startActivity(Intent);

                break;

            case R.id.Monglaweather:

                Intent aIntent = new Intent(Khulna_Place4.this, Khulna4.class);
                startActivity(aIntent);

                break;
        }
    }
}
