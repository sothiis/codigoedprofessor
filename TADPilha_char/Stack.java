package ex3;

// Stack est�tica de char

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
//		if(this.dados.length > this.topo) { //Op��o 1
		if(!this.isFull()) { // Op��o 2
			this.dados[this.topo] = elem;
			this.topo++;		
		}
	}
	
	//Size
	public int size() {
		return this.topo;
	}
	
	//Remo��o
	public char pop() {
//		if(this.topo > 0) { // Op��o 1
		if(!this.isEmpty()) { // Op��o 2
			this.topo--;
			return this.dados[this.topo];
		} else {
			System.out.println("Pilha Vazia!");
			return '~';
		}
	}

	// Est� cheia
	public boolean isFull() {
		if(this.topo == this.dados.length)
			return true;
		else 
			return false;
	}

	// Est� vazia
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