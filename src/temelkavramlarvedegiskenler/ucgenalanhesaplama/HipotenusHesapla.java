package temelkavramlarvedegiskenler.ucgenalanhesaplama;

import java.util.Scanner;

public class HipotenusHesapla {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz: ");
        a = input.nextDouble();
        System.out.println("2. Kenarı Giriniz: ");
        b = input.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("Hipotenüs :" + c);
    }
}
