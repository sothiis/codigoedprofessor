package Exemplo;

public class Teste {

	public static void main(String[] args) {
		ABB a = new ABB();

		a.add('b');
		a.add('a');
		a.add('d');
		a.add('c');
		a.add('g');
		a.add('z');
		a.add('s');
		a.add('w');
		
//		a.remover('x');

		a.preOrdem();
		System.out.println("#########");
		a.emOrdem();
		System.out.println("#########");
		a.posOrdem();
		System.out.println("#########");

	}

}
