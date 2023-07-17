class Ürün {
    int id;
    String ad;
    double fiyat;
}

class Telefon extends Ürün {
    int depolama;
    int ram;
    int kamera;

    public Telefon() {
    }

    public Telefon(int id, String ad, double fiyat, int depolama, int ram, int kamera) {
        this.id = id;
        this.ad = ad;
        this.fiyat = fiyat;
        this.depolama = depolama;
        this.ram = ram;
        this.kamera = kamera;
    }
}

public class TelefonHesap {
    public static void main(String[] args) {
        // Telefonları tanımlar ve dizi içine alır
        Telefon[] telefonArray = new Telefon[5];
        telefonArray[0] = new Telefon(1, "Telefon 1", 1000.0, 32, 8, 36);
        telefonArray[1] = new Telefon(2, "Telefon 2", 2000.0, 128, 12, 28);
        telefonArray[2] = new Telefon(3, "Telefon 3", 3000.0, 32, 3, 8);
        telefonArray[3] = new Telefon(4, "Telefon 4", 4000.0, 64, 4, 12);
        telefonArray[4] = new Telefon(5, "Telefon 5", 5000.0, 128, 6, 16);

        // Telefonların toplam fiyatını hesaplar ve yazdırır
        double toplamFiyat = toplamFiyatiHesapla(telefonArray);
        System.out.println("Telefonların Toplam Fiyatı: " + toplamFiyat + " TL");
    }

    public static double toplamFiyatiHesapla(Telefon[] telefonArray) {
        double toplam = 0;
        for (Telefon telefon : telefonArray) {
            toplam += telefon.fiyat;
        }
        return toplam;
    }
}
