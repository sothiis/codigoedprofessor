package exemplo;

public class Teste {

	public static void main(String[] args) {		
		Fila f = new Fila(5);

		f.entra(1);
		f.entra(2);
		f.entra(3);
		f.entra(4);
		f.entra(5);
		
		System.out.println(f.tamanho());
		
		f.entra(6); // erro

		while(!f.vazia()) {
			System.out.println(f.sai());
		}

		System.out.println(f.sai()); // erro	
		
	}
}
