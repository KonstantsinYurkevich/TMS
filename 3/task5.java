import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        int a = 5;
        int[] arr1 = new int[a];
        Random r = new Random();
        int i;
        for (i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(15);
            System.out.print(" " + arr1[i] + " ");
        }
        System.out.println();
        int v = 5;
        int[] arr2 = new int[v];
        Random c = new Random();
        int b;
        for (b = 0; b < arr2.length; b++) {
            arr2[b] = c.nextInt(15);
            System.out.print(" " + arr2[b] + " ");
        }
        System.out.println();
        int sum1 = 0;
        for (i = 0; i < arr1.length; i++) {
            sum1 = sum1 + arr1[i];
        }
        System.out.println("Сумма Массива А = " + sum1);
        double average1 = (double) sum1 / arr1.length;
        int sum2 = 0;
        for (b = 0; b < arr2.length; b++) {
            sum2 = sum2 + arr2[b];
        }
        System.out.println("Сумма Массива Б = " + sum2);
        double average2 = (double) sum2 / arr1.length;
        if (average1 > average2) {
            System.out.println("Срденнее арифметическое Массива А > Масиива Б: " + average1+ " > " + average2 );
        } else if (average2 > average1 ) {
            System.out.println("Срденнее арифметическое Массива Б > Масиива Б: " + average2  + " > " + average1);
        } else if (average2  == average1) {
            System.out.println("Срденнее арифметическое Массива Б = Масиива Б: " + average2 + " = " + average1);
        }
    }
}
