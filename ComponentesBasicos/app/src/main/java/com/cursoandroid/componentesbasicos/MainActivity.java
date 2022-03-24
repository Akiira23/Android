package com.cursoandroid.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;
    private CheckBox checkVermelho, checkBranco, checkAzul;
    private RadioButton radioMasculino, radioFeminino;
    private RadioGroup opcaoSexo;

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
        radioFeminino = findViewById(R.id.radioF);
        radioMasculino = findViewById(R.id.radioM);
        opcaoSexo = findViewById(R.id.radioGroupSexo);

    }

    public void radioButton() {
        /*
        if(radioFeminino.isChecked()) {
            String sexoSelecionado = radioFeminino.getText().toString();
            textoResultado.setText(sexoSelecionado +" selecionado. ");
        }
        else if(radioMasculino.isChecked()) {
            String sexoSelecionado = radioMasculino.getText().toString();
            textoResultado.setText(sexoSelecionado +" selecionado. ");
        }
         */

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.radioF) {
                    textoResultado.setText("Feminino");
                }
                else if(i == R.id.radioM) {
                    textoResultado.setText("Masculino");
                }
            }
        });

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
        radioButton();
        /*checkBox();
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        textoResultado.setText("Nome: " + nome + " Email: "+ email);*/

    }

    public void limpar(View view) {
        campoNome.setText("");
        campoEmail.setText("");
    }
}
