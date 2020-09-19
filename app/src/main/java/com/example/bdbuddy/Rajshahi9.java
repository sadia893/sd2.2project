package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Rajshahi9 extends AppCompatActivity {
    PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi9);


        one =(PDFView)findViewById(R.id.Lalon);
        one.fromAsset("Lalon Shah Bridge.pdf").load();
    }
}
