package com.cursoandroid.classesemetodos.Animais;

public class Cao extends Animal {
    public void latir() {
        System.out.println("Latir como um cachorro.");
    }
    public void correr() {
        super.correr();
        System.out.println("cao.");
    }
}
