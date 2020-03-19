/*
* Solicite 8 numeros inteiros do usuário.
* Descubra e exiba em qual posição está o maior valor.
* */
import java.util.Scanner;
import java.util.Arrays;

public class ex_array6 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] num = new int[9];
            int max = num[0];
            int pos = 0;

            //Para receber os números
            for (int i=0 ; i<num.length ; i++){
               System.out.println("Digite um numero para a posição: "+i+"> ");
               num[i] = sc.nextInt();
            }

            //Para encontrar o maior valor dentro do array
            for (int i=0 ; i<num.length ; i++){
                if (num[i]>max){
                    max = num[i];
                    pos = i;
                }
            }

            System.out.println("Este é o array: "+Arrays.toString(num));
            System.out.println("Este é o maior valor: "+max);
            System.out.println("E está na posição "+pos+" do array");

            sc.close();
    }
}
