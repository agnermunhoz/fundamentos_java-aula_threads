package br.com.fiap;

public class LinhaDeChegada {

	private int posicao = 0;
	
	public synchronized void chegar(String nome) {
		posicao++;
		System.out.printf("%sº lugar %s.\n", posicao, nome);
	}
	
}
