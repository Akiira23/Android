package com.cursoandroid.classesemetodos.classes;

public class Conta {
    private int numeroConta;
    private double saldo = 100;

    public double recupararSaldo() {
        return this.saldo;
    }

    public void depositar(double valorDeposito) {
        this.saldo = this.saldo + valorDeposito;
    }
    public void sacar(double valorSaque) {
        this.saldo = this.saldo - valorSaque;
    }
}


/*
* public: todas as classes terao acesso
* private: apenas pode ser acessado de dentro da classe
* protected: pode ser acessado estando dentro do mesmo pacote e/ou subclasse
* defalut: caso nao tenha sido definido nenhum modificador, permite o acesso apenas dentro do pacote
*
*
*
*
* */