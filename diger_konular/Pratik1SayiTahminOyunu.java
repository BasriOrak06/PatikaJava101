package diger_konular;

import java.util.Scanner;

public class Pratik1SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int generatedNumber = (int) (Math.random() * 101);
        int guessedNumber = -1;   //oyunun en başında while döngüsüne girmesi iç,n yanlışlığı kesin olan eksi değer verdim
        int right = 5;            //Oyuncuya 5 hak verdim. Daha fazla veya az hak vermek için 5 rakamını değiştirebilrisiniz

        System.out.print("0 ile 100 arasında bir sayı giriniz: ");
        while (guessedNumber != generatedNumber && right != 0) {
            guessedNumber = input.nextInt();
            if (guessedNumber == generatedNumber) {
                System.out.println("Tebrikler saklı sayı: " + generatedNumber + " tahmininiz: " + guessedNumber);
            } else if (guessedNumber > generatedNumber) {
                --right;
                System.out.println("Yüksek tahminde bulundunuz kalan hakkınız : " + right );
            } else {
                --right;
                System.out.println("Düşük tahminde bulundunuz kalan hakkınız : " + right);
            }
        }
        if (right == 0) {
            System.out.println("Saklı sayı" + generatedNumber + " Hakkınız Kalmadı. Kaybettiniz!!!");
        }

    }
}
