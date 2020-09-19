package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Khulna_Place6 extends AppCompatActivity implements View.OnClickListener{
    RadioButton km6 , k6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna__place6);

        km6 =(RadioButton) findViewById(R.id.shatmap);
        km6.setOnClickListener(this);

        k6 =(RadioButton) findViewById(R.id.shatweather);
        k6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.shatmap:

                Intent Intent = new Intent(Khulna_Place6.this, Maps_Khulna6.class);
                startActivity(Intent);

                break;

            case R.id.shatweather:

                Intent aIntent = new Intent(Khulna_Place6.this, Khulna6.class);
                startActivity(aIntent);

                break;
        }
    }
}
