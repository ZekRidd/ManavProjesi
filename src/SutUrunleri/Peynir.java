package SutUrunleri;

public class Peynir extends SutUrunleri{
    public Peynir (String urunAdi, int miktar, int fiyat) {

        this.urununAdi = urunAdi;
        this.miktar = miktar;
        this.fiyat = fiyat;
    }

    Peynir klasikPeynir = new Peynir("Klasik Peynir", 1,2);
    Peynir beyazPeynir = new Peynir("Beyaz Peynir", 1,3);
    Peynir ezinePeynir = new Peynir("Ezine Peynir", 1,1);
    Peynir kasarPeynir = new Peynir("Kasar Peynir", 1,4);

}
