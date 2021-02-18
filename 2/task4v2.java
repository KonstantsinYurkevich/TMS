public class task4v2 {
    public static void main (String [] args) {
        double i ;
        double s = 2.54;
        for (i = 1; i <= 20; s = i * 2.54) {
            System.out.println("В " + i + " дюймах " + s + " сантиметров");
            i++;
        }
    }
}
