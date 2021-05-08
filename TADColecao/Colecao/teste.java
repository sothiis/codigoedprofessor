package colecao;

public class teste {

	public static void main(String[] args) {
		Colecao C = new Colecao(15);

		C.inserir(15);
		C.inserir(19);
		C.inserir(19);
		C.inserir(13);
		C.inserir(19); 
		C.inserir(0); 
		C.inserir(5); 
		
		if(C.deletar(19)) {
			System.out.println("Valor 19 deletado!");
		} else {
			System.out.println("Valor 19 NÃO deletado!");
		}

		C.imprimir();

		if(C.busca(5)) {
			System.out.println("Valor 5 encontrado!");
		} else {
			System.out.println("Valor 5 NÃO encontrado!");
		}
		
		
		
	}

}
