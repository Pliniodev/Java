/* Exiba os valores
0 1 4 9 16 25 36 49 64 81 100
através de arrays unidimensionais e laços
* */

public class ex_array2 {
    public static void main(String[] args) {
        int[] num = new int[11];

        for(int i=0 ; i<num.length ; i++){
            num[i] = i*i;
            System.out.print(num[i]+" ");
        }

    }
}
