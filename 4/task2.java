import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число :");
        int a = console.nextInt();
        System.out.println("Ведите второе число");
        int b = console.nextInt();
        Random r = new Random();
        int[][] arr = new int[a][b];
        int i;
        int j;
        int pOn1 = 1;
        int pOn2 = 1;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
                System.out.print(arr[i][j] + " ");
                if (i == j) {
                    pOn1 *= arr[i][j];
                }
            }
            System.out.println();
        }

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (i + j == a - 1) {
                    pOn2 *= arr[i][j];
                }
            }
        }
        if (pOn1 > pOn2) {
            System.out.println("Произведение главной дигонали больше произведения побочной - " + pOn1 + " > " + pOn2);
        } else if (pOn2 > pOn1) {
            System.out.println("Произведение побочной дигонали больше произведения главной - " + pOn2 + " > " + pOn1);
        } else {
            System.out.println("Произведение главной дигонали равно  произведения побочной - " + pOn1 + " = " + pOn2);
        }

    }
}