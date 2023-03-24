package superMarket;

public class Tereyagi extends SutUrunleri{

    public Tereyagi(String urunAdi, int miktar, int fiyat) {

        super(urunAdi, miktar, fiyat);
    }
    public Tereyagi (){
        super();
    }

    @Override
    public String toString() {
        return "Sut Urunleri-Tereyagi{" +
                "urunAdi='" + urunAdi + '\'' +
                ", miktarBirim=" + miktarBirim +
                ", fiyat=" + fiyat +
                '}';
    }
    public String tereyagiCesitleri(){

        Tereyagi koyTereyagiTuzlu = new Tereyagi("Tuzlu Koy Tereyagi",1, 250);
        Tereyagi koyTereyagiTuzsuz = new Tereyagi("Tuzsuz Koy Tereyagi",1, 250);
        Tereyagi pastorizeTereyagi = new Tereyagi("Pastorize Tereyagi",1, 220);

        System.out.println(koyTereyagiTuzlu);
        System.out.println(koyTereyagiTuzsuz);
        System.out.println(pastorizeTereyagi);

        return null;

    }
}