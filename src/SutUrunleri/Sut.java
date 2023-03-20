package SutUrunleri;

public class Sut extends SutUrunleri {

    public Sut (String urunAdi, int miktar, int fiyat) {

        this.urununAdi = urunAdi;
        this.miktar = miktar;
        this.fiyat = fiyat;
    }

    Sut gunlukSut = new Sut("Günlük Süt", 1, 2);
    Sut pastorizeSut = new Sut("Pastorize Süt", 1, 3);
    Sut tamYagliSut = new Sut("Tam Yağlı Süt", 1, 1);
    Sut yarimYagliSut = new Sut("Yarim Yağlı Süt", 1, 4);
    Sut keciSutu = new Sut("Keci Sütü", 1, 5);
}
