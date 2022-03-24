package com.cursoandroid.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;
    private CheckBox checkVermelho, checkBranco, checkAzul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResultado);
        checkAzul = findViewById(R.id.checkAzul);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);
    }

    public void checkBox() {
        String texto ="";
        if(checkAzul.isChecked()) {
            String corSelecionada = checkAzul.getText().toString();
            texto = texto + corSelecionada +" selecionado. ";
        }
        if(checkBranco.isChecked()) {
            String corSelecionada = checkBranco.getText().toString();
            texto = texto + corSelecionada +" selecionado. ";
        }
        if(checkVermelho.isChecked()) {
            String corSelecionada = checkVermelho.getText().toString();
            texto = texto + corSelecionada +" selecionado. ";
        }
        textoResultado.setText(texto);
    }

    public void enviar(View view) {
        checkBox();
        /*String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        textoResultado.setText("Nome: " + nome + " Email: "+ email);*/

    }

    public void limpar(View view) {
        campoNome.setText("");
        campoEmail.setText("");
    }
}
