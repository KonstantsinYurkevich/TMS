package Interface.Clothes.Footwear;

public class MarkoFootwear implements IFootwear{
    public MarkoFootwear() {

    }
    @Override
    public void takeOn(){
        System.out.println("Одеть обувь Marko");
    }
    @Override
    public void takeOff(){
        System.out.println("Снять обувь Marko");
    }
}
