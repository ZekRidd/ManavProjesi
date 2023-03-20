package SutUrunleri;

public class Yogurt extends SutUrunleri {

    public Yogurt(String urunAdi, int miktar, int fiyat) {

        this.urununAdi = urunAdi;
        this.miktar = miktar;
        this.fiyat = fiyat;
    }

    Yogurt koyYogurdu = new Yogurt("Koy Yogurdu", 1,1);
    Yogurt comlekYogurt = new Yogurt("Çömlek Yogurt", 1,1);
    Yogurt kaymakliYogurt = new Yogurt("Kaymaklı Yogurt", 1,2);
    Yogurt tamYagli = new Yogurt("Tam Yağli Yoğurt", 1,3);
    Yogurt dogalYogurt = new Yogurt("Doğal Yoğurt", 1,3);

}
