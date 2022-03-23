package com.cursoandroid.classesemetodos;

public class Cao extends Animal {
    void latir() {
        System.out.println("Latir como um cachorro.");
    }
    void correr() {
        super.correr();
        System.out.println("cao.");
    }
}
