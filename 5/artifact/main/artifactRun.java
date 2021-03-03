package artifact.main;

import artifact.main.classess.artifact;

public class artifactRun {
    public static void main(String[] args) {
         artifact first = new artifact(231234);
        first.setSerialN(-1);
        first.print();
         artifact second = new artifact(23123, " Ацтеки");
        second.print();
         artifact third = new artifact(2323, "Ацтеки", 21);
        third.print();

    }
}
