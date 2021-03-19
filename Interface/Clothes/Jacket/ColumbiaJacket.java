package Interface.Clothes.Jacket;

public class ColumbiaJacket implements IJacket {
    public ColumbiaJacket () {

    }
    @Override
    public void takeOn() {
        System.out.println("Одеть куртку Columbia");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять куртку Columbia");
    }
}
