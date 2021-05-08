package exemplo;

//Pilha estática de inteiros

public class Stack {
	private int dados[];
	private int topo;
	
	//Construtor
	public Stack(int max) {
		this.dados = new int[max];
		this.topo = 0;
	}
	
	//size
	public int size() {
		return this.topo;
	}
	
	//inserir
	public void push(int elem) {
		if(this.dados.length > this.topo) {
			this.dados[this.topo] = elem;
			this.topo++;
		}		
	}
	
	//remover
	public int pop() {
		if(this.topo > 0) {
			this.topo--;
			return this.dados[this.topo];
		}
		else {
			System.out.println("Pilha vazia!");
			return -1;
		}
	}
	
	//isEmpty
	public boolean isEmpty() {
		if(this.topo == 0)
			return true;
		else 
			return false;
	}
	
	//isFull
	public boolean isFull() {
		if(this.topo == this.dados.length)
			return true;
		else
			return false;
	}
	
	//top
	public int top() {
		if(this.topo > 0) {
			return this.dados[this.topo-1];
		} else {
			System.out.println("Pilha Vazia");
			return -1;
		}
			
	}
	
	//reset
	public void reset() {
		this.topo = 0;
	}
}



