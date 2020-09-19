package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rajshahi_Place8 extends AppCompatActivity  implements View.OnClickListener{

    RadioButton rm8 ,r8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi__place8);
        rm8 =(RadioButton) findViewById(R.id.Kushumbamap);
        rm8.setOnClickListener(this);

        r8 =(RadioButton) findViewById(R.id.Kushumbaweather);
        r8.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Kushumbamap:

                Intent Intent = new Intent(Rajshahi_Place8.this, Maps_Rajshahi8.class);
                startActivity(Intent);

                break;

            case R.id.Kushumbaweather:

                Intent aIntent = new Intent(Rajshahi_Place8.this, Rajshahi8.class);
                startActivity(aIntent);

                break;

        }
    }
}
