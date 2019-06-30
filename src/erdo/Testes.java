package erdo;
import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		ListaAutor a = new ListaAutor();
		int x = tec.nextInt();
		int y=1;
		while(x>0) {
			a.cria(x,y);
			y++;
			x = tec.nextInt();
		}
		
		
		
	}

}
