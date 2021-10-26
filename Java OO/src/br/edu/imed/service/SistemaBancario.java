package br.edu.imed.service;

import br.edu.imed.model.ContaCorrente;
import br.edu.imed.model.ContaPoupanca;
import br.edu.imed.model.Gerente;

public class SistemaBancario {

	public static void main(String[] args) {
//		Gerente gerente = new Gerente("Fulano", 15);
//		gerente.setSalario(200.00);
//		System.out.println(gerente.getNome());
//		System.out.println(gerente.obterBonus());
//		
		ContaCorrente cC = new ContaCorrente();
		cC.setSaldo(200);
		cC.saque(100);

		System.out.println(cC.getSaldo());

		ContaPoupanca cP = new ContaPoupanca();
		cP.setSaldo(1000.00);
		System.out.println("saldo cP=" + cP.getSaldo() + "saldo cC=" + cC.getSaldo());
		cP.transfere(500, cC);
		System.out.println("saldo cP=" + cP.getSaldo() + "saldo cC=" + cC.getSaldo());
	}
}
