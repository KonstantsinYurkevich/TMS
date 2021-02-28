import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите первое число :");
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        int a = console.nextInt();
        System.out.println("Введите второе число :");
        int b = console.nextInt();
        int[][] arr = new int[a][b];
        int i;
        int j;
        int even;
        int total = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Числа главной диагонали - ");
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    even = arr[i][j];
                    System.out.print(even + " ");
                    if (even % 2 == 0 && arr [i] [j]  != 0) {
                        total += even;

                    }
                }

            }
        }
        System.out.println();
        System.out.println("Сумма четных чисел главной диагонали = " + total);
    }
}
