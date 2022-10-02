package donguler;

import java.util.Scanner;

public class Odev2MukemmelSayı {
    public static void main(String[] args) {
        System.out.print("Lütfen Pozitif Bir Doğal Sayı Giriniz : ");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int toplam = 0;

        for (int i = 1; i<sayi; i++) {
            if (sayi % i == 0) {
                toplam =toplam +i;
            }
        }

        if (sayi==toplam) {
            System.out.println(sayi + " bir mükemmel sayıdır.");
        }else{
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}
