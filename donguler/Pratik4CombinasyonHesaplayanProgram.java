package donguler;

import java.util.Scanner;

public class Pratik4CombinasyonHesaplayanProgram {
    public static void main(String[] args) {
        int num1, num2, num3;
        int fak1 =1, fak2 = 1, fak3 =1;
        int comb;

        Scanner input = new Scanner(System.in);
        System.out.println("Brinci sayıyı giriniz: ");
        num1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        num2 = input.nextInt();

        if (num1 >= num2) {
            for (int i = 1; i <= num1; i++) {
                fak1 = fak1 * i;
            }

            for (int j = 1; j <=num2; j++) {
                fak2 = fak2 * j;
            }

            num3 = num1 - num2;
            for (int k = 1; k <= num3; k++) {
                fak3 = fak3 * k;
            }

        comb = fak1 / (fak2 * fak3);
            //System.out.println("C(" + num1 + "," + num2 + "): " + comb);
            System.out.printf("C(%s,%s): %s",num1,num2, comb);
        } else {
            System.out.println("Birinci sayı ikinci sayıdan büyük veya eşit olmalıdır");
        }
    }
}
