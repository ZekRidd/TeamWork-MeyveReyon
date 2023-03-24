package superMarket;

public class Peynir extends SutUrunleri{

    public Peynir(String urunAdi, int miktarBirim, int fiyat, String yagOrani) {

        super(urunAdi, miktarBirim, fiyat, yagOrani);

    }
    public Peynir(){
        super();
    }

    @Override
    public String toString() {
        return "Sut Urunleri-Peynir{" +
                "urunAdi='" + urunAdi + '\'' +
                ", miktar=" + miktarBirim +
                ", fiyat=" + fiyat +
                ", yagOrani='" + yagOrani + '\'' +
                '}';
    }

    public String peynirCesitleri(){

        Peynir ezinePeyniri = new Peynir("Ezine peyniri",1, 175, "Tam yagli");
        Peynir beyazPeynir = new Peynir("Beyaz peynir",1, 130, "Orta yagli");
        Peynir karsKasari = new Peynir("Kars kasari",1, 535, "Tam yagli");
        Peynir tulumPeyniri = new Peynir("Tulum Peyniri",1, 555, "Tam yagli");

        System.out.println(ezinePeyniri);
        System.out.println(beyazPeynir);
        System.out.println(karsKasari);
        System.out.println(tulumPeyniri);

        return null;

    }
}