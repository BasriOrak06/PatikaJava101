package diziler;

import java.util.Arrays;
import java.util.Scanner;

public class Pratik2EnYakinSayi {
    public static void main(String[] args) {
        int [] list = {56, 34, 1, 8, 101, -2, -33};
        Arrays.sort(list);
        int [] newList = new int[list.length+1];
        int girilenSayi;
        Scanner input = new Scanner(System.in);
        System.out.print( "Sayı giriniz: ");
        girilenSayi = input.nextInt();

        for (int i = 0; i < list.length; i++ ) {
            newList [i] = list[i];
            newList[newList.length -1] = girilenSayi;
        }
        Arrays.sort(newList);
        System.out.println(Arrays.toString(newList));
        int index = Arrays.binarySearch(newList,girilenSayi);
        if (girilenSayi <= list[0]) {
            System.out.println("Girilen sayı dizideki en küçük sayıdır.\n" + girilenSayi + " sayısından büyük en yakın sayı : " + newList[index+1]);
        } else if (girilenSayi >= list[list.length -1]) {
            System.out.println("Girilen sayı dizideki en büyükük sayıdır.\n" + girilenSayi + " sayısından küçük en yakın sayı : " + newList[index-1]);

        } else {
            System.out.println(girilenSayi + " sayısından küçük en yakın sayı : " + newList[index-1] + ",\n" + girilenSayi + " sayısından büyük en yakın sayı : " + newList[index+1]);
        }
    }
}
