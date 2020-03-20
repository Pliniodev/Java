/*
* Colete 5 numeros do usuário
* Insira em uma array
* Copie para outra array invertendo as posições
* */
import java.util.Scanner;
import java.util.Arrays;

public class ex_array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas posições terá o vetor?");
        int quantVet = sc.nextInt();

        int[] vet1 = new int[quantVet];
        int[] vet2 = new int[quantVet];

        int a = quantVet-1;
        for (int i=0 ; i<vet1.length ; i++){
            System.out.println("Digite um numero inteiro para a posição: "+i);
            vet1[i] = sc.nextInt();
        }

        for(int i=0 ; i<vet2.length ; i++){
            vet2[a] = vet1[i];
            a -= 1;
        }
        System.out.println(Arrays.toString(vet1));
        System.out.println(Arrays.toString(vet2));

        sc.close();
    }
}
