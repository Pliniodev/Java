package curso_java1;

import java.util.Scanner;

public class exercicio_where1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int senha;
	    senha = 0;
	    
	    System.out.println("Digite a senha de acesso:");
	    
	    while (senha != 2002) {
	    	senha = sc.nextInt();
	    	System.out.println("Senha inválida, tente novamente");
		    
	    }
	    
	    System.out.println("Acesso permitido");
	    sc.close();
	}
	

}
