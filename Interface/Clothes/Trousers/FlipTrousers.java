package Interface.Clothes.Trousers;

public class FlipTrousers implements ITrousers{
    public FlipTrousers(){

    }
    @Override
    public void takeOn() {
        System.out.println("Одеть штаны Flip");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять штаны Flip");
    }
}
