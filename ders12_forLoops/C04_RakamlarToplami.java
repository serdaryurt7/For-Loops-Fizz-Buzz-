package ders12_forLoops;

public class C04_RakamlarToplami {

    public static void main(String[] args) {

        // Kullanıcının sayının rakamlar toplamını bulun.

        long sayi = 14532322131239L;
        String strSayi = "" +sayi;

        long birlerBasamagi = 0;
        long rakamlarToplami = 0;

        for (int i = 1; i <= strSayi.length(); i++) {

            birlerBasamagi = sayi % 10;
            rakamlarToplami = rakamlarToplami + birlerBasamagi;
            sayi = sayi / 10;
        }

        System.out.println(rakamlarToplami);

    }

}
