package nothesaplaifelse;

import java.util.Scanner;

public class NotHesaplaIfElse {
    public void NotHesaplaIfElse(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Not gir: ");
        int not = scanner.nextInt();

        if (not >= 90) {
            System.out.println("Ders Notu: AA");
        } else if (not >= 80) {
            System.out.println("Ders Notu: BA");
        } else if (not >= 70) {
            System.out.println("Ders Notu: BB");
        } else if (not >= 60) {
            System.out.println("Ders Notu: CB");
        } else if (not >= 50) {
            System.out.println("Ders Notu: CC");
        } else {
            System.out.println("Ders Notu: FF");
        }
    }
}
