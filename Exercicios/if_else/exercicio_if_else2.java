import java.util.Scanner;

public class exercicio_if_else2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		//Resto da divisão é %
		if (numero % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("impar");
		}
		sc.close();
	}

}
