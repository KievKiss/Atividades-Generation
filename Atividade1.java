package JavaInicial;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		float salario,abono, novoSalario;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\n Digite o Abono");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("\n O novo salario é " + novoSalario + " $");
		
		

	}

}
