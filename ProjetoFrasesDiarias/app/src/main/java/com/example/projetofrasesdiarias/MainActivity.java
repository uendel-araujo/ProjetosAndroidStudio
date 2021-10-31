package com.example.projetofrasesdiarias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

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
                "Por maior que seja, não há obstáculo que não possa ser superado com fé, esperança e persistência.",
                "Ontem uma pessoa me disse que superação não é sentir nada, pelo contrário, é sentir algo pela pessoa e mesmo assim não correr atrás.",
                "Você superou tantas coisas, não desista, por favor!",
                "Na vida, ter fé não significa que tudo dará certo, e sim que tudo pode ser superado.",
                "Na vida, ter fé não significa que tudo dará certo, e sim que tudo pode ser superado.",
                "Se você está lendo isso, eu espero que você encontre a força que você precisa para superar o que está te causando tanto conflito interno.",
                "Você se surpreende ao perceber o quanto pode suportar."

        };

        int nFrases = new Random().nextInt(11);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[nFrases]);

    }
}