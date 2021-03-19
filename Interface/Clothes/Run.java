package Interface.Clothes;

import Interface.Clothes.Footwear.EccoFootwear;
import Interface.Clothes.Footwear.MarkoFootwear;
import Interface.Clothes.Footwear.ScetchersFootwear;
import Interface.Clothes.Jacket.ColumbiaJacket;
import Interface.Clothes.Jacket.FilaJacket;
import Interface.Clothes.Jacket.KappaJacket;
import Interface.Clothes.Trousers.CareerTrousers;
import Interface.Clothes.Trousers.FlipTrousers;
import Interface.Clothes.Trousers.PumaTrousers;


public class Run {

    public static void main(String[] args) {
        EccoFootwear ecco = new EccoFootwear();
        MarkoFootwear marko = new MarkoFootwear();
        ScetchersFootwear scetchers = new ScetchersFootwear();
        ColumbiaJacket columbia = new ColumbiaJacket();
        FilaJacket fila = new FilaJacket();
        KappaJacket kappa = new KappaJacket();
        FlipTrousers flip = new FlipTrousers();
        CareerTrousers career = new CareerTrousers();
        PumaTrousers puma = new PumaTrousers();
        Human h1 = new Human(ecco, columbia, flip);
        h1.takeOn();
        h1.takeOff();
        Human h2 = new Human(marko, fila, career);
        h2.takeOn();
        h2.takeOff();
        Human h3 = new Human(scetchers, kappa, puma);
        h3.takeOn();
        h3.takeOff();

    }
}
