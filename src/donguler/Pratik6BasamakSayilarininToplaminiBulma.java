package donguler;

import java.util.Scanner;

public class Pratik6BasamakSayilarininToplaminiBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();
        int remainder;
        int result = 0;

        while (number != 0) {
            remainder = number % 10;
            result += remainder;
            number /= 10;
        }
        System.out.println("Basamak değerleri toplamı: " + result);


/*
        //İKİNCİ YÖNTEM
        1-Kullanıcıdan sayıyı string olarak aldım
        2-Sayıyı indeks nuamralarına göre char(karekterlerine ayırdım)
        3-Karekterleri toString metodu ile Stringe, Stringe dönüşen karekterleri de Integer.parseInt metodu ile integera çevirdim
            değerleri ve basamak adlı değişkene atadım
        4-Kullanıcı yanlışlıkla numerik karekter dışında harf vb. değer girerse program hata vermesin diye try-catch ekledim. (ilk
        yöntemde kullanıcının integer değer dısında harf vb değer girmesi ile hata alırız )
        5-Geriye basamak değerlerini toplamak kaldı
        6-Biraz uzun oldu ama kendime değişik bir pratik olsun istedim :)
*/

        System.out.println("******************************************************");
        String sayi;
        Scanner scn = new Scanner(System.in);
        System.out.println("Sayı girinizzz: ");
        sayi = scn.next();

        int toplam = 0;
        try {
            for (int i = 0; i < sayi.length(); i++) {
                char bas = sayi.charAt(i);
                int basamak = Integer.parseInt(Character.toString(bas));
                //System.out.println(basamak);
                toplam = toplam + basamak;
            }
        } catch (NumberFormatException e) {
            System.out.println("Lütfen sadece numerik karekterler giriniz. Aşağıda yer alan toplam sadece ilk numerik olmayan karekterlere kadar olan rakamların toplamını vermektedir");
        }

        System.out.println("Girilen sayının basamak değerlerinin toplamı= " + toplam);
    }
}
