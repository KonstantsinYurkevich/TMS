
public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i;
        int c = 2;
        int d = 2;
        for (i = 0; i < arr.length; i++) {
            arr [i] = c;
            c = c + 2;
            System.out.print(" " + arr[i] + " ");
        } System.out.println(" ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = d;
            d = d + 2;
            System.out.println(" " + arr[i] + " ");
        }
    }
}