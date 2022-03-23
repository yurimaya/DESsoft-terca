import java.util.Scanner;

public class Programa {
	
/*	
	Exerc�cio de fixa��o 3
	
	Criar um programa para processar as seguintes informa��es de um aluno:
	matr�cula, nome , nota 1, nota 2, nota 3, nota 4 e nota 5;

	O sistema dever� ler as notas do aluno em um vetor e a entrada de dados
	pelo usu�rio s� poder� ser nos valores de 0 a 10;
	
	No final da execu��o imprimir o seguinte relat�rio:
		
	Matr�cula: xxxxx
	Nome: xxxxx xxxxx
	Nota (x) : xxxxx
	Nota (y) : yyyyy
	(...)
 
*/
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a matr�cula:");
		String matricula = leitor.nextLine();
		
		System.out.println("Informe o nome:");
		String nome = leitor.nextLine();
		
		double[] notas = new double[5];
		
		int contador = 0;
		do {
			System.out.println("Informa uma nota de 0 a 10.");
			System.out.println("Digite a " + (contador + 1) + "a nota");
			double temp = leitor.nextDouble();
			
//			if (temp < 0 || temp > 10) {
//				//Inv�lido
//				System.out.println("A nota " + temp + " � inv�lida");
//			} else {
//				//V�lido
//				notas[contador] = temp;
//				contador++;
//			}
			
			if (temp >= 0 && temp <= 10) {
				notas[contador] = temp;
				contador++;
			} else {
				System.out.println("A nota " + temp + " � inv�lida");
			}
		} while(contador < 5);
		
		System.out.println();
		System.out.println("...........RELAT�RIO.............");
		System.out.println("Matr�cula: " + matricula);
		System.out.println("Nome: " + nome);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notas[i]);
		}
		
		leitor.close();
		
	}
	
}
