package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Rangpur6 extends AppCompatActivity {
PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur6);

        one =(PDFView)findViewById(R.id.Teesta);
        one.fromAsset("Teesta Bridge .pdf").load();
    }
}
