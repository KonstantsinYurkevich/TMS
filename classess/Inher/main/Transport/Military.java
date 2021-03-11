package Inher.main.Transport;

public class Military extends Air {
    public boolean ejectionSystem;
    public int rocketCount;
    public double calc = 0.74;
    public double powerKV;

    public Military(int engPower, int maxSpeed, int weight, String mark, int wingLength, int runwayStripLength,
                    boolean ejectionSystem, int rocketCount) {
        super(engPower, maxSpeed, weight, mark, wingLength, runwayStripLength);
        this.ejectionSystem = ejectionSystem;
        this.rocketCount = rocketCount;
        powerKV = engPower * calc;
    }

    public void info() {
        System.out.println("\n Мощность двигателя - " + engPower + " Л/с " + "\n Мощность в киловаттах - " + powerKV +
                " кВ " + "\n Максимальная скорость -  " + maxSpeed +
                "Км/ч" + "\n Масса" + weight + " Кг " + "\n Марка - " + mark + "\n Размах крыльев - " + wingLength + " м "
                + "\n Минимальная длинна ВПП для взлета - " + runwayStripLength + " м " + "\n Наличие система катапультирования   - "
                + ejectionSystem +
                "\n Количество рокет на борту - " + rocketCount);
    }
    public void fire () {
        if (rocketCount > 0){
            System.out.println("Ракета пошла....");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }
    public void ejection() {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно");

        }else {
            System.out.println("У вас нет такой системы");
        }
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getRocketCount() {
        return rocketCount;
    }

    public void setRocketCount(int rocketCount) {
        this.rocketCount = rocketCount;
    }

    public double getCalc() {
        return calc;
    }

    public void setCalc(double calc) {
        this.calc = calc;
    }

    public double getPowerKV() {
        return powerKV;
    }

    public void setPowerKV(double powerKV) {
        this.powerKV = powerKV;
    }
}
