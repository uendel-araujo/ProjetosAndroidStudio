package com.example.projetopedrapapeltesoura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("Pedra");
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("Papel");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("Tesoura");
    }

    public void opcaoSelecionada(String opcaoSelecionada){

        ImageView  imageOpcaoPC = findViewById(R.id.imageOpcaoPC);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoPC = opcoes[numero];

        switch (opcaoPC) {
            case "pedra":
                imageOpcaoPC.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageOpcaoPC.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageOpcaoPC.setImageResource(R.drawable.tesoura);
                break;


      }

      System.out.println(opcaoSelecionada);
    }

}