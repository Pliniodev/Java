package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.tri_1 = sc.nextDouble();
		aluno.tri_2 = sc.nextDouble();
		aluno.tri_3 = sc.nextDouble();
		
		System.out.printf("Nota final: " + "%.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal() < 60.0) {
			System.out.println("Não passou");
			System.out.printf("Faltando %.2f pontos%n", aluno.notaRestante());
		}
		else {
			System.out.println("Passou");
		}
		sc.close();
	}

}
