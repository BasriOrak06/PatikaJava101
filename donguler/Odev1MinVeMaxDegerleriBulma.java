package donguler;

import java.util.Arrays;
import java.util.Scanner;

public class Odev1MinVeMaxDegerleriBulma {
    public static void main(String[] args) {
        //1. ÇÖZÜM (KİŞİDEN ALINAN SAYILARI BİR DİZİYE ATAYIP, DAHA SONRA DİZİYİ (SORT İŞLEMİ YAPIP) SIRALAYIP, DİZİNİN İLK VE SON ELEMANLARINI YAZDIRDIM )
        int elemanSayisi;


        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        elemanSayisi = input.nextInt();
        int elemanlar[] = new int[elemanSayisi];
        for (int i = 0; i <= elemanSayisi -1; i++) {
            System.out.println("Sayı giriniz");
            elemanlar[i] = input.nextInt();
        }

        Arrays.sort(elemanlar);
        System.out.println("En küçük sayı: " + elemanlar[0]);
        System.out.println("En küçük sayı: " + elemanlar[elemanSayisi-1]);

        //2. ÇÖZÜM FOR DÖNGÜSÜ VE İF KOŞULLU İFADESİ İLE CÖZÜM

        Scanner inp = new Scanner(System.in);
        int members, number, minimum = 1, maximum = 1;

        System.out.print("Kaç adet sayı gireceksiniz: ");
        members =inp.nextInt();

        for (int i = 1; i <= members; i++){
            System.out.print(i + " . Sayıyı Giriniz: " );
            number = inp.nextInt();

            if(i == 1){
                maximum = number;
                minimum = number;
            }

            if (number > maximum ){
                maximum = number;
            }
            if (number < minimum){
                minimum = number;
            }
        }
        System.out.println("En büyük sayı: " + maximum);
        System.out.println("En küçük sayı: " + minimum);
    }
}
