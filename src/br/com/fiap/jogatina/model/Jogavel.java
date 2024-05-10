package br.com.fiap.jogatina.model;

public interface Jogavel<E> {

	public E comprar();

	public E[] distribuir(int qtd);

	void embaralhar();

}