/**
 
 Exerc�cio de fixa��o 1
 
Criar um programa para processar as seguintes informa��es de um aluno:
matr�cula, nome , nota1, nota2 e se ele est� aprovado ou reprovado;

Durante a execu��o calcular a nota final do aluno utilizando a seguinte
regra: notaFinal = (nota1 + nota2) / 2. Se a nota final for igual ou superior a
6 o aluno est� aprovado, caso contr�rio estar� reprovado;

O programa dever� imprimir o seguinte relat�rio:

Matr�cula: xxxxx
Nome: xxxxx xxxxx
Aprovado: ( x ) Sim (
 */

import java.util.Scanner;

public class Programa { //In�cio do programa


	public static void main(String[] args) { //In�cio do main
		
//		String matricula = "12345";
//		String nome = "Jo�o Pedro";
//		double nota1 = 7.2;
//		double nota2 = 1;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a matr�cula:");
		String matricula = leitor.nextLine();
		
		System.out.println("Digite o nome:");
		String nome = leitor.nextLine();
		
		System.out.println("Digite a nota 1:");
		double nota1 = leitor.nextDouble();
		
		System.out.println("Digite a nota 2:");
		double nota2 = leitor.nextDouble();
		
		double notaFinal = (nota1 + nota2) / 2;
		
		System.out.println("Matr�cula: " + matricula); //Concatena��o
		System.out.println("nome: " + nome);
		
		//igual ou superior a 6
		if (notaFinal >= 6) {
			
			
			System.out.println("Aprovado: (x) Sim ( ) N�o");
			
			
		} else {
			
			System.out.println("Aprovado: ( ) Sim (x) N�o");
			
		}
		
		System.out.println("Nota final: " + notaFinal);
		
		leitor.close();
	
	} // Fim do main	

} //Fim do programa
