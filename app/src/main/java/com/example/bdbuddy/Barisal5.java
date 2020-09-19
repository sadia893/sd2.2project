package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Barisal5 extends AppCompatActivity {

    PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal5);

        one =(PDFView)findViewById(R.id.Lakhutia);
        one.fromAsset("Lakutia Zamindar Bari.pdf").load();
    }
}
