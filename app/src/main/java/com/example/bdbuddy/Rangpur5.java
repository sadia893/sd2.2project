package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Rangpur5 extends AppCompatActivity {
    PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur5);


        one =(PDFView)findViewById(R.id.Begum);
        one.fromAsset("Begum Rokeya Memorial Centre.pdf").load();
    }
}
