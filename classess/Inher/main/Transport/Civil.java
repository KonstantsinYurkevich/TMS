package Inher.main.Transport;

public class Civil extends Air {
    public int passCount;
    public boolean businessClass;
    public double calc = 0.74;
    public double powerKV;
    public int newPass;

    public Civil(int engPower, int maxSpeed, int weight, String mark, int wingLength, int runwayStripLength,
                 int passCount, boolean businessClass) {
        super(engPower, maxSpeed, weight, mark, wingLength, runwayStripLength);
        this.passCount = passCount;
        this.businessClass = businessClass;
        powerKV = engPower * calc;
    }

    public void info() {
        System.out.println("\n Мощность двигателя - " + engPower + " Л/с " + "\n Мощность в киловаттах - " + powerKV +
                " кВ " + "\n Максимальная скорость -  " + maxSpeed +
                "Км/ч" + "\n Масса" + weight + " Кг " + "\n Марка - " + mark + "\n Размах крыльев - " + wingLength + " м "
                + "\n Минимальная длинна ВПП для взлета - " + runwayStripLength + " м " + "\n Количество пассажиров  - " + passCount +
                "\n Наличие бизнес класса - " + businessClass);
    }

    public int getPassCount() {
        return passCount;
    }

    public void setPassCount(int passCount) {
        this.passCount = passCount;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
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

    public int getNewPass() {
        return newPass;
    }

    public void setNewPass(int newPass) {
        this.newPass = newPass;
    }

    public void setPass (int newPass) {
        this.newPass=newPass;
        if (newPass > passCount){
            System.out.println("Вам нужен самолет побольше");
        } else {
            System.out.println("Самолет загружен");
        }
    }
}
