import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        System.out.println("Введите число больше 3");
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int count = 0;
        if (n > 3) {
            Random r = new Random();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = r.nextInt(n);
                System.out.print(arr[i] + " ");
                if (arr[i] % 2 == 0 && arr[i] != 0) {
                    count++;
                }
            } System.out.println();
            System.out.println("Количество четных чисел - " + count);
            if (count != 0) {
                int[] arr2 = new int[count];
                count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0 && arr[i] !=0 ) {
                        arr2[count] = arr[i];
                        System.out.print(arr2[count] + " ");
                        count++;
                    }
                }
            }
        } else{
            System.out.println("Ошибка! Введите число больше 3"); }
    }
}
