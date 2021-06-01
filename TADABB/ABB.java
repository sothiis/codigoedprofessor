package Exemplo;

// Árvore binária de busca de char

public class ABB {
	private No raiz;

//	Construtor
	public ABB() {
		this.raiz = null;
	}
	
//	Está vazia
	public boolean vazia() {
		return (this.raiz == null);
	}
	
//	Inserir
	public void inserir(char elem) {
		No novo = new No(elem);
		
		if(this.vazia()) {
			this.raiz = novo;
			return;
		}
		
		No atual = this.raiz;
		No pai = this.raiz;
		
		while(atual != null) {
			pai = atual;
			
			if(elem > atual.dado) {
				atual = atual.dir;
			}
			else { 
				atual = atual.esq;
			}
		}
		
		if(elem > pai.dado){
			pai.dir = novo;
		} else {
			pai.esq = novo;
		}		
	}
	
//	Inserir recursivo
	public void add(char elem) {
		this.raiz = this.add(this.raiz,elem);
	}
	
	private No add(No atual, char elem) {
		No novo = new No(elem);
		
		if(atual == null) {
			atual = novo;
			return atual;
		}
		
		if(elem > atual.dado) {
			atual.dir = add(atual.dir, elem);
		} else {
			atual.esq = add(atual.esq,elem);
		}
		
		return atual;
		
	}
	
//	Remover
	public boolean remover(char elem) {
		No removido = this.raiz;
		No pai = null;
		
		while(removido != null) {
			if(removido.dado == elem)
				break;
			
			pai = removido;
			
			if(elem > removido.dado)
				removido = removido.dir;
			else 
				removido = removido.esq;			
		}
		
//		Não encotnrado
		if(removido == null)
			return false;
//		CASO 1
		if(removido.dir == null && removido.esq == null) {
			if(elem > pai.dado)
				pai.dir = null;
			else 
				pai.esq = null;
			
			return true;
		}
//		CASO 2: Sem filho direito
		if(removido.dir == null) {
			if(elem > pai.dado)
				pai.dir = removido.esq;
			else 
				pai.esq = removido.esq;
			
			return true;
		}

//		CASO 2: Sem filho esquerdo
		if(removido.esq == null) {
			if(elem > pai.dado)
				pai.dir = removido.dir;
			else 
				pai.esq = removido.dir;
			
			return true;
		}
//		CASO 3
		No troca = removido.dir;
		pai = removido;
		
		while (troca.esq != null) {
			pai = troca;
			troca = troca.esq;
		}
		
		char aux = removido.dado;
		removido.dado = troca.dado;
		troca.dado = aux;
		
		if(elem > pai.dado)
			pai.dir = troca.dir;
		else 
			pai.esq = troca.dir;
		
		return true;		
	}
	
//	Imprimir Pre Ordem
	public void preOrdem() {
		this.preOrdem(this.raiz);
	}
	
	private void preOrdem(No atual) {
		if(atual == null)
			return;
		System.out.println(atual.dado);
		preOrdem(atual.esq);
		preOrdem(atual.dir);		
	}
	
//	Imprimir Em Ordem
	public void emOrdem() {
		this.emOrdem(this.raiz);
	}
	
	private void emOrdem(No atual) {
		if(atual == null)
			return;
		emOrdem(atual.esq);
		System.out.println(atual.dado);
		emOrdem(atual.dir);		
	}
	
//	Imprimir Pos Ordem
	public void posOrdem() {
		this.posOrdem(this.raiz);
	}
	
	private void posOrdem(No atual) {
		if(atual == null)
			return;
		posOrdem(atual.esq);
		posOrdem(atual.dir);		
		System.out.println(atual.dado);
	}
	
}

