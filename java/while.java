public class Main
{
	public static void main(String[] args) {
	    String[] posts = {"Bom dia amigos", "postagens 2", "posts 3"};
	    System.out.println(posts.length);
	    int numero = 0;
	    
	    while(numero < posts.length) {
	        System.out.println("-------------");
	        System.out.println("Postagem: " + posts[numero]);
	        System.out.println("#############");
	        numero = numero + 1;
	    }
		
	}
}