import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        int a = 4;
        int[] arr = new int[a];
        Random r = new Random();
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
            System.out.print(" " + arr[i] + " ");
        }
        boolean value = true;
        for (i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                value = false;
                break;
            }
        } System.out.println();
        if (value) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}

