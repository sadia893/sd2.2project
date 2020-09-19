package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Barisal6 extends AppCompatActivity {

    PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal6);


        one =(PDFView)findViewById(R.id.Borishal);
        one.fromAsset("Barisal Divisional Museum.pdf").load();
    }
}
