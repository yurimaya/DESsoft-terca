import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

	public class Programa {

		public static void main(String[ ] args) throws FileNotFoundException {
		File arquivo = new File("C:\\Users\\Aluno\\Downloads\\exercicio05aula05-04\\src\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
		int grupoA = 0;
		int grupoB = 0;
		int grupoC = 0;
		int grupoD = 0;
		int grupoE = 0;
		int grupoF = 0;
		int valortotal = 0;
	
	
	while(leitor.hasNext()) {
		String linha = leitor.nextLine();
		//System.out.println(linha);
		
		String[] dadosLinha = linha.split("\t");
//		System.out.println("Grupo: "  + dadosLinha[0]);
//		System.out.println("Valor: "  + dadosLinha[1]);
//		System.out.println("=================");
		
		
		if (dadosLinha[0].equals("A")) {
			//System.out.println(dadosLinha[1]);
			int valor = Integer.parseInt(dadosLinha[1]);
			grupoA = grupoA + valor;
		}
	

		if (dadosLinha[0].equals("B")) {
			//System.out.println(dadosLinha[1]);
			int valor = Integer.parseInt(dadosLinha[1]);
			grupoB = grupoB + valor;
		}
		
		if (dadosLinha[0].equals("C")) {
			//System.out.println(dadosLinha[1]);
			int valor = Integer.parseInt(dadosLinha[1]);
			grupoC = grupoC + valor;
		}
		
		if (dadosLinha[0].equals("D")) {
			//System.out.println(dadosLinha[1]);
			int valor = Integer.parseInt(dadosLinha[1]);
			grupoD = grupoD + valor;
		}
		
		if (dadosLinha[0].equals("E")) {
			//System.out.println(dadosLinha[1]);
			int valor = Integer.parseInt(dadosLinha[1]);
			grupoE = grupoE + valor;
		}
		
		if (dadosLinha[0].equals("F")) {
			//System.out.println(dadosLinha[1]);
			int valor = Integer.parseInt(dadosLinha[1]);
			grupoF = grupoF + valor;
		}
		
		if (dadosLinha[0].equals("B")) {
			//System.out.println(dadosLinha[1]);
			int valor = Integer.parseInt(dadosLinha[1]);
			grupoB = grupoB + valor;
		}
		}
		
		valortotal = grupoA + grupoB + grupoC + grupoD + grupoE + grupoF;
		
	System.out.println("Valor total do grupo A: " + grupoA);
	System.out.println("Valor total do grupo B: " + grupoB);
	System.out.println("Valor total do grupo C: " + grupoC);
	System.out.println("Valor total do grupo D: " + grupoD);
	System.out.println("Valor total do grupo E: " + grupoE);
	System.out.println("Valor total do grupo F: " + grupoF);
	System.out.println("Valor total dos grupos: " + valortotal);
	leitor.close();
	
	}
	
	}


