package com.cursoandroid.toggleswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private TextView textResutlado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha = findViewById(R.id.toggleSenha);
        switchSenha = findViewById(R.id.switchSenha);
        textResutlado = findViewById(R.id.texteResultado);
        adicionarListener();
    }

    public void adicionarListener() {
        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                    textResutlado.setText("Switch Ligado.");
                else
                    textResutlado.setText("Switch desligado");
            }
        });

    }

    public void enviar(View view) {

        //if (switchSenha.isChecked())
        if (toggleSenha.isChecked())
            textResutlado.setText("Toggle Ligado.");
        else
            textResutlado.setText("Toggle desligado");
    }
}
