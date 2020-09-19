package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Rajshahi7 extends AppCompatActivity {
    PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi7);


        one =(PDFView)findViewById(R.id.Choto);
        one.fromAsset("Choto Shona Mosque .pdf").load();
    }
}
