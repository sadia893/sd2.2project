package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Barisal3 extends AppCompatActivity {
 PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal3);

        one =(PDFView)findViewById(R.id.Fatrar);
        one.fromAsset("Fatrar char.pdf").load();
    }
}
