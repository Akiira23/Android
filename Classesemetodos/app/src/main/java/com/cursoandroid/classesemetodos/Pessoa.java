package com.cursoandroid.classesemetodos;

public class Pessoa {

    private String nome;
    private int idade;

    public void exibirDados(String nome) {
        System.out.println("O nome: " + nome);
    }

    public void exibirDados(String nome, int idade) {
        System.out.println("O nome: " + nome + " idade: " + idade);
    }
}
