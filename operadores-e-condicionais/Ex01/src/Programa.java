import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Digite o número: ");
			int numero = leitor.nextInt();
			
			if (numero > 10) {
				System.out.println("O Número é maior do que 10!");
			
			}
		 else {
			
			System.out.println("O Número é menor do que 10!");
		}
		

	}

}
