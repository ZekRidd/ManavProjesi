package SutUrunleri;

public class Tereyagi extends SutUrunleri {

    public Tereyagi (String urunAdi, int miktar, int fiyat) {

        this.urununAdi = urunAdi;
        this.miktar = miktar;
        this.fiyat = fiyat;
    }

    Tereyagi koyTereyagi = new Tereyagi("Köy Tereyağı",1,3);
    Tereyagi pastorizeTereyagi = new Tereyagi("Pastorize Tereyağı",1,2);
    Tereyagi tuzsuzTereyagi = new Tereyagi("Tuzsuz Tereyağı",1,1);
    Tereyagi keciTereyagi = new Tereyagi("Keci Tereyağı",1,4);
}
