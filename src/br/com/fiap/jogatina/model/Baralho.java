package br.com.fiap.jogatina.model;

import java.util.Random;

public abstract class Baralho implements Jogavel {

	protected Carta[] monte;
	protected int topo;

	public Baralho() {
		super();
	}

	@Override
	public Carta comprar() {
		Carta c = monte[topo];
		topo--;
		return c;
	}

	@Override
	public Carta[] distribuir(int qtd) {
		Carta[] retorno = new Carta[qtd];
		for(int i = 0; i < qtd; i++) {
			retorno[i] = comprar();
		}
		return retorno;
	}

	@Override
	public void embaralhar() {
		int tamanho = this.monte.length;
		
		Random rand = new Random();
		for(int i = 0; i < 200; i++) {
			int x = rand.nextInt(tamanho);
			int y = rand.nextInt(tamanho);
			Carta aux = monte[x];
			monte[x] = monte[y];
			monte[y] = aux;			
		}		
	}

}