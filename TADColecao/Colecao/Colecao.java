package colecao;

public class Colecao {
/* V Cole��o est�tica (com vetor) de inteiros
 * V Cada elemento novo ser� colocado no pr�ximo espa�o dispon�vel no vetor
 * V Buscar na cole��o por um inteiro (se est� ou n�o)
 * V Deletar da cole��o um inteiro
 * V Imprimir a cole��o 
 */

	private int dados[]; //Vetor da Cole��o
	private int num;     //Posi��o da pr�xima inser��o

	//construtor
	public Colecao(int maximo) {
		this.dados = new int[maximo];
		this.num = 0;
	} 
	
	//Inser��o
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
