package com.cursoandroid.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("papel");
    }

    public void opcaoSelecionada(String opcaoSelecionada) {

        ImageView imageResultado = findViewById(R.id.imageResultado);

        System.out.println("selecionada " + opcaoSelecionada);

        int opcaoCPU = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[opcaoCPU];

        switch (opcaoApp) {
            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        TextView textResultado = findViewById(R.id.resultadoJogo);
        if(
                (opcaoApp == "pedra" && opcaoSelecionada == "tesoura") ||
                (opcaoApp == "papel" && opcaoSelecionada == "pedra") ||
                (opcaoApp == "tesoura" && opcaoSelecionada == "papel")
        )
            textResultado.setText("Jogador Perdeu!");
        else if(
                (opcaoSelecionada == "pedra" && opcaoApp == "tesoura") ||
                (opcaoSelecionada == "papel" && opcaoApp == "pedra") ||
                (opcaoSelecionada == "tesoura" && opcaoApp == "papel")
        )
            textResultado.setText("Jogador Ganhou!");
        else
            textResultado.setText("Empate!");
    }
}
