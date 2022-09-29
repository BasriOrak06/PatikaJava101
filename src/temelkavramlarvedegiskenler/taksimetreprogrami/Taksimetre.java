package temelkavramlarvedegiskenler.taksimetreprogrami;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int acilis = 10;
        int km;
        double perKm = 2.20;
        double odenecek;
        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen mesafeyi giriniz: ");
        km = input.nextInt();

        odenecek = acilis + km*perKm;
        if (odenecek < 20) {
            odenecek = 20;
            System.out.println("Ödenecek tutar 20 TL'dir.");
        } else {
            System.out.println("Ödenecek tutar: " + odenecek + " TL'dir.");
        }



    }
}
