package Interface.Clothes.Trousers;

public class PumaTrousers implements ITrousers{
    public PumaTrousers() {

    }
    @Override
    public void takeOn() {
        System.out.println("Одеть штаны Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять штаны Puma");
    }
}
