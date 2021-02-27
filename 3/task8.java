import java.util.Random;

public class task8 {
    public static void main(String[] args) {
        int a = 10;
        int[] arr1 = new int[a];
        int[] arr2 = new int[a];
        double[] arr3 = new double[a];
        Random r = new Random();
        int i;
        int c = 0;
        for (i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(9);
            arr2[i] = r.nextInt(9);
            arr3[i] = (double) arr1[i] / arr2[i];
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
            if (arr3[i] % 1 == 0) {
                c++;
            }
        }
        System.out.println();
        System.out.println("Количествво целых элементов в третьем массиве -  " + c);

    }
}

