package Inher.main;

import Inher.main.Transport.Cars;
import Inher.main.Transport.Civil;
import Inher.main.Transport.Military;
import Inher.main.Transport.Trucks;

public class run {
    public static void main(String[] args) {
        Cars bmw = new Cars(170, 211, 1000, "BMW", 4, 18, "Sedan", 4);
        bmw.info();
        bmw.calc(3.7);
        Trucks scania = new Trucks(870,170,2,"Scania",8,25,25);
        scania.putCargo(13);
        Civil a380 = new Civil(1200,920,20,"Aerobus",24,870,120,true);
        a380.setPass(100);
        Military ty154 = new Military(123,930,220,"TU-154",25,900,false,20);
        ty154.fire();
        ty154.ejection();
    }
}
