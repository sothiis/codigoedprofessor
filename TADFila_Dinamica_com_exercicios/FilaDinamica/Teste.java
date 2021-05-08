package ex;

public class Teste {

	public static void main(String[] args) {
//	Ex 3 - Intecalar filas
		
		Fila f1 = new Fila();
		Fila f2 = new Fila();
		Fila res = new Fila();
		
		for(int i = 1; i < 50; i++) {
			f1.entra(i);
			f2.entra(i*10);
		}

//		f1.entra(5);
//		f1.entra(6);
		
		if(f2.tamanho() > f1.tamanho()) {
			while(!f1.vazia()) {
				res.entra(f1.sai());
				res.entra(f2.sai());
			}
			
			while(!f2.vazia()) {
				res.entra(f2.sai());
			}
		} else {// f2 <= f1
			while(!f2.vazia()) {
				res.entra(f1.sai());
				res.entra(f2.sai());
			}
			
			while(!f1.vazia()) {
				res.entra(f1.sai());
			}			
		}	
		
		while(!res.vazia()) {
			System.out.println(res.sai());
		}		
		
		
// Ex2 - Escreva um programa que implemente duas filas.
//		Crie um método para inverter os dados da fila 1 armazenando-os 
//		na fila 2. Imprima as duas filas. (não destrutivo)

//		Fila f1 = new Fila();
//		Fila f2 = new Fila();
//
//		Stack s = new Stack();
//		
//		for(int i = 0; i < 10; i++) {
//			f1.entra(i);
//		}
//		
//		int tam = f1.tamanho();
//		
//		for(int i = 0; i < tam; i++) {
//			int aux = f1.sai();
//			s.push(aux);
//			f1.entra(aux);
//		}
//		
//		while(!s.isEmpty()) {
//			f2.entra(s.pop());
//		}
//		
//		while(!f1.vazia()) {
//			System.out.println("F1: " + f1.sai() + ", F2: " + f2.sai());
//		}
		
	}

}
