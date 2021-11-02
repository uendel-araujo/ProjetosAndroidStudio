package com.example.projetopedrapapeltesoura;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int placarUsuario = 0;
    int placarComputador = 0;
    int placarEmpate = 0;
    int totalPartidas = 0;


    public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String opcaoUsuario){

        ImageView  imageOpcaoPC = findViewById(R.id.imageOpcaoPC);
        TextView textoResultadoFinal = findViewById(R.id.textResultadoFinal);
        TextView textResultadoUsuario = findViewById(R.id.textResultadoUsuario);
        TextView textResultadoComputador = findViewById(R.id.textResultadoComputador);
        TextView textResultadoEmpate    = findViewById(R.id.textResultadoEmpate);
        TextView textPartidasTotalJogadas = findViewById(R.id.textPartidasTotalJogadas);


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

      if((opcaoPC.equals("tesoura") && opcaoUsuario.equals("papel")) || (opcaoPC.equals("papel") && opcaoUsuario.equals("pedra")) || (opcaoPC.equals("pedra") && opcaoUsuario.equals("tesoura"))) {//POSSIBILIDADES DO APP GANHADOR
                textoResultadoFinal.setText("Computador ganhou!!");
                placarComputador++;
                textResultadoComputador.setText(Integer.toString(placarComputador));
      }
      else if(( opcaoUsuario.equals("papel") && opcaoPC.equals("pedra")) || ( opcaoUsuario.equals("tesoura") && opcaoPC.equals("papel")) || ( opcaoUsuario.equals("pedra") && opcaoPC.equals("tesoura"))) {
                textoResultadoFinal.setText("Usuário ganhou!!");
                placarUsuario++;
                textResultadoUsuario.setText(Integer.toString(placarUsuario));
      }
      else
      {
          textoResultadoFinal.setText("Ninguém ganhou!! Jogo deu empate");
          placarEmpate++;
          textResultadoEmpate.setText(Integer.toString(placarEmpate));
      }

        totalPartidas = placarEmpate + placarComputador + placarUsuario;
        textPartidasTotalJogadas.setText(Integer.toString(totalPartidas));

    }

}