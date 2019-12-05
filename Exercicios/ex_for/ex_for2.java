package ex_for;

import java.util.Scanner;

public class ex_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. 
		//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
		//essas informações conforme exemplo (use a palavra \"in\" para dentro do intervalo, e \"out\" para fora do intervalo
				
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Digite a quantidade de valores que serão lidos: ");
		
		int x = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i=0 ; i<x ; i++) {
			int y = sc.nextInt();
		 
			 if(y>=10 && y<=20) {
				in += 1; 
				 
			 }else {
				out +=1;
			 }
		 
		}
		 System.out.println("Finalizada a entrada de dados");
		 System.out.println(in + " in");
		 System.out.println(out + " out");
			
		 sc.close();
	}
		

}