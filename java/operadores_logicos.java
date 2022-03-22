package domain;

public class HelloWorld {

    public static void main(String[] args) {
        boolean resultado;
        int n1 = 1, n2= 2;
        resultado = n1 == n2;
        System.out.println(resultado);
        resultado = n1 != n2;
        System.out.println(resultado);
        resultado = n1 > n2;
        System.out.println(resultado);
        resultado = n1 < n2;
        System.out.println(resultado);
        resultado = true && false;
        System.out.println(resultado);
        resultado = true || false;
        System.out.println(resultado);
    }

}