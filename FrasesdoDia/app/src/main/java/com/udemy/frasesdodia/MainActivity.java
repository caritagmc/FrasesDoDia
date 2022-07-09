package com.udemy.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

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

    public void gerarNovaFrase(View view)
    {
        String[] frases =
                {
                        " 'É só uma fase ruim, logo vai piorar'",
                        "'Nunca deixem dizer que você não consegue, diga voce mesmo: EU NAO CONSIGO.'",
                        "'SEM LUTAS NÃO HÁ DERROTA.'",
                        "'As coisas só darão errado se voce tentar.'",
                        "'Quando a vida te derrubar, fique aí e tire uma soneca.'",
                        "'O problema não é a segunda feira e sim a sua vida'",
                        "'Você não pode mudar o seu passado, mas pode estragar o seu futuro.'",
                        "'Nada é tão horrível que não possa piorar muito.'",
                        "'O caminho é longo, mas a derrota é certa.'",
                        "'Lute como nunca, perca como SEMPRE!'",
                        "'O recomeço é uma oportunidade para um novo fracasso.'",

                };
        int numero = new Random().nextInt(10);

        TextView texto = findViewById(R.id.textoResultado);
        texto.setText(frases[numero]);
    }

}