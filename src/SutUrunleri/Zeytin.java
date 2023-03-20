package SutUrunleri;

public class Zeytin extends SutUrunleri{
    public Zeytin (String urunAdi, int miktar, int fiyat) {

        this.urununAdi = urunAdi;
        this.miktar = miktar;
        this.fiyat = fiyat;
    }

    Zeytin marmaraZeytin = new Zeytin("Marmara Zeytin",1,3);
    Zeytin siyahZeytin = new Zeytin("Siyah Zeytin",1,2);
    Zeytin yesilZeytin = new Zeytin("Yesil Zeytin",1,4);
    Zeytin mortanemZeytin = new Zeytin("Mortanem Zeytin",1,1);
}
