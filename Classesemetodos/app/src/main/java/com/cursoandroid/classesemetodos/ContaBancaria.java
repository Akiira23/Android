package com.cursoandroid.classesemetodos;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public ContaBancaria() {
        System.out.println("Construtor chamado");
    }
    public ContaBancaria(int nConta) {
        this.numeroConta = nConta;
        System.out.println("Construtor chamado, numeroConta");
    }
    public ContaBancaria(int nConta, double saldo) {
        this.numeroConta = nConta;
        this.saldo = saldo;
        System.out.println("Construtor chamado, numeroConta, saldo");
    }
}
