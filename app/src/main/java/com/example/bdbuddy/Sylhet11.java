package com.example.bdbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Sylhet11 extends AppCompatActivity {
PDFView one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet11);

        one =(PDFView)findViewById(R.id.Ratargul);
        one.fromAsset("Ratargul Swamp Fores.pdf").load();
    }
}
