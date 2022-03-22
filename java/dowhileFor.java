public class Main
{
	public static void main(String[] args) {
	    int numero = 0;
	    
	    while(numero < 0) {
	        numero = numero + 1;
	        System.out.println(numero);
	    }
	    System.out.println("----------------------");
	    numero = 0;
	    do {
	        System.out.println(numero);
	        numero = numero + 1;
	    }
	    while(numero < 0);
	    System.out.println("----------------------");
	    for(int n = 1; n <= 5; n++) {
	        System.out.println(n);
	    }
	}
}