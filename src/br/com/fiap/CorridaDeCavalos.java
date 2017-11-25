package br.com.fiap;

import java.util.ArrayList;
import java.util.List;

public class CorridaDeCavalos {

	public static void main(String[] args) {
		LinhaDeChegada linhaDeChegada = new LinhaDeChegada();
		List<Cavalo> cavalos = new ArrayList<>();
		cavalos.add(new Cavalo("Pé de Pano", linhaDeChegada));
		cavalos.add(new Cavalo("Cavalo Festeiro", linhaDeChegada));
		cavalos.add(new Cavalo("Pepe Legal", linhaDeChegada));
		cavalos.add(new Cavalo("Shadowfax", linhaDeChegada));
		cavalos.add(new Cavalo("Ventania", linhaDeChegada));
		cavalos.add(new Cavalo("Cavalo de Fogo", linhaDeChegada));
		cavalos.add(new Cavalo("Spirit", linhaDeChegada));

		
		cavalos.forEach(c -> new Thread(c).start());
	}

}
