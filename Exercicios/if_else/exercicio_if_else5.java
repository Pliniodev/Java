import java.util.Scanner;

public class exercicio_if_else5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int cod;
		int quan;
		
		
		System.out.println("Digite o código do item de acordo com a tabela: ");
		cod = sc.nextInt();
		
		System.out.println("Qual a quantidade?: ");
		quan = sc.nextInt();
		
		double total = 0;
		
		if (cod == 1) {
			total = quan * 4.0;
		
		} else if ( cod == 2) {
			total = quan * 4.50;
			
		}else if ( cod == 3) {
			total = quan * 5.0;
			
		}else if ( cod == 4) {
			total = quan * 2.0;
			
		}else if ( cod == 5) {
			total = quan * 1.5;
			
		}else if ( cod > 5) {
			System.out.println("Dados incorretos");
			
		}
		//pintf é o print de formatação
		System.out.printf("Valor Total R$ %.2f%n", total);
		
		sc.close();
		
	}

}
