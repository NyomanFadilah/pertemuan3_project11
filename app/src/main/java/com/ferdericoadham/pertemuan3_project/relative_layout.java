package com.ferdericoadham.pertemuan3_project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class relative_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        Button buttonexplicit = findViewById(R.id.button2);
        Button buttonimplicit = findViewById(R.id.button3);


        buttonexplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);

            }
        });


        buttonimplicit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iweblogsite.com"));

            }
        });


    }
}