import java.util.Random;

public class task7 {
    public static void main(String[] args) {
        int a = 12;
        int[] arr = new int[a];
        Random r = new Random();
        int i;
        int max = 0;
        for (i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(15);
            System.out.print(" " + arr[i] + " ");
        }
        int b = 0;
        for (i = 0; i < arr.length; i++ ){
            if (arr[i] >= max) {
                max = arr[i];
                b = i;
            }
        }System.out.println();
        System.out.println( "Максимальное число - " + max + " с индексом - "  + b);
    }
}
