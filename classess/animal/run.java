package animal;
import animal.classess.animal;
import animal.classess.cat;

public class run {
    public static void main(String[] args) {
        animal elephant = new animal("Dodo", 100);
        elephant.print();
        System.out.println("_________________");
        animal Lilu = new cat("Lilu",1,"Да","@liluTheBest");
        animal Barsik = new cat("basik",7,"нет","@barsikotik");
        Lilu.print();
        Barsik.print();
    }
}
