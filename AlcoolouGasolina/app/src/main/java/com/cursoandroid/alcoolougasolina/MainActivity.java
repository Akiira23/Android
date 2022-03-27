package com.cursoandroid.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoGasolina, editDesempenhoEtanol, editDesempenhoGasolina;
    private TextView textResultado, textRendimento;
    private CheckBox checkBoxCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        textResultado = findViewById(R.id.resultado);
        textRendimento = findViewById(R.id.textRendimento);
        checkBoxCalculo = findViewById(R.id.checkBoxCalculo);
        editDesempenhoEtanol = findViewById(R.id.editDesempenhoEtanol);
        editDesempenhoGasolina = findViewById(R.id.editDesempenhoGasolina);
        checkBoxCalculo = findViewById(R.id.checkBoxCalculo);
    }

    public void calcularPreco(View view) {
        String precoGasolina = editPrecoGasolina.getText().toString();
        String desempenhoEtanol = editDesempenhoEtanol.getText().toString();
        String desempenhoGasolina = editDesempenhoGasolina.getText().toString();

        if (checkBoxCalculo.isChecked()) {
            Boolean validaEtanol = validarCampos(desempenhoEtanol);
            Boolean validaGasolina = validarCampos(desempenhoGasolina);
            Boolean validaPreco = validarCampos(precoGasolina);

            if (validaEtanol && validaGasolina && validaPreco) {
                Double valorGasolina = Double.parseDouble(precoGasolina);
                Double desempenhoE = Double.parseDouble(desempenhoEtanol);
                Double desempenhoG = Double.parseDouble(desempenhoGasolina);
                Double rendimento = desempenhoE / desempenhoG;

                Double vAlcool = valorGasolina * rendimento;
                DecimalFormat df = new DecimalFormat("#0.000");

                textRendimento.setText("Rendimento do etanol: " + df.format(rendimento));
                textResultado.setText("Compre Alcool se estiver seu valor estiver a " + df.format(vAlcool));
            } else {
                textResultado.setText("Preencha os valores primeiro.");
            }
        } else {
            Boolean camposValidados = validarCampos(precoGasolina);

            if (camposValidados) {
                Double valorGasolina = Double.parseDouble(precoGasolina);
                Double vAlcool = valorGasolina * 0.7;
                DecimalFormat df = new DecimalFormat("#.000");

                textRendimento.setText("Rendimento do etanol: 0.7");
                textResultado.setText("Compre Alcool se estiver seu valor estiver a " + df.format(vAlcool));
            } else {
                textResultado.setText("Preencha os valores primeiro.");
            }
        }


    }

    public boolean validarCampos(String campoV) {
        Boolean camposValidados = true;
        if (campoV == null || campoV == "")
            camposValidados = false;
        return camposValidados;
    }
}
