package animal.classess;

public class Cat extends Animal {
    public String catchingMouse;
    public String instPage;

    public Cat(String name, int age, String catchingMouse, String instPage) {
        super(name, age);
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
        this.catchingMouse = catchingMouse;
        this.instPage = instPage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCatchingMouse() {
        return catchingMouse;
    }

    public String getInstPage() {
        return instPage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCatchingMouse(String catchingMouse) {
        this.catchingMouse = catchingMouse;
    }

    public void setInstPage(String instPage) {
        this.instPage = instPage;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public void print() {
        System.out.print("Moew" + "\nИмя кота : " + name + "\nВозраст : " + age + "\nЛовит ли мышей : " + catchingMouse
                + "\nСтраница в Inastagram : " + instPage);
    }
}

