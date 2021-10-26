package br.edu.imed.model;

public class Gerente extends Funcionario {

	private String senha;
	private Integer quantidadeFuncionarioGerenciado;

	@Override
	public double obterBonus() {

		return super.obterBonus() + 100;
		// return this.getSalario() * 0.15;
	}

	public Gerente(String nome, Integer qt) {
		super(nome);
		this.quantidadeFuncionarioGerenciado = qt;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getQuantidadeFuncionarioGerenciado() {
		return quantidadeFuncionarioGerenciado;
	}

	public void setQuantidadeFuncionarioGerenciado(Integer quantidadeFuncionarioGerenciado) {
		this.quantidadeFuncionarioGerenciado = quantidadeFuncionarioGerenciado;
	}

}
