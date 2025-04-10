package exemplos;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecione uma opção");
		System.out.println("1 - Sonegador de impostos");
		System.out.println("2 - Funileiro");
		System.out.println("3 - Demolidor");
		System.out.println("4 - Sair");

int opcao = sc.nextInt();
switch (opcao) {
case 1:
	System.out.println("Patrabéns - Você escolheu o curso Sonegador de impostos ");
	break;
case 2:
	System.out.println("Patrabéns - Você escolheu o curso Funileiro ");
	break;
case 3:
	System.out.println("Patrabéns - Você escolheu o curso Demolidor ");
	break;
case 4:
	System.out.println("Patrabéns - Você escolheu o curso Demolidor ");
	break;
	default:
		System.out.println("Escolha inválida");
		break;
	
}

	}
}
