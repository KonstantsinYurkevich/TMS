package Interface.ShuttleTask;

import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean preLaunchTest() {
        boolean test;
        int a = 3;
        Random b = new Random();
        int c = b.nextInt(10);
        test = c > a;
        return test;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла запущены.\nВсе системы в норме.");

    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }


}
