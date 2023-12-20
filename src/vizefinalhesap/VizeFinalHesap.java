package vizefinalhesap;

import java.util.Scanner;

public class VizeFinalHesap {
    public void VizeFinalHesap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize notunu giriniz: ");
        int vizeNot = scanner.nextInt();

        System.out.print("Final notunu giriniz: ");
        int finalNot = scanner.nextInt();

        int sonuc = 0;
        sonuc += (vizeNot * 0.4) + (finalNot * 0.6);
        if (sonuc >= 50) {
            System.out.println("Dersi " + sonuc + " notuyla geçtiniz.");
        } else {
            System.out.println("Dersten " + sonuc + " notuyla kaldınız.");
        }
    }
}
