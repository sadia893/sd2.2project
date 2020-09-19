package com.example.bdbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Chittagong_Place1 extends AppCompatActivity implements View.OnClickListener {

    RadioButton cm1 ,c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong__place1);
        cm1 =(RadioButton) findViewById(R.id.Foymap);
        cm1.setOnClickListener(this);

        c1 =(RadioButton) findViewById(R.id.Foyweather);
        c1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        Intent d1intent = new Intent(Chittagong_Place1.this, Maps_Chittagong1.class);
        startActivity(d1intent);


        switch (v.getId()) {
            case R.id.Foymap:

                Intent Intent = new Intent(Chittagong_Place1.this, Maps_Chittagong1.class);
                startActivity(Intent);

                break;

            case R.id.Foyweather:

                Intent aIntent = new Intent(Chittagong_Place1.this, Chittagong1.class);
                startActivity(aIntent);

                break;
        }
    }
}
