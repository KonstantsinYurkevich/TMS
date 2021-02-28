import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите лочисетво столбцов :");
        int a = console.nextInt();
        System.out.println("Введите количество строк :");
        int b = console.nextInt();
        Random r = new Random();
        int[][] arr = new int[a][b];
        int i;
        int j;
        int sumEven = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (i < j) {
                    if ( arr [i] [j] % 2 == 0 && arr [i] [j]  != 0 ) {
                        System.out.print(arr[i] [j] + " ");
                        sumEven += arr [i][j];
                    }

                }
            }
        }
        System.out.println("\nСумма четных элементов находящихся над глайной диагональю - " + sumEven);
    }
}
