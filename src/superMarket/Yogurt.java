package superMarket;

public class Yogurt extends SutUrunleri{
    public Yogurt(String urunAdi, int miktarBirim, int fiyat, String yagOrani) {

        super(urunAdi, miktarBirim, fiyat, yagOrani);
    }

    public Yogurt() {
        super();
    }

    @Override
    public String toString() {
        return "Sut Urunleri-Yogurt{" +
                "urunAdi='" + urunAdi + '\'' +
                ", miktar=" + miktarBirim +
                ", fiyat=" + fiyat +
                ", yagOrani='" + yagOrani + '\'' +
                '}';
    }

    public String yogurtCesitleri(){
        Yogurt yogurtComlek = new Yogurt("ComlekYogurdu ", 1,95, "Tam yagli");
        Yogurt yogurtKlasik = new Yogurt("YogurtKlasik ", 1,75, "Orta yagli");
        Yogurt yogurtLight = new Yogurt("YogurLight", 1,65, " yagsiz");
        Yogurt meyveliYogurt = new Yogurt("MeyveliYogurt", 1,65, " yagsiz");


        System.out.println(yogurtComlek);
        System.out.println(yogurtKlasik);
        System.out.println(yogurtLight);
        System.out.println(meyveliYogurt);

        return  null;

    }
}