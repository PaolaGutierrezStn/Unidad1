package com.example.paola.unidad1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Paola on 02/02/2018.
 */

public class FrameLayout extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);
    }

    public void nextActivity(View view){
        startActivity(new Intent(this,TableLayout.class));
        finish();
    }
}
