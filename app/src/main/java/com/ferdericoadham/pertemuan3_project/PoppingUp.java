package com.ferdericoadham.pertemuan3_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class PoppingUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popping_up);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Stopping", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Restarting", Toast.LENGTH_SHORT).show();
    }
   @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resuming", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Pausing", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Closing", Toast.LENGTH_SHORT).show();
    }

}