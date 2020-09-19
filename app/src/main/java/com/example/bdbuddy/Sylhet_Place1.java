package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Sylhet_Place1 extends AppCompatActivity implements View.OnClickListener {

    RadioButton sm1 , s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet__place1);

        sm1 =(RadioButton) findViewById(R.id.Alimap);
        sm1.setOnClickListener(this);


        s1 =(RadioButton) findViewById(R.id.Aliweather);
        s1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Alimap:

                Intent Intent = new Intent(Sylhet_Place1.this, Maps_Sylhet1.class);
                startActivity(Intent);

                break;

            case R.id.Aliweather:

                Intent aIntent = new Intent(Sylhet_Place1.this, Sylhet1.class);
                startActivity(aIntent);

                break;
        }
    }
}
