package com.cursoandroid.classesemetodos.Animais;

public class Animal {
    private int tamanho;
    private String cor;
    private double peso;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public int getTamanho() {
        return this.tamanho;
    }
    public void dormir() {
        System.out.println("Dormir");
    }

    public void correr() {
        System.out.println("Correr como um ");
    }
}
