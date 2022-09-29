package temelkavramlarvedegiskenler.notortalamasihesaplayanprogram;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner tara = new Scanner(System.in);

        System.out.println("Lütfen matematik notunuzu giriniz: ");
        mat = tara.nextInt();

        System.out.println("Lütfen fizik notunuzu giriniz: ");
        fizik = tara.nextInt();

        System.out.println("Lütfen kimya notunuzu giriniz: ");
        kimya = tara.nextInt();

        System.out.println("Lütfen Türkçe notunuzu giriniz: ");
        turkce = tara.nextInt();

        System.out.println("Lütfen tarih notunuzu giriniz: ");
        tarih = tara.nextInt();

        System.out.println("Lütfen müzik notunuzu giriniz: ");
        muzik= tara.nextInt();

        int toplamNot = mat + fizik + kimya + turkce + tarih + muzik;
        double notOrtalamasi = toplamNot / 6;

        String basariDurumu = (notOrtalamasi > 60 ) ? ("Not Ortlamanız: " + notOrtalamasi + " Tebrikler Geçtiniz") :("Not Ortlamanız: " + notOrtalamasi + " Maalesef kaldınız");
        System.out.println(basariDurumu);

/*        if (notOrtalamasi > 60) {
            System.out.println("Not Ortlamanız: " + notOrtalamasi + " Tebrikler Geçtiniz");
        } else {
            System.out.println("Not Ortlamanız: " + notOrtalamasi + " Maalesef kaldınız");
        }
*/
    }
}
