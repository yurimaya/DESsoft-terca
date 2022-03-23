import java.util.Scanner;

public class Programa {
	
/*	
	Exerc�cio de fixa��o 4
	
Com base no exerc�cio de fixa��o 3, o sistema dever� dizer se o aluno est� aprovado
ou reprovado na disciplina, para isso considerar as seguintes informa��es:

Os valores 0.05, 0.05, 0.2, 0.2 e 0.5 s�o, respectivamente, os pesos das notas que
dever�o ser armazenadas em um vetor para c�lculo da nota final;

Para calcular a nota final do aluno utilizar a seguinte regra:
nFinal = (n1 * 0.05) + (n2 * 0.05) + (n3 * 0.2) + (n4 * 0.2) + (n5 * 0.5);

Se a nota final for igual ou superior a 6 o programa dever� imprimir a informa��o
de que o aluno est� aprovado, caso contr�rio de que est� reprovado
 
*/
	
	
	public static void main(String[] args) {
	
		double[] pesos = {0.05 , 0.05 , 0.2 , 0.2 , 0.5};
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Informe a matr�cula:");
		String matricula = leitor.nextLine();
		
		System.out.println("Informe o nome:");
		String nome = leitor.nextLine();
		
		double[] notas = new double[5];
		
		
		int contador = 0;
		do {
			System.out.println("Informe a nota:");
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
		
		double notaFinal = 
				(notas[0] * pesos[0]) +
				(notas[1] * pesos[1]) +
				(notas[2] * pesos[2]) +
				(notas[3] * pesos[3]) +
				(notas[4] * pesos[4]);
							
		
		System.out.println();
		System.out.println("...........RELAT�RIO.............");
		System.out.println("Matr�cula: " + matricula);
		System.out.println("Nome: " + nome);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notas[i]);
		}
		
		System.out.println("Nota final: " + notaFinal);
		
		if (notaFinal >= 6) {
			
			System.out.println("O aluno est� aprovado!");
			
		
		} else {
			
			System.out.println("O aluno est� reprovado!");
		
		leitor.close();
		
		}
		
	}
	
}