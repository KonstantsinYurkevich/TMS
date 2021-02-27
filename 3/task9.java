import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        System.out.println("Веедие число");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        Random r = new Random();
        if (a > 0 && a % 2 == 0) {
            int [] arr = new int[a];
            int i;
            for (i = 0; i < arr.length; i++) {
                arr[i] = r.nextInt(15);
                System.out.print(arr[i] + " ");

            }

            int sum1 = 0;
            for ( i = 0; i < arr.length/2; i++) {
                sum1 += arr[i];
            }
            System.out.println();
            System.out.println("Сумма первой части массива - " + sum1);
            int b = arr.length/2;
            int sum2 = 0;
            for ( i = b; i < arr.length; i++) {
                sum2 += arr[i];
            }
            System.out.println("Сумма второй части массива - " + sum2);



        } else {
            System.out.println("Ошибка! Перезапустите программу и введите корректное число");
        }
    }
}