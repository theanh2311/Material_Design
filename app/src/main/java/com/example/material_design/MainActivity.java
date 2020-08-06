package com.example.material_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//SnackBar
    public void showSnackbar(View view) {
        Snackbar.make(view,"Hello",Snackbar.LENGTH_SHORT).setAction("ok", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }).show();
    }
}
