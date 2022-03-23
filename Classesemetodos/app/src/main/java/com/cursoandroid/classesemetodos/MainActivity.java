package com.cursoandroid.classesemetodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Casa minhaCasa = new Casa();
        minhaCasa.cor = "vermelho";
        System.out.println(minhaCasa.cor);
        minhaCasa.abrirPorta();

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Jamelao";
        funcionario.salario = 1200;
        double salarioRecuperado = funcionario.recuperarSalario(150, 20);
        System.out.println("O salario eh: " + (salarioRecuperado));
    }
}
