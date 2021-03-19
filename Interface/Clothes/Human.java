package Interface.Clothes;


import Interface.Clothes.Footwear.IFootwear;
import Interface.Clothes.Jacket.IJacket;
import Interface.Clothes.Trousers.ITrousers;

public class Human implements IHuman{
    public IFootwear footwear;
    public IJacket jacket;
    public ITrousers trousers;
    public Human (IFootwear footwear,IJacket jacket,ITrousers trousers){
        this.footwear=footwear;
        this.jacket=jacket;
        this.trousers=trousers;
    }
    public Human() {}

    @Override
    public void takeOff() {
        footwear.takeOff();
        jacket.takeOff();
        trousers.takeOff();
    }
    @Override
    public void takeOn() {
        footwear.takeOn();
        jacket.takeOn();
        trousers.takeOn();

    }

}
