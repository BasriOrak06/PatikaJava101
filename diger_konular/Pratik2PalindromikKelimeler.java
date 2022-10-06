package diger_konular;

import java.util.Scanner;

public class Pratik2PalindromikKelimeler {
    public static void main(String[] args) {
        String word, reverseWord = "";
        Scanner input  =new Scanner(System.in);
        char a;
        System.out.print("Palindromik olup olmadığını öğrenmek istediğiniz kelimeyi giriniz: ");
        word = input.nextLine();

        for (int i=0; i<word.length(); i++)
        {
            a= word.charAt(i);
            reverseWord= a + reverseWord;
        }
        if(word.equalsIgnoreCase(reverseWord)) {
            System.out.println(word + " palindromik bir kelimedir");
        } else {
            System.out.println(word + " palindromik bir kelime değildir");
        }
    }
}
