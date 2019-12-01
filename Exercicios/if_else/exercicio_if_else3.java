import java.util.Scanner;

public class exercicio_if_else3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Digite o primeiro número: ");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo número");
		b = sc.nextInt();
		//pelo menos uma das condições deve ser aceita
		if (a % b == 0 || b % a == 0) {
			System.out.println("São Múltiplos entre si");
			
		}
		else {
			System.out.println("Não são multiplos entre si");
		}
		
		sc.close();
		
	}
}
