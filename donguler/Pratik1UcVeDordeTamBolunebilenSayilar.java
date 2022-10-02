package donguler;

import java.util.Scanner;

public class Pratik1UcVeDordeTamBolunebilenSayilar {
    public static void main(String[] args) {
        int number;
        int total = 0;
        int count = 0;
        double avarage = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        number = input.nextInt();

        for (int i =1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                count++;
                total = total + i;
                avarage = (double) total/count;
            }
        }
        System.out.println(avarage);
    }
}
