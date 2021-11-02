package com.example.projetomediadoaluno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void calcularMediaFinal(View view) {

        EditText editMedia1 = findViewById(R.id.editMedia1);
        double media1 = Double.parseDouble(editMedia1.getText().toString());

        EditText editMedia2 = findViewById(R.id.editMedia2);
        double media2 = Double.parseDouble(editMedia2.getText().toString());

        EditText editMedia3 = findViewById(R.id.editMedia3);
        double media3 = Double.parseDouble(editMedia3.getText().toString());

    }
}