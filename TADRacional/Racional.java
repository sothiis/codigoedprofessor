package ex01;

public class Racional {

	private int numerador, denominador;
	
	public Racional(int num, int den) {
		numerador = num;
		denominador = den;
		simplificar();
	}

	public void setNumerador(int num) {
		numerador = num;	
	}
	
	public void setDenominador(int den) {
		denominador = den;
	}

	public int getNumerador() {
		return numerador;
	}
	
	public int getDenominador() {
		return denominador;
	}
	
	public void multiplicar(Racional R) {
		numerador = numerador*R.numerador;	
		denominador = denominador*R.denominador;
		simplificar();		
	}

	public void dividir(Racional R) {
		numerador = numerador*R.denominador;
		denominador = denominador*R.numerador;
		simplificar();	
	}

	public void somar(Racional R) {
		int aux = denominador * R.denominador;
		
		numerador = numerador * R.denominador;
		R.numerador = R.numerador * denominador;
		
		setNumerador(numerador+R.numerador);
		setDenominador(aux);		
		simplificar();
	}
	
	public void subtrair(Racional R) {
		int aux = denominador * R.denominador;
		
		numerador = numerador * R.denominador;
		R.numerador = R.numerador * denominador;
		
		setNumerador(numerador-R.numerador);
		setDenominador(aux);
		simplificar();		
	}
	
	private void simplificar() {
		for(int i = 2; i < denominador; i++) {
			while(numerador % i == 0 && denominador % i == 0) {
				numerador = numerador/i;
				denominador = denominador/i;
			}
		}	
	}
	
	public void quadrado() {
		numerador = numerador*numerador;
		denominador = denominador*denominador;
	}
}





