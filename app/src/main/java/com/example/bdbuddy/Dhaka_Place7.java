package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Dhaka_Place7 extends AppCompatActivity implements View.OnClickListener {
    RadioButton dm7 , d7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka__place7);
        dm7 =(RadioButton) findViewById(R.id.martyrsmap);
        dm7.setOnClickListener(this);

        d7 =(RadioButton) findViewById(R.id.martyrsweather);
        d7.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        Intent d3intent = new Intent(Dhaka_Place7.this, Maps_Dhaka7.class);
        startActivity(d3intent);


        switch (v.getId()) {
            case R.id.martyrsmap:

                Intent intent = new Intent(Dhaka_Place7.this, Maps_Dhaka7.class);
                startActivity(intent);

                break;

            case R.id.martyrsweather:

                Intent aIntent = new Intent(Dhaka_Place7.this, Dhaka7.class);
                startActivity(aIntent);

                break;
        }
    }
}
