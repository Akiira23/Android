package com.cursoandroid.classesemetodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cursoandroid.classesemetodos.Animais.Cao;
import com.cursoandroid.classesemetodos.classes.Conta;

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

        Cao cao = new Cao();
        cao.correr();
        cao.latir();
        cao.setTamanho(30);
        int caoTam = cao.getTamanho();
        System.out.println(caoTam);

        Conta conta = new Conta();
        conta.depositar(100);
        conta.sacar(50);

        System.out.println(conta.recupararSaldo());
    }
}
