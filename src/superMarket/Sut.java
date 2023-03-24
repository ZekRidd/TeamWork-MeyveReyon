package superMarket;

public class Sut extends SutUrunleri{

    public Sut(String urunAdi, int miktar, int fiyat, String yagOrani) {

        super(urunAdi, miktar, fiyat, yagOrani);

    }
    public Sut (){
        super();
    }

    @Override
    public String toString() {
        return "Sut Urunleri-Sut{" +
                "urunAdi='" + urunAdi + '\'' +
                ", miktarBirim=" + miktarBirim +
                ", fiyat=" + fiyat +
                ", yagOrani='" + yagOrani + '\'' +
                '}';
    }

    public String sutCesitleri(){
        Sut gunlukSut = new Sut("Gunluk sut",1, 25, "Tam yagli");
        Sut pastorizeTamYagliSut = new Sut("Pastorize tam yagli sut",1, 12, "Tam yagli");
        Sut pastorizeYarimYagliSut = new Sut("Pastorize yarim yagli sut",1, 12, "Orta yagli");
        Sut pastorizeLightSut = new Sut("Pastorize light sut",1, 12, "Yagsiz");
        Sut koyunSutu = new Sut("Koyun sutu",1, 35, "Tam yagli");
        Sut keciSutu = new Sut("Keci sutu",1, 30, "Tam yagli");

        System.out.println(gunlukSut);
        System.out.println(pastorizeTamYagliSut);
        System.out.println(pastorizeYarimYagliSut);
        System.out.println(pastorizeLightSut);
        System.out.println(koyunSutu);
        System.out.println(keciSutu);

        return null;
    }


}