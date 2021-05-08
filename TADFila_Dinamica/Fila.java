package ex;

// TAD Fila dinâmica de inteiros

public class Fila {
	private No inicio;
	private No fim;
	private int total;
	
//	Construtor
	public Fila() {
		this.inicio = null;
		this.fim = null;
		this.total = 0;
	}
	
//	Está vazia?
	public boolean vazia() {
		if(this.total == 0)
			return true;
		else 
			return false;		
	}
	
//	Inserir
	public void entra(int elem) {
		No novo = new No(elem);
		
		if (this.vazia()) {
			this.inicio = novo;
			this.fim = novo;
		} else {
			this.fim.prox = novo;
			this.fim = novo;
		}
		
		this.total++;		
	}
	
//	Remover
	public int sai() {
		if(this.vazia()) {
			System.out.println("Fila Vazia!");
			return -1;
		}
		
		No temp = this.inicio;
		
		if(this.total == 1) {
			this.inicio = null;
			this.fim = null;
		} else {
			this.inicio = this.inicio.prox;
		}
		
		this.total--;
		
		return temp.dado;		
	}
	
//	Tamanho
	public int tamanho() {
		return this.total;
	}
	
	
}





