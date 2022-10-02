package donguler;


import java.util.Scanner;

public class Odev5FibonacciSerisi {
    public static void main(String[] args) {
        int elemanSayisi;
        int fib1 = 0;
        int fib2 = 1;
        int hesaplananFibonacci = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        elemanSayisi = input.nextInt();

        System.out.print("1 ");
        for (int i = 0; i < elemanSayisi - 1; i++) {
            hesaplananFibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 =hesaplananFibonacci;
            System.out.print(hesaplananFibonacci + " ");
        }
    }
}


