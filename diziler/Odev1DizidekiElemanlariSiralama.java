package diziler;

import java.util.Arrays;
import java.util.Scanner;

public class Odev1DizidekiElemanlariSiralama {
    static int boyut;
    public static void main(String[] args) {
        boyutIste();
    }

    public static void boyutIste() {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        boyut = input.nextInt();
        if (boyut > 0) {
            int[] list = new int[boyut];
            for (int i = 0; i < boyut; i++) {
                System.out.print("Eleman giriniz: ");
                list[i] = input.nextInt();
            }
            Arrays.sort(list);
            System.out.println(Arrays.toString(list));
        } else {
            System.out.println("Diziniz boyutu sıfırdan büyük olmalıdır.");
            boyutIste();
        }
    }
}
