/* Exiba os valores
1 2 3 4 5 10 20 30 40 50
através de arrays unidimensionais e laços
* */
public class ex_array3 {
    public static void main(String[] args) {
        int[] num = new int[10];

        for (int i=0 ; i<num.length ; i++){

            if (i<=4){
                num[i] = i+1;
            }else{
                num[i] = num[(i-5)]*10;
            }
            System.out.print(num[i]+" ");
        }
    }
}
