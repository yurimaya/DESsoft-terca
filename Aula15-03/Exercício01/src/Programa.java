import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a matr�cula:");
		String matricula = leitor.nextLine();
		
		System.out.println("Digite o nome:");
		String nome = leitor.nextLine();
		
		System.out.println("Digite a nota 1:");
		double nota1 = leitor.nextDouble();
		
		System.out.println("Digite a nota 2:");
		double nota2 = leitor.nextDouble();
		
		double notafinal = (nota1 + nota2) / 2;
		
		System.out.println("Matr�cula: " + matricula);
		System.out.println("Nome: " + nome);
		
		if (notafinal >= 6) {
			
			System.out.println("O aluno est� aprovado!");
			
		} else {
			
			System.out.println("O aluno est� reprovado!");
		}
		
		System.out.println("A nota final �: " + notafinal);
		
		leitor.close();
	}

}
