package ex01;

public class Exemplo {

	public static void main(String[] args) {
		
		Racional R = new Racional(2,10);
		System.out.println("R: "+ R.getNumerador() + "/" + R.getDenominador());
		
		Racional M = new Racional(5,10);
		System.out.println("M: "+ M.getNumerador() + "/" + M.getDenominador());
		
		R.somar(M);
		
		System.out.println("Resultado: "+R.getNumerador() + "/" + R.getDenominador());
		
	}

}
