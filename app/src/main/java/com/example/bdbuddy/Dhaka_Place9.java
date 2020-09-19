package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Dhaka_Place9 extends AppCompatActivity implements View.OnClickListener {
    RadioButton dm9 , d9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place9);
        dm9 =(RadioButton) findViewById(R.id.hossanimap);
        dm9.setOnClickListener(this);

        d9 =(RadioButton) findViewById(R.id.hossaniweather);
        d9.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        Intent d3intent = new Intent(Dhaka_Place9.this, Maps_Dhaka9.class);
        startActivity(d3intent);

        switch (v.getId()) {
            case R.id.hossanimap:

                Intent intent = new Intent(Dhaka_Place9.this, Maps_Dhaka9.class);
                startActivity(intent);

                break;

            case R.id.hossaniweather:

                Intent aIntent = new Intent(Dhaka_Place9.this, Dhaka9.class);
                startActivity(aIntent);

                break;
        }
    }
}
