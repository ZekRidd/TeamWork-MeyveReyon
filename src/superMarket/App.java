package superMarket;

public class App {

    public static void main(String[] args) {

        String yogurtCesitleri = new Yogurt().yogurtCesitleri();
        System.out.println("========================");
        String peynirCesitleri = new Peynir().peynirCesitleri();
        System.out.println("========================");
        String sutCesitleri = new Sut().sutCesitleri();
        System.out.println("========================");
        String tereyagiCesitleri = new Tereyagi().tereyagiCesitleri();
    }
}