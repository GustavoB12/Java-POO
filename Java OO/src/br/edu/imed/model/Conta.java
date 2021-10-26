package br.edu.imed.model;

public abstract class Conta {
	private double saldo;
	private String banco;
	private int numero;
	private int agencia;

	public double getSaldo() {
		return saldo;
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.getSaldo() < valor) {
			return false;
		}else {
			destino.setSaldo(destino.getSaldo() + valor);
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

}
