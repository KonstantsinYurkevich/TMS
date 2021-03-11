package Inher.main.Transport;

public abstract class Transport {
    public int engPower;
    public int maxSpeed;
    public int weight;
    public String mark;

    public Transport(int engPower, int maxSpeed, int weight, String mark) {
        this.engPower = engPower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.mark = mark;
    }
}
