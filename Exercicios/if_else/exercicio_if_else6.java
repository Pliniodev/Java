package curso_java1;

import java.util.Scanner;

public class exercicio_if_else6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double n;
		
		System.out.println("Digite um número");
		n = sc.nextDouble();
		
		if (n>0 && n<=25) {
			System.out.println("Você digitou um numero no Intervalo entre 0 e 25");
		}
		else if (n>25 && n<=50) {
			System.out.println("Você digitou um numero no Intervalo entre 25 e 50");
		}
		else if (n>50 && n<75) {
			System.out.println("Você digitou um numero no Intervalo entre 25 e 75");
		}
		else if (n>75 && n<=100) {
			System.out.println("Você digitou um numero no Intervalo entre 75 e 100");
		}
		else {
			System.out.println("Você digitou um numero que está fora dos intervalos");
		}
		sc.close();
	}

}
