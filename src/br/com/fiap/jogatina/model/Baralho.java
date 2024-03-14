package br.com.fiap.jogatina.model;

import java.util.Random;

public class Baralho {
	
	private Carta[] monte;
	private int topo;
	
	public Baralho() {
		//criando o vetor de cartas com 52 pos
		monte = new Carta[52];
		topo = 51;
		//monte[0] = new Carta(1, Naipe.ESPADAS);
		//monte[1] = new Carta(2, Naipe.ESPADAS);
		int j = 0;
		for(int i = 1; i <= 13; i++) {
			monte[j++] = new Carta(i, Naipe.ESPADAS);
			monte[j++] = new Carta(i, Naipe.OUROS);
			monte[j++] = new Carta(i, Naipe.COPAS);
			monte[j++] = new Carta(i, Naipe.PAUS);
		}
		
		for(Carta c : monte) {
			System.out.println(c.getValor() + "" + c.getNaipe());
		}
	}
	
	public Carta comprar() {
		Carta c = monte[topo];
		topo--;
		return c;
	}
	
	public Carta[] distribuir(int qtd) {
		Carta[] retorno = new Carta[qtd];
		for(int i = 0; i < qtd; i++) {
			retorno[i] = comprar();
		}
		return retorno;
	}
	
	public void embaralhar() {
		Random rand = new Random();
		for(int i = 0; i < 200; i++) {
			int x = rand.nextInt(52);
			int y = rand.nextInt(52);
			Carta aux = monte[x];
			monte[x] = monte[y];
			monte[y] = aux;			
		}		
	}
	
	
	public void imprime() {
		for(Carta c : monte) {
			System.out.println(c.getValor() + "" + c.getNaipe());
		}
	}
	

}
