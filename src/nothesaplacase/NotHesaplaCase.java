package nothesaplacase;

import java.util.Scanner;

public class NotHesaplaCase {
    public void NotHesaplaCase(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize gir: ");
        int vizeNot = scanner.nextInt();
        System.out.print("Final gir: ");
        int finalNot = scanner.nextInt();

        int sonuc = 0;
        sonuc += (vizeNot * 0.4) + (finalNot * 0.6);
        System.out.println("Ders sonucu: " + sonuc);

        switch (sonuc / 10)
        {
            case 10:

                System.out.println( "Ders Notu: AA");
                break;
            case 9:
                System.out.println( "Ders Notu: AA");
                break;
            case 8:
                System.out.println( "Ders Notu: BA");
                break;
            case 7:
                System.out.println( "Ders Notu: BB");
                break;
            case 6:
                System.out.println( "Ders Notu: CB");
                break;
            case 5:
                System.out.println( "Ders Notu: CC");
                break;
            case 4:
                System.out.println( "Ders Notu: FF");
                break;
            case 3:
                System.out.println( "Ders Notu: FF");
                break;
            case 2:
                System.out.println( "Ders Notu: FF");
                break;
            case 1:
                System.out.println( "Ders Notu: FF");
                break;
        }
    }
}
