public class task3 {
    public static void main (String [] args) {
        double total = 0;
        int day;
        double dist = 10;
        for (day = 1; day < 8; dist = dist * 1.1 ) {
            day ++;
            total = total + dist;
        }
        System.out.println(total);
    }
}
