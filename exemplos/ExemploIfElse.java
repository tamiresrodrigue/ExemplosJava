package exemplos;

import java.util.Scanner;

public class ExemploIfElse {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		if (numero<10) {
			System.out.println("É menor que 10!!!");
		} else {
				System.out.println("É menor que 10 vacilão");
			} sc.close();
			
		}
	}
