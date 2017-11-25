package br.com.fiap;

public class Cavalo implements Runnable {

	private String nome;
	private LinhaDeChegada linhaDeChegada;
	
	public Cavalo(String nome, LinhaDeChegada linhaDeChegada) {
		super();
		this.nome = nome;
		this.linhaDeChegada = linhaDeChegada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Cavalo %s, iteração %s.\n", nome, i);
			try {
				Thread.sleep((int)(Math.random() * 5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		linhaDeChegada.chegar(nome);
	}

}
