package semana2.fila;

import semana2.fila.Nodo;

public class Nodo {
	private int valor;
	private Nodo prox;
	
	public Nodo() {
		this.valor = 0;
		this.prox = null;
	}

	public Nodo(int val, Nodo p) {
		this.valor = val;
		this.prox = p;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}

}

