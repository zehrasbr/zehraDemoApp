import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /*Yazdir yazdir = new Yazdir();
    yazdir.yazdir();*/

        //Çarpım tablosunu oluşturan bir sınıf yazın.
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        hesapMakinesi.HesapMakinesi();

        //100 lük sayı sisteminde girilen notları sayı sistemine çeviren kodu yazınız.
        // Bu ödevde switch case kullanınız.
        NotHesaplama notHesaplama = new NotHesaplama();
        notHesaplama.NotHesaplama();

        //100 lük sayı sisteminde girilen notları sayı sistemine çeviren kodu yazınız.
        // Bu ödevde if else  kullanınız.
        NotHesapIfElse notHesapIfElse = new NotHesapIfElse();
        notHesapIfElse.NotHesapIfElse();
    }
}

