package ders12_forLoops;

public class C03_Faktoriyel {

    public static void main(String[] args) {

        // kullanicinin verdigi sayinin faktoriyelini bulalım

        int sayi = 5;

        int faktoriyel = 1;

        for (int i = sayi; i >= 1; i--) {

            faktoriyel = faktoriyel * i;

        }

        System.out.println(faktoriyel);

        // 1' den 100'e kadar olan sayıları toplayın

        int toplam = 0;

        for (int i = 1; i <= 100 ; i++) {

            toplam = toplam + i;

        }

        System.out.print(toplam);

    }
}
