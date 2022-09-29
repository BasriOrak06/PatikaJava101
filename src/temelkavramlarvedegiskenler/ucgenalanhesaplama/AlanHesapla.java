package temelkavramlarvedegiskenler.ucgenalanhesaplama;

import java.util.Scanner;

public class AlanHesapla {
    public static void main(String[] args) {
        double a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Birinci Kenar uzunluğunu Giriniz: ");
        a = input.nextDouble();

        System.out.println("Lütfen Birinci Kenar uzunluğunu Giriniz: ");
        b = input.nextDouble();

        System.out.println("Lütfen Birinci Kenar uzunluğunu Giriniz: ");
        c = input.nextDouble();

        double u = (a + b + c)/2;

        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: " + alan);
    }
}
