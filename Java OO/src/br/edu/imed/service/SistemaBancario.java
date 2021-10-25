package br.edu.imed.service;

import br.edu.imed.model.Gerente;

public class SistemaBancario {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Fulano");
		
		System.out.println(gerente.getNome());
	}
}
