package sayiortalamasi;

import java.util.Scanner;

public class SayiOrtlamasi {
    public void SayiOrtalamasi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();
        System.out.println("İkinci sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();
        System.out.println("Üçüncü sayıyı giriniz: ");
        double sayi3 = scanner.nextDouble();

        int toplam = 0;
        toplam += (sayi1 + sayi2 + sayi3) / 3;
        System.out.println("Girilen sayıların ortlaması: " + toplam);

    }
}
