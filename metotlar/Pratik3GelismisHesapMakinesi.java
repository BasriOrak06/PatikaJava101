package metotlar;

import java.util.Scanner;
// Farklı olarak hesap makinesinin menüyü gösterme işlemini yeni bir metoda atadım
// program açılışında menüyü bu metodu çağırarak gösterdim
// kullanıcının istediği zaman menüyü gösterebilmesi için metodu case olarak atadım
// kullanıcının geçersiz seçim yapması durumunda yine bu fonksiyondan menüyü yazdırdım
// thread.sleep ile yanlış seçimde menü ekrana gelmeden önce kullanıcının hata yaptığını okluyabilmesi için 1 saniye (1000 milisaniye) bekleme düresi koydum
// Java 17 ile switch case'e gelen pattern ile switch case yapısını kurdum
// Herkese kolay gelsin

public class Pratik3GelismisHesapMakinesi {

    static void menuGoster() {
        System.out.println("1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "8- Menü Göster\n"
                + "0- Çıkış Yap");
    }

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Fark: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpım: " + result);
        return result;
    }

    static double divided(double a, double b) {
        double result = a / b;
        System.out.println("Bölüm: " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calcRectangle(int a, int b) {
        int area = a * b;
        int perimeter = 2 * (a + b);
        System.out.println("Alanı: " + area);
        System.out.println("Çevresi: " + perimeter);
    }

    public static void main(String[] args) throws InterruptedException {
        int a, b, select;

        menuGoster();
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }

            if (select > 8) {
                System.out.println("Geçerli bir seçim yapınız!!!");
                Thread.sleep(1000);
                menuGoster();
            }

            if (select >= 1 && select <=8) {
                System.out.println("İlk sayıyı giriniz: ");
                a = scan.nextInt();
                System.out.println("İkinci sayıyı giriniz: ");
                b = scan.nextInt();

                switch (select) {
                    case 1 -> sum(a, b);
                    case 2 -> minus(a, b);
                    case 3 -> times(a, b);
                    case 4 -> divided(a, b);
                    case 5 -> System.out.println("Üs alma işlemi: " + power(a, b));
                    case 6 -> System.out.println("Mod işlemi: " + mod(a, b));
                    case 7 -> calcRectangle(a, b);
                    case 8 -> menuGoster();
                }
            }
        }
        System.out.println("Güle Güle");
    }
}

