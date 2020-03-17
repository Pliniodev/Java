/* Exiba os valores
10 9 8 7 6 5 4 3 2 1
através de arrays unidimensionais e laços
* */
public class ex_array1 {
    public static void main(String[] args) {
        int[] num = new int[11];

        for(int i=0 ; i<11 ; i++){
            num[i] = 10-i;
            System.out.println("posição: " + (i) + " = " + num[i]);
        }
    }
}
