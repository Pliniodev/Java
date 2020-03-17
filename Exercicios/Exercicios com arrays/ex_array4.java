/* Exiba os valores
3 4 7 12 19 28 39 52 67 84
através de arrays unidimensionais e laços
* */
import java.util.Arrays;
public class ex_array4 {
    public static void main(String[] args) {
        int[] num = new int[10];

        for (int i=0 ; i<num.length ; i++){
            num[i] = 3+(i*i);
        }
        System.out.println(Arrays.toString(num));
    }
}
