package com.cursoandroid.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        textResultado = findViewById(R.id.resultado);
    }

    public void calcularPreco(View view) {
        String precoGasolina = editPrecoGasolina.getText().toString();

        Boolean camposValidados = validarCampos(precoGasolina);
        if (camposValidados) {
            Double valorGasolina = Double.parseDouble(precoGasolina);
            Double vAlcool = valorGasolina * 0.7;
            DecimalFormat df = new DecimalFormat("#.000");

            textResultado.setText("Compre Alcool se estiver seu valor estiver a " + df.format(vAlcool));
        } else {
            textResultado.setText("Preencha os valores primeiro.");
        }


    }

    public boolean validarCampos(String pGasolina) {
        Boolean camposValidados = true;
        if (pGasolina == null || pGasolina == "")
            camposValidados = false;
        return camposValidados;
    }
}
