package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Rajshahi_Place6 extends AppCompatActivity  implements View.OnClickListener {

    RadioButton rm6 ,r6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi__place6);
        rm6 =(RadioButton) findViewById(R.id.Mahasthangarhmap);
        rm6.setOnClickListener(this);

        r6 =(RadioButton) findViewById(R.id.Mahasthangarhweather);
        r6.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Mahasthangarhmap:

                Intent Intent = new Intent(Rajshahi_Place6.this,Maps_Rajshahi6.class);
                startActivity(Intent);

                break;

            case R.id.Mahasthangarhweather:

                Intent aIntent = new Intent(Rajshahi_Place6.this, Rajshahi6.class);
                startActivity(aIntent);

                break;

        }
    }
}
