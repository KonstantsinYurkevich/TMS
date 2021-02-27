public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        int i;
        int c = 1;
        for (i = 0; i < arr.length; i++) {
            arr [i] = c;
            c = c + 2;
            System.out.print(" " + arr[i] + " ");
        }System.out.println(" ");
        for ( i = arr.length -1; i >= 0; i--){
            System.out.print(" " + arr[i] + " ");

        }
    }
}
