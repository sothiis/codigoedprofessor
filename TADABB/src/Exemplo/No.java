package Exemplo;

// No para �rvore bin�ria de char

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
