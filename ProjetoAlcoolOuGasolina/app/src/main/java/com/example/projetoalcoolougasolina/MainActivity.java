package com.example.projetoalcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText textPrecoAlcool, textPrecoGasolina;
    TextView textResultadoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textPrecoAlcool    = findViewById(R.id.inputEditPrecoAlcool);
        textPrecoGasolina  = findViewById(R.id.inputEditPrecoGasolina);
        textResultadoFinal = findViewById(R.id.textResultadoFinal);
    }

    public void calcular(View view) {

        //RECUPERAÇÃO DOS VALORES DIGITADOS
        String precoAlcool = textPrecoAlcool.getText().toString();
        String precoGasolina = textPrecoGasolina.getText().toString();

        //VALIDAÇÃO DOS CAMPOS DIGITADOS
        Boolean camposValidados = validarCampos(precoAlcool, precoGasolina);
        if ( camposValidados ) {

            //CONVERSÃO DE STRING PARA NUMERO
            Double valorAlcool = Double.parseDouble(precoAlcool);
            Double valorGasolina = Double.parseDouble(precoGasolina);

            //CALCULO PARA SABER QUAL O MELHOR
            if((valorAlcool / valorGasolina) >= 0.7){
                textResultadoFinal.setText("Abasteça com gasolina!");
            } else {
                textResultadoFinal.setText("Abasteça com álcool, terá vantagem!");
            }

        } else {
            textResultadoFinal.setText("Preencha os campos em branco para continuar!");
        }

    }

    //METODO QUE FARÁ A VALIDAÇÃO DOS VALORES DIGITADOS
    public Boolean validarCampos(String pAlcool, String pGasolina) {
        Boolean camposValidados = true;

        if( pAlcool == null || pAlcool.equals("")) {
            camposValidados = false;
        } else if (pGasolina == null || pGasolina.equals("")) {
            camposValidados = false;
        }

        return camposValidados;
    }
}