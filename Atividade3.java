package JavaInicial;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o salario bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\n Digite o valor do adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("\n Digite as horas extras trabalhadas: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("\n Digite o descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("O Salário lidquido é de: " + salarioLiquido + "R$");
		

	}

}
