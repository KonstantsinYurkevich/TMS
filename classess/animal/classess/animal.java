package animal.classess;

public class animal {
    public String name;
    public int age;

    public animal(String newName, int newAge) {
        name = newName;
        age = newAge;
        if (age > 0) {
            this.age = newAge;
        } else {
            this.age = 0;
        }
    }

    public animal(String newName) {
        this.name = newName;
    }

    public animal(int newAge) {
        this.age = newAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public void print() {
        System.out.println("Имя животорного - " + name + "\nВозраст : " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}