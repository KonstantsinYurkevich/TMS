package Inher.main.Transport;

public abstract class Land extends Transport {
    public int countOfWheels;
    public int fuelConsumption;

    public Land(int engPower, int maxSpeed, int weight, String mark, int countOfWheels, int fuelConsumption) {
        super(engPower, maxSpeed, weight, mark);
        this.countOfWheels = countOfWheels;
        this.fuelConsumption = fuelConsumption;
    }
}
