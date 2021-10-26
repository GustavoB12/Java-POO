package br.edu.imed.model;

public class ContaCorrente extends Conta{

	public void saque(double valor) {
		double novoValor = this.getSaldo() - valor;
		this.setSaldo(novoValor);
	}
}
