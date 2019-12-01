import java.util.Scanner;

public class exercicio_if_else4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("Qual a hora inicial?");
		a = sc.nextInt();
		
		System.out.println("Qual a hora final");
		b = sc.nextInt();
		
		
		
		if (a >= b) {
			c = (24 - a) + b;
			if (c < 1 || c > 24) {
				System.out.println("Você digitou valores incorretos");
			}
			else {
				System.out.println("Vc jogou durante " + c +" horas.");
			}
		}
		
		else if (a < b) {
			c = (b - a);
			if (c < 1 || c > 24) {
			System.out.println("Você digitou valores incorretos");
			}
			else {
				System.out.println("Vc jogou durante " + c + " horas.");
			}
		}
		sc.close();
	}
}
