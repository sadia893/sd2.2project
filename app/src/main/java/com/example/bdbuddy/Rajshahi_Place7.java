package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rajshahi_Place7 extends AppCompatActivity  implements View.OnClickListener {

    RadioButton rm7 , r7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi__place7);
        rm7 =(RadioButton) findViewById(R.id.Shonamap);
        rm7.setOnClickListener(this);


        r7 =(RadioButton) findViewById(R.id.Shonaweather);
        r7.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Shonamap:

                Intent Intent = new Intent(Rajshahi_Place7.this, Maps_Rajshahi2.class);
                startActivity(Intent);

                break;

            case R.id.Shonaweather:

                Intent aIntent = new Intent(Rajshahi_Place7.this, Rajshahi7.class);
                startActivity(aIntent);

                break;

        }
    }
}
