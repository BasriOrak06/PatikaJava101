package temelkavramlarvedegiskenler.dairealancevredilimalan;

import java.util.Scanner;

public class DaireGeomerikHesaplamalar {
    public static void main(String[] args) {
        double PI = 3.14;
        double r, cevre, alan, derece, dilimalani;


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dairenin yarıçapını giriniz: ");
        r = input.nextDouble();

        System.out.println("Lütfen alanını hesaplamak istediğiniz daire diliminin derecesini giriniz: ");
        derece = input.nextDouble();

        cevre = 2 * PI * r;
        alan = PI * r * r;
        dilimalani= alan/ (360/derece);
        System.out.println("Yarıçapı " + r + " olan dairenin Çevresi: " + cevre);
        System.out.println("Yarıçapı " + r + " olan dairenin alanı: " + alan);
        System.out.println("Yarıçapı " + r + " merkez açısı " + derece + " derece olan daire diliminin alanı: " + dilimalani);

    }
}
