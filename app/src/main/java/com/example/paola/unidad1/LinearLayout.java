package com.example.paola.unidad1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class LinearLayout extends AppCompatActivity {
    private EditText txtName;
    private EditText txtAge;
    private EditText txtPhone;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        txtName = (EditText) findViewById(R.id.edt_name);
        txtAge = (EditText) findViewById(R.id.edt_age);
        txtPhone = (EditText) findViewById(R.id.edt_phone);
        btnSubmit = (Button) findViewById(R.id.btn_sub);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LinearLayout.this, RelativeLayout.class);
                Bundle b = new Bundle();
                b.putString("Name", txtName.getText().toString());
                b.putString("Age", txtAge.getText().toString());
                b.putString("Phone", txtPhone.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }

    public void nextActivityData(View view) {
        startActivity(new Intent(this,
                LinearLayout.class));
    }
}
