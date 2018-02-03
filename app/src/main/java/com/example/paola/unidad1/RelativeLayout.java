package com.example.paola.unidad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class RelativeLayout extends AppCompatActivity {
    private TextView txtData;
    private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        txtData = (TextView) findViewById(R.id.txtData);
        Bundle bundle = this.getIntent().getExtras();
        txtData.setText("Hello: " + bundle.getString("Name") + ", " +
                bundle.getString("Age") + ", " + bundle.getString("Phone"));
    }
}
