public class task1 {
    public static void main(String[] arg) {
        int sum = 0;
        int a = 1;
         while ( a < 100) {
             if (a % 2 == 1) {
                 sum = sum + a;
             }
             a++;
         }System.out.println(sum);

    }
}
