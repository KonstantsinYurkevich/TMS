package Interface.Clothes.Jacket;

public class KappaJacket implements IJacket {
    public KappaJacket() {

    }
    @Override
    public void takeOn() {
        System.out.println("Одеть куртку Kappa");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять куртку Kappa");
    }
}
