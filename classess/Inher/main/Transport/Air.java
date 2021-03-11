package Inher.main.Transport;

public abstract class Air extends Transport {
    public int wingLength;
    public int runwayStripLength;

    public Air(int engPower, int maxSpeed, int weight, String mark, int wingLength, int runwayStripLength) {
        super(engPower, maxSpeed, weight, mark);
        this.wingLength = wingLength;
        this.runwayStripLength = runwayStripLength;
    }
}
