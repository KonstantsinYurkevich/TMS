package animal;
import animal.classess.animal;
import animal.classess.cat;

public class run {
    public static void main(String[] args) {
        animal elephant = new animal("Dodo", 100);
        elephant.print();
        cat Lilu = new cat("Lilu",1,"Yes","@liluTheBest");
        Lilu.print();
    }
}
