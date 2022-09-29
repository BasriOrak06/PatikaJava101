package temelkavramlarvedegiskenler.kdvhesaplayanprogram;

import java.util.Scanner;

public class KdvHesaplamaProgrami {
    public static void main(String[] args) {
        double fiyat;
        double kdvOrani;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen fiyatı giriniz: ");
        fiyat = input.nextDouble();

        if (fiyat < 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        double kdvTutari = fiyat * kdvOrani;
        System.out.println("Girdiğiniz ürünün Kdv Oranı yüzde " + (int)(kdvOrani*100) + " KDV tutarı: " + kdvTutari + " TL'dir");

        double kdvDahilFiyat = fiyat + kdvTutari;
        System.out.println("Girdiğiniz ürünün Kdv Oranı yüzde " + (int)(kdvOrani*100) + " KDV tutarı: " + kdvTutari + " TL " + " KDV dahil fiyatı: " + kdvDahilFiyat + " TL'dir.");

    }

}
