package exemplo;

import java.util.Iterator;

public class Teste {

	public static void main(String[] args) {		
// Ex 2 - Faça uma rotina que inverta uma fila F1,  criando-se uma nova fila F2
		Fila F1 = new Fila(10);
		Stack aux = new Stack(10);
		Fila F2 = new Fila(10);
		
		F1.entra(1);
		F1.entra(2);
		F1.entra(3);
		F1.entra(4);
		
		int tam = F1.tamanho();
		
		for(int i = 0; i < tam; i++) {
			int a = F1.sai();
			
			aux.push(a);
			F1.entra(a);
		}
		
		while(!aux.isEmpty()) {
			F2.entra(aux.pop());
		}
		
		while(!F2.vazia()) {
			System.out.println(F2.sai() + ", " + F1.sai());
		}
		
		
//		Ex1 - Faça uma rotina para verificar se os  elementos de uma 
//		fila estão ordenados de  forma crescente. A fila deve terminar
//		como começou.
//		Método não destrutivo

//		Fila f = new Fila(5);
//		String aux = "Fila é crescente";
//
//		f.entra(1);
//		f.entra(2);
//		f.entra(3);
//		f.entra(4);
//		
//		int tam = f.tamanho();
//		
//		int a1 = f.sai();
//		f.entra(a1);
//		
//		for(int i = 1; i < tam; i++) {
//			int a2 = f.sai();
//			f.entra(a2);
//			
//			if(a1>=a2) {
//				aux = "Fila NÃO é crescente";
//			}
//			
//			a1 = a2;
//			
//		}
//		
//		System.out.println(aux);
//		
//		while(!f.vazia()) // Teste apenas, irá destruir a fila
//			System.out.println(f.sai());
		
		
//		Ex1 - Faça uma rotina para verificar se os  elementos de uma 
//		fila estão ordenados de  forma crescente.
//		Método destrutivo
//		
//		Fila f = new Fila(5);
//
//		f.entra(1);
//		f.entra(20);
//		f.entra(3);
//		f.entra(4);
//
//		int a1 = f.sai();
//		
//		while(!f.vazia()) {
//			int a2 = f.sai();
//			
//			if(a1>a2) {
//				System.out.println("Fila NÃO é crescente");
//				return;
//			}
//			
//			a1 = a2;
//		}
//		
//		System.out.println("Fila é crescente!");
			
	}
}
