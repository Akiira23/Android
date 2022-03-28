package com.cursoandroid.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText editValor;
    private TextView textPorcentagem, textGorjeta, textTotal, textDividido;
    private TextInputEditText textQuantidade;
    private SeekBar seekBarGorjeta;

    private double porcentagem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValor = findViewById(R.id.editValor);
        textPorcentagem = findViewById(R.id.textPorcentagem);
        textGorjeta = findViewById(R.id.textGorjeta);
        textTotal = findViewById(R.id.textTotal);
        seekBarGorjeta = findViewById(R.id.seekBarGorjeta);
        textDividido = findViewById(R.id.textDividido);
        textQuantidade = findViewById(R.id.textQuantidade);

        seekBarGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                porcentagem = i;
                textPorcentagem.setText(Math.round(i) + " %");
                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void calcular() {

        String valorRecuperado = editValor.getText().toString();
        String quantidadeRecuperado = textQuantidade.getText().toString();

        if ((valorRecuperado == null || valorRecuperado.equals(""))
                && (quantidadeRecuperado == null || quantidadeRecuperado.equals(""))) {
            Toast.makeText(getApplicationContext(), "Digite um valor primeiro.", Toast.LENGTH_SHORT).show();
        } else {
            //converter String para double
            double valorDigitado = Double.parseDouble(valorRecuperado);
            int quantidadeP = Integer.parseInt(quantidadeRecuperado);

            //calcula gorjeta total
            double gorjeta = valorDigitado * (porcentagem / 100);
            double total = gorjeta + valorDigitado;

            //calcula valor dividido
            double totalDivido = total/quantidadeP;

            textGorjeta.setText("R$ " + gorjeta);
            textTotal.setText("R$ " + total);
            textDividido.setText("R$ " + totalDivido);
        }
    }
}
