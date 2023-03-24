package superMarket;

public class SutUrunleri {
    String urunAdi;
    int miktarBirim;
    int fiyat;
    String yagOrani;


    public SutUrunleri(String urunAdi, int miktar, int fiyat, String yagOrani) {
        this.urunAdi = urunAdi;
        this.miktarBirim = miktar;
        this.fiyat = fiyat;
        this.yagOrani = yagOrani;
    }

    public SutUrunleri() {

    }

    public SutUrunleri(String urunAdi, int miktar, int fiyat) {
        this.urunAdi = urunAdi;
        this.miktarBirim = miktar;
        this.fiyat = fiyat;
    }


    @Override
    public String toString() {
        return "SutUrunleri{" +
                "urunAdi='" + urunAdi + '\'' +
                ", miktar=" + miktarBirim +
                ", fiyat= " + fiyat +
                ", yagOrani= " + yagOrani +
                '}';
    }
}