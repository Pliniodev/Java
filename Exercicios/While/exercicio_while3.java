package curso_java1;

import java.util.Scanner;

public class exercicio_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int g = 0;
		int a = 0;
		int d = 0;
		
		
		System.out.println("1: Gasolina\n2: ¡lcool\n3: Diesel\n4: fim");
		int tipo = 0;
		
		while ( tipo != 4) {
			tipo = sc.nextInt();
			if (tipo == 1) {
				g += 1;	
			}
			else if (tipo == 2) {
				a += 1;
			}
			else if (tipo == 3) {
				d +=1;
			}
		}
		System.out.printf("Esta È a contagem das compras dos clientes:\n Gasolina:" + g + "\n¡lcool:" + a + "\nDiesel:" + d);
		sc.close();
	}

}
