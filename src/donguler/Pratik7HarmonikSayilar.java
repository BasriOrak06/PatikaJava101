package donguler;

import java.util.Scanner;

public class Pratik7HarmonikSayilar {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("N sayısını giriniz: ");
        n = input.nextInt();
        double result = 0;
        int i = 1;
        while ( i <= n) {
            result += (1/(double)i);
            i++;
        }
        System.out.println(result);
    }
}
