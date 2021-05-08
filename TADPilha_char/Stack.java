package ex3;

// Stack estática de char

public class Stack {
	private char dados[];
	private int topo;
	
	//Construtor
	public Stack(int max) {
		this.dados = new char[max];
		this.topo = 0;
	}
	
	//Inserir
	public void push(char elem) {
//		if(this.dados.length > this.topo) { //Opção 1
		if(!this.isFull()) { // Opção 2
			this.dados[this.topo] = elem;
			this.topo++;		
		}
	}
	
	//Size
	public int size() {
		return this.topo;
	}
	
	//Remoção
	public char pop() {
//		if(this.topo > 0) { // Opção 1
		if(!this.isEmpty()) { // Opção 2
			this.topo--;
			return this.dados[this.topo];
		} else {
			System.out.println("Pilha Vazia!");
			return '~';
		}
	}

	// Está cheia
	public boolean isFull() {
		if(this.topo == this.dados.length)
			return true;
		else 
			return false;
	}

	// Está vazia
	public boolean isEmpty() {
		if(this.topo == 0)
			return true;
		else 
			return false;
	}

	// Reset
	public void reset() {
		this.topo = 0;
	}
	
}