package Interface.Clothes.Trousers;

public class CareerTrousers implements ITrousers{
    public CareerTrousers(){

    }
    @Override
    public void takeOn() {
        System.out.println("Одеть штаны Career");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять штаны Career");
    }
}
