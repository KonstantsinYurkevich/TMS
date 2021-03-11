package Inher.main.Transport;

public class Cars extends Land {
    public String bodyType;
    public int passCount;
    public double powerKV;
    public double calc = 0.74;
    public double time;
    public double dist;
    private double fuelTotal;


    public Cars(int engPower, int maxSpeed, int weight, String mark, int countOfWheels, int fuelConsumption,
                String bodyType, int passCount) {
        super(engPower, maxSpeed, weight, mark, countOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.passCount = passCount;
        powerKV = engPower * calc;
    }

    private double Cars() {
        this.fuelTotal = (dist * super.fuelConsumption) / 100;
        return fuelTotal;
    }

    public void calc(double time) {
        this.time = time;
        this.dist = super.maxSpeed * time;
        System.out.println("\nЗа время " + time + " ч, " + " автомобиль " + super.mark + " двигаясь с максимальной скоростью " +
                super.maxSpeed + " км/ч " + " проедет " + dist + " км " + " и израсходует " + Cars() + " литров топлива ");


    }

    public void info() {
        System.out.println("\n Мощность двигателя - " + engPower + " Л/с " + "\n Мощность в киловаттах - " + powerKV +
                " кВ " + "\n Максимальная скорость -  " + maxSpeed +
                " Км/ч" + "\n Масса - " + weight + " Кг " + "\n Марка - " + mark + "\n Количество колес - " + countOfWheels
                + "\n Расход топлива - " + fuelConsumption + " Л/100км " + "\n Тип кузова - " + bodyType + "\n Количество пассажиров - " +
                passCount);
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPassCount() {
        return passCount;
    }

    public void setPassCount(int passCount) {
        this.passCount = passCount;
    }

    public double getPowerKV() {
        return powerKV;
    }

    public void setPowerKV(double powerKV) {
        this.powerKV = powerKV;
    }

    public double getCalc() {
        return calc;
    }

    public void setCalc(double calc) {
        this.calc = calc;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getDist() {
        return dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }
}
