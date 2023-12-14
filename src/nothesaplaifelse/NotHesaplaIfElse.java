package nothesaplaifelse;

import java.util.Scanner;

public class NotHesaplaIfElse {
    public void NotHesaplaIfElse(){
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Not gir: ");
        //int sonuc = scanner.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize gir: ");
        int vizeNot = scanner.nextInt();
        System.out.print("Final gir: ");
        int finalNot = scanner.nextInt();

        int sonuc = 0;
        sonuc += (vizeNot * 0.4) + (finalNot * 0.6);
        System.out.println("Ders sonucu: " + sonuc);

        if (sonuc >= 90) {
            System.out.print("Ders Notu: AA");
        } else if (sonuc >= 80) {
            System.out.print("Ders Notu: BA");
        } else if (sonuc >= 70) {
            System.out.print("Ders Notu: BB");
        } else if (sonuc >= 60) {
            System.out.print("Ders Notu: CB");
        } else if (sonuc >= 50) {
            System.out.print("Ders Notu: CC");
        } else {
            System.out.print("Ders Notu: FF");
        }
    }
}
