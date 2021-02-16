import java.util.Scanner;

import static java.lang.Math.max;

public class Tasks {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = console.nextInt();
        if (a > 0) {
            a++;
            System.out.println("1. = " + a);
        } else if (a < 0) {
            a = a + 2;
            System.out.println("1. = " + a);
        } else {
            a = 10;
            System.out.println("1. = " + a);
        }


        System.out.println("Введите первое число:");
        double b = console.nextDouble();
        System.out.println("Введите второе число:");
        double c = console.nextDouble();
        double highest;
        highest = max(b, c);
        System.out.println("2. Большее из двух чисел - " + highest);


        System.out.println("Введите первое число:");
        int d = console.nextInt();
        System.out.println("Введите второе число:");
        int e = console.nextInt();
        System.out.println("Введите третье число:");
        int f = console.nextInt();
        if (d > 0 && e > 0 && f > 0) {
            System.out.println("3. Положительных чисел в исходном наборе - 3");
        } else if (d > 0 && e > 0 || d > 0 && f > 0 || e > 0 && f > 0) {
            System.out.println("3. Положительных чисел в исходном наборе - 2");
        } else if (d > 0 || e > 0 || f > 0) {
            System.out.println("3. Положительных чисел в наборе - 1");
        } else System.out.println("3. Количество положительных чисел в наборе - 0");


        System.out.println("Введите первое число:");
        int j = console.nextInt();
        System.out.println("Введите второе число:");
        int h = console.nextInt();
        System.out.println("Введите третье число:");
        int i = console.nextInt();
        int positive = 0;
        int negative = 0;
        if (j > 0) { positive++; }
        if (h > 0) { positive++; }
        if (i > 0) { positive++; }
        if (j < 0) { negative++; }
        if (h < 0) { negative++; }
        if (i < 0) { negative++; }
        System.out.println("4. Количество положительных чисел в исходном наборе - " + positive);
        System.out.println("4. Количество отрицательных чисел в исходном наборе - " + negative);



        System.out.println("Введите число:");
        int k = console.nextInt();
        if (k > 0 && k < 10) { System.out.println("5. Это однозначное положительное число "); }
        if (k > 9 && k < 100) { System.out.println("5. Это двузначное положительное число "); }
        if (k > 99 && k < 1000) { System.out.println("5. Это трехзначное положительное число "); }
        if (k > 999 && k < 10000) { System.out.println("5. Это четырехзначное положительное число "); }
        if (k > 9999 && k < 100000) { System.out.println("5. Это пятизначное положительное число "); }
        if (k > 99999 && k < 1000000) { System.out.println("5. Это шестизначное положительное число "); }
        if (k > 999999 && k < 10000000) { System.out.println("5. Это семизначное положительное число "); }
        if (k > 9999999 && k < 100000000) { System.out.println("5. Это восьмизначное положительное число "); }
        if (k > 99999999 && k < 1000000000) { System.out.println("5. Это девятизначное положительное число "); }
        if (k > 999999999 && k < 2147483647) { System.out.println("5. Это десятизначное положительное число "); }
        if (k < 0 && k > -10) { System.out.println("5. Это однозначное отрицательное число "); }
        if (k < -9 && k > -100) { System.out.println("5. Это двузначное отрицательное число "); }
        if (k < -99 && k > -1000) { System.out.println("5. Это трехзначное отрицательное число "); }
        if (k < -999 && k > -10000) { System.out.println("5. Это четырехзначное отрицательное число "); }
        if (k < -9999 && k > -100000) { System.out.println("5. Это пятизначное отрицательное число "); }
        if (k < -99999 && k > -1000000) { System.out.println("5. Это шестизначное отрицательное число "); }
        if (k < -999999 && k > -10000000) { System.out.println("5. Это семизначное отрицательное число "); }
        if (k < -9999999 && k > -100000000) { System.out.println("5. Это восьмизначное отрицательное число "); }
        if (k < -99999999 && k > -1000000000) { System.out.println("5. Это девятизначное отрицательное число "); }
        if (k < -999999999 && k > -2147483648) { System.out.println("5. Это десятизначное отрицательное число "); }
        console.close();
    }
}
