package org.william;

public class LinkedList {
	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;
	
	public LinkedList() {
		this.tamanho = 0;
	}
	
	public Elemento getPrimeiro() {
		return primeiro;
	}
	
	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}
	
	public Elemento getUltimo() {
		return ultimo;
	}
	
	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void adicionar(String novoValor) {
		Elemento elemento = new Elemento(novoValor);
		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = elemento;
			this.ultimo = elemento;
		} else {
			this.ultimo.setProximo(elemento);
			this.ultimo = elemento;
		}
		this.tamanho++;
	}
	
	public void remover(String valorProcurado) {
		Elemento anterior = null;
		Elemento atual = this.primeiro;
		for (int i = 0; i < this.tamanho; i++) {
			if (atual.getValor().equalsIgnoreCase(valorProcurado)) {
				if (atual == primeiro && atual == ultimo) {
					this.primeiro = null;
					this.ultimo = null;
				}
				if(atual == primeiro) {
					this.primeiro = atual.getProximo();	
					atual.setProximo(null);
				} else if (atual == ultimo) {
					this.ultimo = anterior;
					anterior.setProximo(null);
				} else {
					anterior.setProximo(atual.getProximo());
					atual = null;
				}
				this.tamanho--;
				break;
			}
			anterior = atual;
			atual = atual.getProximo();
		}
	}
	
	public Elemento getElemento(int pos) {
		Elemento atual = this.primeiro;
		for(int i = 0; i < pos; i++) {
			if (atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		return atual;
	}
	
}
