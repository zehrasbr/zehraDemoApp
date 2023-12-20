package faktoriyel;

import java.util.Scanner;

public class Faktoriyel {
    public void Faktoriyel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sayı gir: ");
        int sayi = scanner.nextInt();

        int fak = 1;
        for (int i = 1; i <= sayi; i++) {
            fak *= i;
        }
        System.out.println(sayi + " faktöriyel: " + fak);
    }
}
