package temelkavramlarvedegiskenler.vucutkitleindeksi;

import java.util.Scanner;

public class VucutKitleIndeksHesaplama {
    public static void main(String[] args) {
        double kilo, boy, indeks;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kilo = input.nextDouble();

        System.out.println("Lütfen boyunuzu cm cinsinden giriniz: ");
        boy = input.nextDouble();

        indeks = 10000 * (kilo/(boy * boy));   // boyun cm olarak girilmesi durumu
//      indeks = (kilo/(boy * boy));  Boyun metre olarak girilmesi durumu

        System.out.println("Vücut kitle indeksiniz: " + indeks);
    }
}
