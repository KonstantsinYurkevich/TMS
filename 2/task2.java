public class task2 {
    public static void main (String [] args) {
        int count = 0;
        int a = 1;
        while ( a <= 256) {
            count = count + a;
            a=a*2;
        }
        System.out.println(count);
    }
}
