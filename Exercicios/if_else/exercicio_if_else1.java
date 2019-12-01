import java.util.Scanner;

public class exercicio_if_else1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um numero: " );
		numero = sc.nextInt();
		
		if (numero < 0) {
		System.out.println("NEGATIVO");
		}
		else {
		System.out.println("NÃO NEGATIVO");
		}
		sc.close();
	}

}
