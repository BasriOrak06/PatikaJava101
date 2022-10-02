package donguler;

import java.util.Scanner;

public class Pratik9ATMProjesi {
    public static void main(String[] args) throws InterruptedException {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int count = 3;
        double balance = 1500;
        int select;

        while (count > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Patika Bankasına Hoşgeldiniz");
                do {
                    System.out.println("1- Para Yatırmma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış Yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Yatırmak istediğiniz milktarı giriniz: ");
                            double deposit = input.nextDouble();
                            balance += deposit;
                            System.out.println("Para yatırma işleminiz başarı ile gerçekleşmiştir. Yeni bakiyeniz: " + balance);
                            Thread.sleep(2000);
                            break;

                        case 2:
                            System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                            double withdrawal = input.nextDouble();
                            if (withdrawal > balance) {
                                System.out.println("Bakiyeniz yetersiz");
                            } else {
                                balance -= withdrawal;
                                System.out.println("Yeni bakiyeniz: " + balance);
                            }
                            Thread.sleep(2000);
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            Thread.sleep(2000);
                            break;
                    }

                } while (select != 4);
                System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz. İyi günler");
                Thread.sleep(2000);
                break;
            } else {
                count--;
                System.out.println("Hatalı kullanıcı veya şifre!!! Tekrar deneyiniz");
                if (count > 0) {
                    System.out.println("Kalan hakkınız: " + count);
                } else {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişlime geçin");
                    break;
                }
            }
        }

    }
}
