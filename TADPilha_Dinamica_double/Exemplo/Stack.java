package ex;

//TAD Pilha de No de double

public class Stack {
	private No topo;
	
//	Construtor
	public Stack() {
		this.topo = null;
	}

//	Está vazio?
	public boolean isEmpty() {
		if(this.topo == null)
			return true;
		else 
			return false;
	}
	
//	Inserir
	public void push(double elem) {
		No novoNo = new No(elem);
		
		No aux = topo; //Posição de memória atual de topo
		
		novoNo.prox = aux; //novoNo.prox recebe posição de memória atual de topo
		
		this.topo = novoNo; //topo aponta para o novoNo
	}
	
//	Remoção
	public double pop() {
		if(this.isEmpty()) {
			System.out.println("Pilha vazia");
			return -1.0;
		}
		
		No aux = topo; //Posição atual de topo
		topo = topo.prox; //Pego próximo da pilha e coloco em topo
		return aux.dado;
	}
	
//	Tamanho
	public int size() {
		int count = 0;
		No aux = this.topo;
		
		while(aux != null) {
			count++;
			aux = aux.prox;
		}
		
		return count;
	}
}





