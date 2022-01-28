package com.example.dataactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView txvName, txvPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txvName = (TextView) findViewById(R.id.txvName);
        txvPass = (TextView) findViewById(R.id.txvPass);


        String edtName = getIntent().getStringExtra("keyname");
        String edtPass = getIntent().getStringExtra("keypass");

        txvName.setText(edtName);
        txvPass.setText(edtPass);


    }
}