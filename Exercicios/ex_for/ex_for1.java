package ex_for;

import java.util.Scanner;

public class ex_for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// EXERCICIO 1 (FOR)
		// Leia um valor inteiro X (1 <= X <= 1000).  inclusive o
		// Em seguida mostre os ímpares de 1 até X, um valor por linha, X, se for o caso.
				
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite o número para saber os ímpares");
		
		int x = sc.nextInt();
				
		while(x>1000 || x<1) {
			System.out.println("número incorreto, tente novamente");
			x = sc.nextInt();
		}
		
		for (int i=1 ; i<=x ; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
					
		}
		System.out.println("Esses são os valores possíveis");
		
		sc.close();
	}
		

}