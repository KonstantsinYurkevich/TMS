package animal.classess;

 public abstract class Animal {
    public String name;
    public int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public Animal(String name) {
        this.name=name;
    }
    public Animal(int newAge) {
        this.age=newAge;
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