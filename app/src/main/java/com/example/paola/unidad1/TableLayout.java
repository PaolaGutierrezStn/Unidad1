package com.example.paola.unidad1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Paola on 02/02/2018.
 */

public class TableLayout extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);
    }

    public void nextActivity1(View view){
        startActivity(new Intent(this,GridLayout.class));
    }

    public void nextActivity2(View view){
        startActivity(new Intent(this,LinearLayout.class));

    }
}
