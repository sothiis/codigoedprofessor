package colecao;

public class Colecao {
/* V Coleção estática (com vetor) de inteiros
 * V Cada elemento novo será colocado no próximo espaço disponível no vetor
 * V Buscar na coleção por um inteiro (se está ou não)
 * V Deletar da coleção um inteiro
 * V Imprimir a coleção 
 */

	private int dados[]; //Vetor da Coleção
	private int num;     //Posição da próxima inserção

	//construtor
	public Colecao(int maximo) {
		this.dados = new int[maximo];
		this.num = 0;
	} 
	
	//Inserção
	public void inserir(int elem) {
		if(this.num < this.dados.length) {
			this.dados[num] = elem;
			this.num++;
		}
	}
	
	//Imprimir o vetor
	public void imprimir() {
		for(int i = 0; i<this.num; i++) {	
			System.out.println(this.dados[i] + " ");
		}
	}
	
	//Busca
	public boolean busca(int elem) {
		for(int i=0; i<this.num; i++) {
			if(this.dados[i] == elem)
				return true;			
			}
		return false;		
	}
	
	//Deletar
	public boolean deletar(int elem) {
		int i;
		
		for(i=0; i<this.num; i++) {
			if(this.dados[i] == elem)
				break;			
		}
		
		if(i == this.num) {
		  return false;
		} else {
			for(int k = i; k<(this.num - 1); k++) {
				this.dados[k] = this.dados[k+1];				
			}
			this.num--;
			return true;			
		}
		
	}
	
	
}
