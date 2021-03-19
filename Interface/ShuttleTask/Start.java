package Interface.ShuttleTask;

public class Start {
    public static void main(String[] args) {
        Shuttle SpaceX = new Shuttle();
        Cosmodrom Canaveral = new Cosmodrom();
        Canaveral.launch(SpaceX);



    }
}
