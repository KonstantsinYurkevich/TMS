package Interface.Clothes.Footwear;

public class EccoFootwear implements IFootwear {
    @Override
    public void takeOn() {
        System.out.println("Одеть куртку Ecco");
    }
    @Override
    public void takeOff() {
        System.out.println("Снять куртку Ecco");
    }
}
