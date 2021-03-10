package animal.classess;

public class Dog extends  Animal{
    public int comm;

    public Dog(String name, int age, int comm) {
        super(name, age);
        this.comm = comm;
    }
    public void print () {
        System.out.print("woof" + "\nИмя собаки : " + name + "\nВозраст : " + age + "\nКоличество команд, которые знает собака : " + comm);
    }
}
