package donguler;

import java.util.Scanner;

public class Pratik5UsluSayiHesaplama {
    public static void main(String[] args) {
        int num1, num2;
        int result = 1;   // Eksi kuvvet alma işlemi durumu için float tanımladım
        Scanner input = new Scanner(System.in);
        System.out.println("Kuvveti alınacak sayıyı giriniz: ");
        num1 = input.nextInt();
        System.out.println("Kuvveti giriniz: ");
        num2 = input.nextInt();


        for (int i = 1; i <= num2; i++) {
            result *= num1;
        }

        System.out.println(num1 + " sayısının " + num2 + " dereceden kuvveti: " + result + " sayısına eşittir");

        //Döngüsüz hesaplama
        double pow = Math.pow(num1, num2);
        System.out.println("Math kütüphanesine göre hesaplanan üs: " + pow);
    }
}
