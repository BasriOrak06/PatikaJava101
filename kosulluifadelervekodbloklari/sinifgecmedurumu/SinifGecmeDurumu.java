package kosulluifadelervekodbloklari.sinifgecmedurumu;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;
        double ortalama;
        int toplamNot = 0;
        int sayac = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notunuz: ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("0 -100 aralığında olmayan notlar ortalamaya katılmaz");
        } else {
            toplamNot += mat;
            sayac +=1;
        }

        System.out.println("Fizik Notunuz: ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("0 -100 aralığında olmayan notlar ortalamaya katılmaz");
        } else {
            toplamNot += fizik;
            sayac += 1;
        }

        System.out.println("Kimya Notunuz: ");
        kimya = input.nextInt();
            if (kimya < 0 || kimya > 100) {
                System.out.println("0 -100 aralığında olmayan notlar ortalamaya katılmaz");
            } else {
                toplamNot += kimya;
                sayac += 1;
            }

        System.out.println("Türkçe Notunuz: ");
        turkce = input.nextInt();
                if (turkce < 0 || turkce > 100) {
                    System.out.println("0 -100 aralığında olmayan notlar ortalamaya katılmaz");
                } else {
                    toplamNot += turkce;
                    sayac += 1;
                }

        System.out.println("Müzik Notunuz: ");
        muzik = input.nextInt();
                    if (muzik < 0 || muzik > 100) {
                        System.out.println("0 -100 aralığında olmayan notlar ortalamaya katılmaz");
                    } else {
                        toplamNot += muzik;
                        sayac += 1;
                    }
        ortalama = toplamNot / sayac;
        if (ortalama > 55) {
            System.out.println("Tebrikler Geçtiniz... Not Ortalamanız: " + ortalama);
        } else {
            System.out.println("Maalesef Kaldınız!!! Not Ortalamanız: " + ortalama);
        }
    }

}
