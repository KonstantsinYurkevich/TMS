import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        int a = 20;
        int[] arr = new int[a];
        Random r = new Random();
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20);
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println();
        for (i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                arr[i] = 0;
                ;
            }
            System.out.print(" " + arr[i] + " ");
        }

    }
}
