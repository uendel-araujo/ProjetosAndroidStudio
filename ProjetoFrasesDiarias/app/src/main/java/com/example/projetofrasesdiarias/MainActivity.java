package com.example.projetofrasesdiarias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        String[] frases = {
                "Se a vida não ficar mais fácil, trate de ficar mais forte.",
                "Dificuldades preparam pessoas comuns para destinos extraordinários.",
                "Você é mais forte e capaz do que imagina. Acredite!",
                "Para todo game over (FIM DE JOGO), existe um play again (JOGAR NOVAMENTE).",
                
        };

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases);

    }
}