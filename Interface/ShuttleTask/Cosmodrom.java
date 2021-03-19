package Interface.ShuttleTask;

public class Cosmodrom {

    public void launch(IStart Shuttle){
        Shuttle.preLaunchTest();
        if (Shuttle.preLaunchTest()){
            System.out.println("Предстартовая проверка прошла успешно.");
            Shuttle.engineStart();
            for (int i = 10; i >= 0;i--){
                System.out.println(i);
            }
            Shuttle.start();
        }else {
            System.out.println("Предстартовая проверка провалена");
        }


    }
}