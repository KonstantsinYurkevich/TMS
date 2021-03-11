package Inher.main.Transport;

public class Trucks extends Land {
    public int maxWeight;
    public double powerKV;
    public double calc = 0.74;
    public int cargo;

    public Trucks(int engPower, int maxSpeed, int weight, String mark, int countOfWheels, int fuelConsumption, int maxWeight) {
        super(engPower, maxSpeed, weight, mark, countOfWheels, fuelConsumption);
        this.maxWeight = maxWeight;
        powerKV = engPower * calc;
    }

    public void info() {
        System.out.println("\n Мощность двигателя - " + engPower + " Л/с " + "\n Мощность в киловаттах - " + powerKV + " кВ " +
                "\n Максимальная скорость -  " + maxSpeed +
                "Км/ч" + "\n Масса" + weight + " Кг " + "\n Марка - " + mark + "\n Количество колес - " + countOfWheels
                + "\n Расход топлива - " + fuelConsumption + " Л/100км " + "\n Грузоподъемность  - " + maxWeight + " Тонн ");
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
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

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public void putCargo(int cargo) {
        this.cargo = cargo;
        if (cargo > maxWeight) {
            System.out.println("Вам нужен грузовик побольше ");
        } else {
            System.out.println("Грузовик загружен ");
        }
    }

}
