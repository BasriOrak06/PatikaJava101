package kosulluifadelervekodbloklari.artik_yil;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);
        System.out.println("Yıl Giriniz: ");
        yil = input.nextInt();

        if ((yil % 4 == 0) && (yil % 100 != 0) || (yil % 400 ==0)) {
            System.out.println(yil + " artık yıldır");
        } else {
            System.out.println(yil + " artık yıl değildir");
        }
    }
}
