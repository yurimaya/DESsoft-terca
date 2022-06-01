package br.edu.up;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.up.model.Pessoa;

public class Programa {

	static EntityManagerFactory emf;
	static EntityManager em;

	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("prj-jpa-sqlite");
		em = emf.createEntityManager();

		Pessoa pessoaIncluir = new Pessoa();
		pessoaIncluir.setNome("Ana");
		pessoaIncluir.setIdade(21);
		salvar(pessoaIncluir);

		Pessoa pessoaIncluir2 = new Pessoa();
		pessoaIncluir2.setNome("Pedro");
		pessoaIncluir2.setIdade(25);
		salvar(pessoaIncluir2);
//				Pessoa pessoaDoBanco = localizar(id); 
//				imprimir(pessoaDoBanco);
//				pessoaDoBanco.setNome("Pedro");
//				pessoaDoBanco.setIdade(25);
//				atualizar(pessoaDoBanco);
//				imprimir(pessoaDoBanco);
		// apagar(pessoaDoBanco.getId());
	}

	public static Integer salvar(Pessoa pessoa) {
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		return pessoa.getId();
	}

	public static Pessoa localizar(Integer id) {
		Pessoa pessoa = em.find(Pessoa.class, id);
		return pessoa;
	}

	public static void atualizar(Pessoa pessoa) {
		em.getTransaction().begin();
		em.merge(pessoa);
		em.getTransaction().commit();
	}

	public static void apagar(Integer id) {
		Pessoa pessoa = em.find(Pessoa.class, id);
		em.getTransaction().begin();
		em.remove(pessoa);
		em.getTransaction().commit();
	}

	@SuppressWarnings("unused")
	private static void imprimir(Pessoa pessoa) {
				System.out.println(pessoa);
    }

}