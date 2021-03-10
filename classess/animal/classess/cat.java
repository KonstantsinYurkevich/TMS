package animal.classess;

public class cat extends animal {
    public String catchingMouse;
    public String instPage;

    public cat(String newName, int newAge, String newCatchingMouse, String newInstPage) {
        super(newName, newAge);
        if (age > 0) {
            this.age = newAge;
        } else {
            this.age = 0;
        }
        catchingMouse = newCatchingMouse;
        instPage = newInstPage;
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

