package kosulluifadelervekodbloklari.hava_sicakligina_gore_etkinlik;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen hava sıcaklığını giriniz: ");
        heat = input.nextInt();
        
        if (heat <= 5) {
            System.out.println("Kayağa gidebilrisiniz...");
        } else if (heat <=15 ) {
            System.out.println("Sinemaya gidebilirsiniz...");
        } else if (heat < 25) {
            System.out.println("Pikniğe gidebilrisiniz...");
        } else System.out.println("Yüzmeye gidebilirsiniz...");  // tek satır olduğu için süslü parantezlere ihtiyaç yok
    }
}
