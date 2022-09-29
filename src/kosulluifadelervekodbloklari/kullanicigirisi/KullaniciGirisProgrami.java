package kosulluifadelervekodbloklari.kullanicigirisi;
/*
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği
şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
"Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/

import java.util.Scanner;

public class KullaniciGirisProgrami {
    public static void main(String[] args) {
        String userName;
        String password;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.println("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Patikaya Hoşgeldiniz...!");
        } else {
            System.out.println("Kullanıcı adı -nız veya şifreniz hatalı!!!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (Yy/Nn)");
            String newPassword;
            String secim = input.nextLine();
            if (secim.equals("Y") || secim.equals("y")) {
                System.out.println("Yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Yeni şifreniz eski şifereniz ile aynı olamaz!!! Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifeniz başarılı bir şekilde oluturuldu");
                }
            } else {
                System.out.println("Giriş bilgileriniz hatalı, tekrar deneyiniz...");
            }
        }
    }
}
