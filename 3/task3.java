import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        int a = 15;
        int[] arr = new int[a];
        Random r = new Random();
        int i;
        int pos = 0;
        for (i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(99);
            System.out.print(" " + arr[i] + " ");
            if (arr[i] % 2 == 0) {
                pos++;
            }
        }System.out.println();
        System.out.println("Количество четных чисел : " + pos);

    }
}
