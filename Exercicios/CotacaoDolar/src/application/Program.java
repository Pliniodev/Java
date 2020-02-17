package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a cota��o do d�lar ");
		double dolar = sc.nextDouble();
		
		System.out.println("Digite quantos dolares voc� quer comprar: ");
		double compra = sc.nextDouble();
		
		double cot = CurrencyConverter.cotacao(dolar, compra);
		
		System.out.printf("Voc� precisa pagar em reais R$ %.2f", cot);
		
		sc.close();
	}

}
