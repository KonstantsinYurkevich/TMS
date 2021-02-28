import java.util.Random;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество столбцов : ");
        int a = console.nextInt();
        System.out.println("Введите количество строк : ");
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
        } System.out.println();
        int[][] arrTrans = new int[b][a];
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                arrTrans[j][i] = arr[i][j];
            }
        }
        for (i = 0; i < b; i++) {
            for (j = 0; j < a; j++) {
                System.out.print(arrTrans[i][j] + " ");

            }
            System.out.println();
        }
    }
}
