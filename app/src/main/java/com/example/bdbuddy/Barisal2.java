package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Barisal2 extends AppCompatActivity {
    PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal2);

        one =(PDFView)findViewById(R.id.Sonar);
        one.fromAsset("Sonar char .pdf").load();
    }
}
