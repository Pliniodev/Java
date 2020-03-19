/*
* Crie um array de tamanho 10 que receba numeros do teclado
* */
import java.util.Scanner;
import java.util.Arrays;

public class ex_array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];

        for( int i=0 ; i<num.length ; i++){
            System.out.println("Digite o numero da posição "+i);
            num[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(num));

        sc.close();
    }
}
