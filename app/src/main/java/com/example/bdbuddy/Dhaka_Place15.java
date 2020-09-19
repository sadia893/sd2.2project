package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Dhaka_Place15 extends AppCompatActivity implements View.OnClickListener{
    RadioButton dm15 , d15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place15);
        dm15 =(RadioButton) findViewById(R.id.safarimap);
        dm15.setOnClickListener(this);

        d15 =(RadioButton) findViewById(R.id.safariweather);
        d15.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.safarimap:

                Intent intent = new Intent(Dhaka_Place15.this, Maps_Dhaka15.class);
                startActivity(intent);

                break;

            case R.id.safariweather:

                Intent aIntent = new Intent(Dhaka_Place15.this, Dhaka15.class);
                startActivity(aIntent);

                break;
        }
    }
}
