package artifact.main.classess;

public class artifact {
    private int serialN;
    private String culture;
    private int century;

    public artifact(int newSerialN) {
        serialN = newSerialN;
    }
    public artifact(int newSerialN, String newCulture) {
        serialN = newSerialN;
        culture = newCulture;
    }
    public artifact(int newSerialN, String newCulture, int newCentury) {
        serialN = newSerialN;
        culture = newCulture;
        century = newCentury;
    }
    public void print() {
        System.out.println("Порядковый номер, присвоенный музеем - " + serialN);
        System.out.println("Культура, которой был создан артифакт - " + culture);
        System.out.println("Век создания - " + century);
    }
    public void setCentury(int century) {
        if (century < 20) {
            this.century = century;
        }
    }
    public int getCentury() {
        return century;
    }
    public void setSerialN(int serialN) {
        if (serialN > 0) {
            this.serialN = serialN;
        }
    }
    public int getSerialN() {
        return serialN;
    }
    public void setCulture(String culture) {
        this.culture = culture;
    }
    public String getCulture() {
        return culture;
    }

}