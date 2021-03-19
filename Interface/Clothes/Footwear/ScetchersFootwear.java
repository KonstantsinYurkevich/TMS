package Interface.Clothes.Footwear;

public class ScetchersFootwear implements IFootwear {
    public ScetchersFootwear() {

    }
    @Override
    public void takeOn() {
        System.out.println("Одеть обувь Scetchers");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять обувь Scetchers");
    }
}
