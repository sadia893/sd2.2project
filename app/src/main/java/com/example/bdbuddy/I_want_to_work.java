package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class I_want_to_work extends AppCompatActivity implements View.OnClickListener {
private Button languageButton,subitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_want_to_work);
        languageButton=findViewById(R.id.language_id);
        subitButton=findViewById(R.id.submit_id);
        languageButton.setOnClickListener(this);
        subitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.language_id)
        {
            Intent i=new Intent(I_want_to_work.this,LanguageList.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.submit_id)
        {
            Intent i=new Intent(I_want_to_work.this,MainActivity.class);
            startActivity(i);

        }
    }
}
