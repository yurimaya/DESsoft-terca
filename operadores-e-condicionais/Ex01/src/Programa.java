import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Digite o n�mero: ");
			int numero = leitor.nextInt();
			
			if (numero > 10) {
				System.out.println("O N�mero � maior do que 10!");
			
			}
		 else {
			
			System.out.println("O N�mero � menor do que 10!");
		}
		

	}

}
