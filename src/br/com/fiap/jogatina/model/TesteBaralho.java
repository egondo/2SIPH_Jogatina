package br.com.fiap.jogatina.model;

public class TesteBaralho {

	public static void main(String[] args) {
		Jogavel maco = new BaralhoNormal();
		
		maco.embaralhar();
		
		//maco.imprime();
		
		BaralhoTruco b = new BaralhoTruco();
		b.embaralhar();
		b.imprime();
		
	}
	
}
