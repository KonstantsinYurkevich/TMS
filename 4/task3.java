import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество столбцов");
        int a = console.nextInt();
        System.out.println("Введите количество строк");
        int b = console.nextInt();
        Random r = new Random();
        int[][] arr = new int[a][b];
        int i;
        int j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Нечетные элементы под главной диагональю включительно - ");
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (i >= j) {
                    if (arr[i][j] % 2 == 1 && arr [i] [j]  != 0) {
                        System.out.print(arr[i][j] + " ");

                    }
                }
            }
        }

    }
}
