import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		String[] matriculas = new String[5];
//		matriculas[0] = "12345";
//		matriculas[1] = "23456";
//		matriculas[2] = "34567";
//		matriculas[3] = "45678";
//		matriculas[4] = "56789";

		String[] nomes = new String[5];
//		nomes[0] = "Paulo";
//		nomes[1] = "Vitor";
//		nomes[2] = "Diego";
//		nomes[3] = "Maurício";
//		nomes[4] = "João";

		double[] notas1 = new double[5];
//		notas1[0] = "8";
//		notas1[1] = "6";
//		notas1[2] = "9";
//		notas1[3] = "7";
//		notas1[4] = "10";

		double[] notas2 = new double[5];
//		notas2[0] = "4";
//		notas2[1] = "8";
//		notas2[2] = "9";
//		notas2[3] = "6";
//		notas2[4] = "9";

		double[] notaFinal = new double[5];
//		notaFinal[0] = (notas1[0] + notas2[0]) / 2;
//		notaFinal[1] = (notas1[1] + notas2[1]) / 2;
//		notaFinal[2] = (notas1[2] + notas2[2]) / 2;
//		notaFinal[3] = (notas1[3] + notas2[3]) / 2;
//		notaFinal[4] = (notas1[4] + notas2[4]) / 2;

		Scanner leitor = new Scanner(System.in);

		for (int i = 0; i <= 5; i++) {
			System.out.println("Digite a matrícula do aluno:");
			matriculas[i] = leitor.nextLine();

			System.out.println("Digite o nome do aluno:");
			nomes[i] = leitor.nextLine();

			System.out.println("Digite a nota 1 do aluno:");
			notas1[i] = leitor.nextDouble();

			System.out.println("Digite a nota 2 do aluno:");
			notas2[i] = leitor.nextDouble();

			double notafinal = (notas1[i] + notas2[i]) / 2;

			System.out.println("Nota final: " + notafinal);

			if (notafinal >= 6) {

				System.out.println("O aluno está aprovado!");

			} else {

				System.out.println("O aluno está reprovado!");

			}

			System.out.println();
			leitor.nextLine();

		}

		leitor.close();

	}

}
