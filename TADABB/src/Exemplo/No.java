package Exemplo;

// No para árvore binária de char

public class No {
	public char dado;
	public No dir;
	public No esq;
	
	public No(char elem) {
		this.dado = elem;
		this.dir = null;
		this.esq = null;
	}	
}
