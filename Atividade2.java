package JavaInicial;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		float n1,n2,n3,n4,media;			
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite a primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("\n Digite a segunda nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("\n Digite a terceira nota: ");
		n3 = leia.nextFloat();
		
		System.out.println("\n Digite a quarta nota: ");
		n4 = leia.nextFloat();
		
		media = (n1 + n2 + n3 + n4)/4;
		System.out.printf("\n A media do aluno foi %.1f" , media);
	}
}
