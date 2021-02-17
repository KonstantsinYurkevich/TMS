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
        double highest = max(b, c);
        System.out.println("2. Большее между чисел :  " + b + " и " + c + " - " + highest);


        System.out.println("Введите первое число:");
        int d = console.nextInt();
        System.out.println("Введите второе число:");
        int e = console.nextInt();
        System.out.println("Введите третье число:");
        int f = console.nextInt();
          if (d > 0 && e > 0 && f > 0) {
            System.out.println("3. Положительных чисел в наборе из ( " + d + " ; " + e + " ; " + f + " ) - 3");
          } else if (d > 0 && e > 0 || d > 0 && f > 0 || e > 0 && f > 0) {
            System.out.println("3. Положительных чисел в наборе из  ( " + d + " ; " + e + " ; " + f + " ) - 2");
          } else if (d > 0 || e > 0 || f > 0) {
            System.out.println("3. Положительных чисел в наборе из  ( " + d + " ; " + e + " ; " + f + " ) - 1");
          } else System.out.println("3. Положительных чисел в наборе из  ( " + d + " ; " + e + " ; " + f + " ) - 0");


        System.out.println("Введите первое число:");
        int j = console.nextInt();
        System.out.println("Введите второе число:");
        int h = console.nextInt();
        System.out.println("Введите третье число:");
        int i = console.nextInt();
        if (j > 0 && h > 0 && i > 0) {
            System.out.println("3. Положительных чисел в исходном наборе - 3");
        } else if (j > 0 && h > 0 || j > 0 && i > 0 || h > 0 && i > 0) {
            System.out.println("3. Положительных чисел в исходном наборе - 2");
        } else if (j > 0 || h > 0 || i > 0) {
            System.out.println("3. Положительных чисел в наборе - 1");
        } else System.out.println("3. Положительных чисел в наборе - 0");
        if (j < 0 && h < 0 && i < 0) {
            System.out.println("3. Отрицательных чисел в исходном наборе - 3");
        } else if (j < 0 && h < 0 || j < 0 && i < 0 || h < 0 && i < 0) {
            System.out.println("3. Отрицательных чисел в исходном наборе - 2");
        } else if (j < 0 || h < 0 || i < 0) {
            System.out.println("3. Отрицательных чисел в наборе - 1");
        } else System.out.println("3. Отрицательных чисел в наборе - 0");





        System.out.println("Введите число:");
        int k = console.nextInt();
           if (k > 0 && k < 10) {
            System.out.println("5." + k + "  - однозначное положительное число ");
           }
           if (k > 9 && k < 100) {
            System.out.println("5." + k + "  - двузначное положительное число ");
        }
           if (k > 99 && k < 1000) {
            System.out.println("5. " + k + "  - трехзначное положительное число ");
        }
           if (k > 999 && k < 10000) {
            System.out.println("5. " + k + "  - четырехзначное положительное число ");
        }
           if (k > 9999 && k < 100000) {
            System.out.println("5. " + k + "  - пятизначное положительное число ");
        }
           if (k > 99999 && k < 1000000) {
            System.out.println("5. " + k + "  - шестизначное положительное число ");
        }
           if (k > 999999 && k < 10000000) {
            System.out.println("5. " + k + "  - семизначное положительное число ");
        }
           if (k > 9999999 && k < 100000000) {
            System.out.println("5. " + k + "  - восьмизначное положительное число ");
        }
           if (k > 99999999 && k < 1000000000) {
            System.out.println("5. " + k + "  - девятизначное положительное число ");
        }
           if (k > 999999999 && k < 2147483647) {
            System.out.println("5. " + k + "  - десятизначное положительное число ");
        }
           if (k < 0 && k > -10) {
            System.out.println("5. " + k + "  - однозначное отрицательное число ");
        }
           if (k < -9 && k > -100) {
            System.out.println("5. " + k + "  - двузначное отрицательное число ");
        }
           if (k < -99 && k > -1000) {
            System.out.println("5. " + k + "  - трехзначное отрицательное число ");
        }
           if (k < -999 && k > -10000) {
            System.out.println("5. " + k + "  - четырехзначное отрицательное число ");
        }
           if (k < -9999 && k > -100000) {
            System.out.println("5. " + k + "  - пятизначное отрицательное число ");
        }
           if (k < -99999 && k > -1000000) {
            System.out.println("5. " + k + "  - шестизначное отрицательное число ");
        }
           if (k < -999999 && k > -10000000) {
            System.out.println("5. " + k + "  - семизначное отрицательное число ");
        }
           if (k < -9999999 && k > -100000000) {
            System.out.println("5. " + k + "  - восьмизначное отрицательное число ");
        }
           if (k < -99999999 && k > -1000000000) {
            System.out.println("5. " + k + "  - девятизначное отрицательное число ");
        }
           if (k < -999999999 && k > -2147483648) {
            System.out.println("5. " + k + "  - десятизначное отрицательное число ");
           }

            System.out.println("Введите число:");
            int l = console.nextInt();
                String posit = "положительным";
                String negate = "отрицательным";
                int count = 0;
                int n;
                if (l > 0) {
                    String fromIntToStr = Integer.toString(l);
                    for (n = 0; n < fromIntToStr.length(); n++) {
                        count++;
                    }
                    System.out.println("5. Число " + l  + " является   " + posit + ", в котором содержится цифр : " + count);
                } else if (l < 0) {
                    int z = -l;
                    String fromIntToStr = Integer.toString(z);
                    for (n = 0; n < fromIntToStr.length(); n++) {
                        count++;
                    }
                    System.out.println("5. Число " + l + " является " + negate + ", в котором содержится цифр : " + count);
                }
                console.close();
            }
        }



