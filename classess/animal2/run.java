package animal;
import animal.classess.Animal;
import animal.classess.Cat;
import animal.classess.Dog;

public class run {
    public static void main(String[] args) {
        System.out.println("_________________");
        Animal Lilu = new Cat("Lilu",1,"Да","@liluTheBest");
        Animal Barsik = new Cat("basik",7,"нет","@barsikotik");
        Lilu.print();
        System.out.println();
        System.out.println("_________________");
        Barsik.print();
        System.out.println();
        System.out.println("___________________");
        Animal sharik = new Dog("Sharik",5,3);
        sharik.print();

    }
}
