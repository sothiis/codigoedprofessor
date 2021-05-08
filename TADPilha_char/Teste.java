package ex3;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
// Ex. 3 - Checar (), [] & {}
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua expressão: ");
		String expressao = entrada.nextLine();
		Stack S = new Stack(expressao.length());
		
		for(int i = 0; i < expressao.length(); i++) {
			char caracter = expressao.charAt(i);	
			
			if(caracter == '('|| caracter == '['|| caracter == '{') {
				S.push(caracter);
				
			} else if(caracter == ')'|| caracter == ']'|| caracter == '}') {
				char empilhado;
				
				if(S.isEmpty()) {
					System.out.println("Erro - Fechamento sem abertura");
					System.out.println("Fechamento: "+ caracter);
					return;
					}
				else 
					empilhado = S.pop();
				
				if(caracter == ')' && empilhado == '(')
					continue;
				
				if(caracter == ']' && empilhado == '[')
					continue;
				
				if(caracter == '}' && empilhado == '{')
					continue;
				
				System.out.println("Erro - Delimitador incorreto");
				System.out.println("Abertura: " + empilhado);
				System.out.println("Fechamento: " + caracter);
				return;			
			}	
		}
		
		if(S.isEmpty())		
			System.out.println("Expressão correta");
		else 
			System.out.println("Erro - Delimitador não fechado");
		
		entrada.close();		
		
// Ex. 2 - inverter frase do usuário
//		String frase;
//		Stack S;
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("Digite a frase a ser invertida: ");
//		frase = entrada.nextLine();
//		
//		S = new Stack(frase.length());
//		
//		for(int i = 0; i<frase.length();i++) {
//			S.push(frase.charAt(i));
//		}
//		
//		while(!S.isEmpty()) {
//			System.out.print(S.pop());
//		}		
//		
//		entrada.close();
		
//Ex. 1	- Pilha de char (teste)
//		Stack S = new Stack(10);
//
//		S.push('a');
//		S.push('b');
//		S.push('c');
//		
//		
//		while(!S.isFull()) {
//			S.push('z');
//		}		
//
//		while(!S.isEmpty()) {
//			System.out.println(S.pop());
//		}
		
//		System.out.println(S.pop());	
		

//		System.out.println();
//		System.out.println(S.size());

	}

}
