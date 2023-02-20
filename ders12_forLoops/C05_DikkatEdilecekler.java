package ders12_forLoops;

public class C05_DikkatEdilecekler {
    public static void main(String[] args) {


        /*          Sonsuz Loop

        Döngü hep true oluyorsa.

        for (int i = 0; i > -10 ; i++)
        {
            System.out.println(i + " ");
        }

         */

        for (int i = 0; i > 10 ; i++) {    // ilk değer için bitiş şartı true olmuyorsa, for body'si hiç devreye girmez.

            System.out.println(i);

        }

        // bir loop ' u sonunu beklemeden bitirmek istersek

        // kullanıcının verdiği bir sayının asal sayı olup olmadığını bulun.

        int sayi = 13;
        boolean bayrak = false;

        for (int i = 2; i <= sayi-1 ; i++) {

            if (sayi % i == 0){

                // kontrole gerek kalmadığından break yapıyoruz.
                bayrak = true;
                break;
            }
            
        }

        System.out.println(bayrak);

        if (bayrak)
            System.out.println("Asal sayı");
        else
            System.out.println("Asal sayı değil");




    }
}
