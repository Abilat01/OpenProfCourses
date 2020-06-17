package com.abilat.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = (Button) findViewById(R.id.btnOk);
        btnOk.setOnClickListener(this);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnOk:
                Toast.makeText(this, "ОК КУРИТЬ", Toast.LENGTH_LONG).show();
            case R.id.btnCancel:
                Toast.makeText(this, "Отмена, не курить", Toast.LENGTH_SHORT).show();
        }
    }
}