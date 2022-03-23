package com.cursoandroid.classesemetodos;

public class Obama extends Cidadao implements Presidente {
    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar uma eleicao nos EUA.");
    }
}
