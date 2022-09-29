package temelkavramlarvedegiskenler.manavkasaprogrami;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.0;

        double armutKilo;
        double elmaKilo;
        double domatesKilo;
        double muzKilo;
        double patlicanKilo;

        Scanner input = new Scanner(System.in);
        System.out.println("Alınan armut miktarını giriniz: ");
        armutKilo = input.nextDouble();

        System.out.println("Alınan elma miktarını giriniz: ");
        elmaKilo = input.nextDouble();

        System.out.println("Alınan domates miktarını giriniz: ");
        domatesKilo = input.nextDouble();

        System.out.println("Alınan muz miktarını giriniz: ");
        muzKilo = input.nextDouble();

        System.out.println("Alınan patlıcan miktarını giriniz: ");
        patlicanKilo = input.nextDouble();

        double odenecek = armutFiyat*armutKilo + elmaFiyat*elmaKilo + domatesFiyat*domatesKilo + muzFiyat*muzKilo + patlicanFiyat*patlicanKilo;
        System.out.printf("Toplam ödenecek Tutar %s TL'dir", odenecek);
    }
}
