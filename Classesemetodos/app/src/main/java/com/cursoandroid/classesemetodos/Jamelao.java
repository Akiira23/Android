package com.cursoandroid.classesemetodos;

public class Jamelao extends Cidadao implements Presidente {
    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar eleicao do predio.");
    }
}
