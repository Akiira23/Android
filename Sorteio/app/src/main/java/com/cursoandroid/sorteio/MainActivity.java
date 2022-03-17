package com.cursoandroid.sorteio;

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

    public void sorteio(View view) {

        TextView texto = findViewById(R.id.viewResultado);
        TextView vencedor = findViewById(R.id.viewVencedor);
        TextView jog1 = findViewById(R.id.viewPlayer1);
        TextView jog2 = findViewById(R.id.viewPlayer2);
        int intJog1 = Integer.valueOf(jog1.getText().toString());
        int intJog2 = Integer.valueOf(jog2.getText().toString());
        int numero = new Random().nextInt(11);
        int resultado1 = Math.abs(intJog1 - numero);
        int resultado2 = Math.abs(intJog2 - numero);

        texto.setText("Numero sorteado: " + numero);
        if (resultado1 < resultado2)
            vencedor.setText("Jogador 1 venceu!");
        else if (resultado2 < resultado1)
            vencedor.setText("Jogador 2 venceu!");
        else
            vencedor.setText("Empate!");

    }
}
