/*
* Leia 20 Números,
* Armazene em 1 array,
* Calcule a média aritmética,
* Exiba os valores do array, e os valores que são menores que a média calculada.
* */

import java.util.Scanner;
import java.util.Arrays;

public class ex_array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[20];
        int media = 0;

        //Lendo 20 numeros
        for (int i=0 ; i<num.length ; i++){
            System.out.println("Digite o numero da posição: "+i);
            num[i] = sc.nextInt();
            media += num[i];
        }

        media = media/20;//Cálculo da média
        System.out.println("Estes foram os números digitados: \n"+Arrays.toString(num));//Exibindo Array
        System.out.println("\nEsta é a Média: "+media);

        System.out.println("\nOs numeros menores que a média foram: ");
        //Exibindo valores menores que a média
        for ( int aux: num) {
            if (aux<media){
                System.out.print(aux+", \n");
            }
        }
    }
}
