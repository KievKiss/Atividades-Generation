package JavaInicial;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		float n1,n2,n3,media;
		n1 = 5;
		n2 =9;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite a primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("\n Digite a segunda nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("\n Digite a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1*2 + n2*3 + n3*5)/10;
		System.out.println("\n A media do aluno foi " + media);
		
		/* 
		Operadores relacionais: < , > / <= , >= / != , ==
		Operadores logicos: E --> && / OU --> ||;
		Módulos %--> resto da divisão por inteiros 
		 
		 */
		

	}

}
