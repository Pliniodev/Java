package ex_for;

import java.util.Scanner;

public class ex_for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// EXERCICIO 1 (FOR)
		// Leia um valor inteiro X (1 <= X <= 1000).  inclusive o
		// Em seguida mostre os �mpares de 1 at� X, um valor por linha, X, se for o caso.
				
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite o n�mero para saber os �mpares");
		
		int x = sc.nextInt();
				
		while(x>1000 || x<1) {
			System.out.println("n�mero incorreto, tente novamente");
			x = sc.nextInt();
		}
		
		for (int i=1 ; i<=x ; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
					
		}
		System.out.println("Esses s�o os valores poss�veis");
		
		sc.close();
	}
		

}