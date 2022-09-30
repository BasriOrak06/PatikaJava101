package kosulluifadelervekodbloklari.ucak_bileti_fiyati_hesaplama;

import java.util.Scanner;

public class UcakBiletiFiaytiHesaplama {
    public static void main(String[] args) {
        int mesafe;
        int yas;
        int yolculukTipi;
        double yasIndirimi;
        double gidisDonusIndirimi;


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextInt();

        System.out.println("lütfen yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.println("Lütfen yolculuk tipini seçiniz: \n1-Tek Yön\n2-Gidiş Dönüş");
        yolculukTipi = input.nextInt();

        if (mesafe < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı bir değer girdiniz!!!");
        }else {
            if (yas < 12 ) {
                yasIndirimi = 0.50;
            } else if (yas > 12 && yas <= 24) {
                yasIndirimi = 0.10;
            } else if (yas > 65) {
                yasIndirimi = 0.30;
            } else {
                yasIndirimi = 0.00;
            }

            if (yolculukTipi == 1) {
                gidisDonusIndirimi = 0;
            } else {
                gidisDonusIndirimi = 0.20;
            }

            double normalFiyati = mesafe * 0.10;
            double indirimliBiletFiyati = normalFiyati - (yasIndirimi*normalFiyati);
            double odenecekBiletFiyati = indirimliBiletFiyati - (indirimliBiletFiyati*gidisDonusIndirimi);

            if (yolculukTipi == 2) {
                odenecekBiletFiyati = odenecekBiletFiyati*2;
            }
        System.out.println("Ödenmesi Gereken Bilet Fiyatı: " + odenecekBiletFiyati);
        }
    }
}
