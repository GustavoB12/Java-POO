package br.edu.imed.model;

public class Gerente extends Funcionario {

	private String senha;
	private String quantidadeFuncionarioGerenciado;
	
	public Gerente(String nome) {
		this.setNome(nome);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getQuantidadeFuncionarioGerenciado() {
		return quantidadeFuncionarioGerenciado;
	}

	public void setQuantidadeFuncionarioGerenciado(String quantidadeFuncionarioGerenciado) {
		this.quantidadeFuncionarioGerenciado = quantidadeFuncionarioGerenciado;
	}

}
