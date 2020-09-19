package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Dhaka_Place13 extends AppCompatActivity implements View.OnClickListener {
    RadioButton dm13 , d13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place13);
        dm13 =(RadioButton) findViewById(R.id.sonargaonmap);
        dm13.setOnClickListener(this);

        d13 =(RadioButton) findViewById(R.id.sonargaonweather);
        d13.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {



        switch (v.getId())
        {
            case R.id.sonargaonmap:

                Intent intent = new Intent(Dhaka_Place13.this, Maps_Dhaka13.class);
                startActivity(intent);

                break;

            case R.id.sonargaonweather:

                Intent aIntent = new Intent(Dhaka_Place13.this, Dhaka13.class);
                startActivity(aIntent);

                break;
        }
    }

}
