package br.com.fiap.jogatina.model;



public class BaralhoNormal extends Baralho {
	
	public BaralhoNormal() {
		super();
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
	}
	
	public void imprime() {
		for(Carta c : monte) {
			System.out.println(c);
		}
	}
	

}
