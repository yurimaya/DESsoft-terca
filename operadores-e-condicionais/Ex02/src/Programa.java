import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o n�mero 1: ");
		int numero1 = leitor.nextInt();
		
		System.out.println("Digite o n�mero 2: ");
		int numero2 = leitor.nextInt();
		
		int soma = (numero1 + numero2);
		
		System.out.println("A soma dos dois n�meros �: " + soma);
	}
		
}
