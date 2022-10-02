package donguler;

import java.util.Scanner;

public class Pratik10EbonEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz");
        int sayi2 = input.nextInt();
        int ebob = 1;
        int kontrol = 2;
        int ekok;
        while(kontrol <= sayi1 && kontrol <= sayi2){
            if(sayi1 % kontrol == 0 && sayi2 % kontrol == 0){
                ebob = kontrol;
            }
            kontrol++;
        }
        if(ebob==1){
            System.out.println(sayi1 +" ve " + sayi2+ " aralarında asaldır");
        }else {
            System.out.println(sayi1 +" ve " + sayi2+ " sayılarının en büyük ortak böleni : "+ebob);
        }
        ekok = (sayi1*sayi2) / ebob;
        System.out.println(sayi1 + " ve " + sayi2 + " sayılarının EKOK'u:" + ekok);
    }
}

