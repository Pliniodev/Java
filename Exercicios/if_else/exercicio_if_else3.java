import java.util.Scanner;

public class exercicio_if_else3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		b = sc.nextInt();
		//pelo menos uma das condi��es deve ser aceita
		if (a % b == 0 || b % a == 0) {
			System.out.println("S�o M�ltiplos entre si");
			
		}
		else {
			System.out.println("N�o s�o multiplos entre si");
		}
		
		sc.close();
		
	}
}
