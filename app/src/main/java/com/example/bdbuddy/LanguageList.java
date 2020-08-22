package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LanguageList extends AppCompatActivity implements View.OnClickListener {
private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_list);
        b=findViewById(R.id.languageSubmit_id);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(LanguageList.this,I_want_to_work.class);
        startActivity(i);

    }
}
