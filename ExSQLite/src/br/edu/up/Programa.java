package br.edu.up;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Programa {

	public static void main(String[] args) throws SQLException {
		
		incluir();
		atualizar();
		apagar();
		listar();
		
		//INSERT INTO cliente (nome, dta_nasc, cpf, email)
		//VALUES ('Ana', '2000/06/23', '7654321', 'ana@gmail.com')
		
		//SELECT * FROM cliente
		
		//UPDATE cliente SET nome = 'Ana Maria'
				//WHERE codigo = 2
		
		//DELETE FROM cliente
		//WHERE codigo = 1
		
	}
		
		public static void incluir() throws SQLException {
			
			//1. Abrir conexão com o banco de dados;
					String url = "jdbc:sqlite:C:\\Users\\Aluno\\Downloads\\ExSQLite\\db\\primeiro_banco_de_dados.db";
					Connection conexao = DriverManager.getConnection(url);
					
					//2. Criar o comando e executar o SQL;
					Statement comando = conexao.createStatement();
					String queryInsert = 
							"INSERT INTO cliente (nome, dta_nasc, cpf, email)"
							+ "VALUES ('Ana', '2000/06/23', '7654321', 'ana@gmail.com')";
					comando.execute(queryInsert);
					
			
		}

	

	
	public static void listar() throws SQLException {
		
		//1. Abrir conexão com o banco de dados;
				String url = "jdbc:sqlite:C:\\Users\\Aluno\\Downloads\\ExSQLite\\db\\primeiro_banco_de_dados.db";
				Connection conexao = DriverManager.getConnection(url);
				
				//2. Criar o comando e executar o SQL;
				Statement comando = conexao.createStatement();
				String querySelect = "select * from cliente";
				ResultSet resultado = comando.executeQuery(querySelect);
				
				//3. Mostrar os dados;
				while(resultado.next()) {
					int codigo = resultado.getInt(1);
					String nome = resultado.getString(2);
					String dta_nasc = resultado.getString(3);
					String cpf = resultado.getString(4);
					String email = resultado.getString(5);
					
					System.out.println("Código: " + codigo);
					System.out.println("Nome: " + nome);
					System.out.println("Data e Nascimento: " + dta_nasc);
					System.out.println("CPF: " + cpf);
					System.out.println("E-mail: " + email);
					System.out.println("--------------");
				}
		
	}
	
	public static void atualizar() throws SQLException {
		
		//1. Abrir conexão com o banco de dados;
				String url = "jdbc:sqlite:C:\\Users\\Aluno\\Downloads\\ExSQLite\\db\\primeiro_banco_de_dados.db";
				Connection conexao = DriverManager.getConnection(url);
				
				//2. Criar o comando e executar o SQL;
				Statement comando = conexao.createStatement();
				String queryUpdate = 
						"UPDATE cliente SET nome = 'Ricardo'\r\n"
						+ "	WHERE codigo = 3";
				comando.executeUpdate(queryUpdate);
				
	}
	
public static void apagar() throws SQLException {
		
		//1. Abrir conexão com o banco de dados;
				String url = "jdbc:sqlite:C:\\Users\\Aluno\\Downloads\\ExSQLite\\db\\primeiro_banco_de_dados.db";
				Connection conexao = DriverManager.getConnection(url);
				
				//2. Criar o comando e executar o SQL;
				Statement comando = conexao.createStatement();
				String queryDelete = 
						"DELETE FROM cliente\r\n"
						+ "	WHERE codigo = 5";
				comando.execute(queryDelete);
				
	}

}
