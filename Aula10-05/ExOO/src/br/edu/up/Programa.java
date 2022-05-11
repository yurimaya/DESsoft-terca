package br.edu.up;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Animal;
import br.edu.up.model.Cachorro;
import br.edu.up.model.Gato;
import br.edu.up.model.Homem;
import br.edu.up.model.Humano;
import br.edu.up.model.Mulher;

public class Programa {

	public static void main(String[] args) {
		
		try {
			
		
		//List listadeObjetos = new ArrayList();
		List<Animal> listadeAnimais = new ArrayList();
		List<Cachorro> listadeCachorros = new ArrayList();
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.raca = "Rottweiler";
		cachorro1.nome = "Eros";
		cachorro1.setIdade(3);
		cachorro1.porte = "Médio";
		
		listadeCachorros.add(cachorro1);
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.raca = "Vira-lata";
		cachorro2.nome = "Suzi";
		cachorro2.setIdade(3);
		cachorro2.porte = "Pequeno";
		
		listadeCachorros.add(cachorro2);
		
		Cachorro cachorro3 = new Cachorro();
		cachorro3.raca = "Pastor alemão";
		cachorro3.nome = "Goa";
		cachorro3.setIdade(2);
		cachorro3.porte = "Médio";
		
		
		
		
		Gato gato = new Gato();
		gato.idade = 4;
		gato.nome = "Fred";
		
		Homem homem = new Homem();
		homem.setIdade(54);
		homem.nome = "Gabriel";
		
		Humano humano = new Humano();
		humano.setIdade(96);
		humano.nome = "Elizabeth";
		
		Mulher mulher = new Mulher();
		mulher.setIdade(43);
		mulher.nome = "Cleonice";
		
		for (Animal animal : listadeCachorros) {
			System.out.println("Nome: " + animal.nome);
			System.out.println("Idade: " + animal.getIdade());
			System.out.println();
		}
		
	} catch (Exception e) {
		System.out.println(e.toString());
	}

}

}
