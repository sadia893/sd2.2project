package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Barisal4 extends AppCompatActivity {
PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal4);

        one =(PDFView)findViewById(R.id.Payra);
        one.fromAsset("Payra.pdf").load();
    }
}