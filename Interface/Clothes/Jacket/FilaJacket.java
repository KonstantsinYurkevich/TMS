package Interface.Clothes.Jacket;

public class FilaJacket implements IJacket{
    public FilaJacket() {

    }
    @Override
    public void takeOn() {
        System.out.println("Одеть куртку Fila");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять куртку Fila");
    }
}
