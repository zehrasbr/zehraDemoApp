package demo;

import java.util.Scanner;

public class Demo {
    public void Demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quiz notunu giriniz: ");
        int quiz = scanner.nextInt();
        System.out.println("Vize notunu giriniz: ");
        int vizeNot = scanner.nextInt();
        System.out.println("Final notunu giriniz: ");
        int finalNot = scanner.nextInt();
        int sonuc = 0;
        sonuc += (vizeNot * 0.4) + (finalNot * 0.4) + (quiz * 0.2);
        if (sonuc > 50) {
            System.out.println("Dersten geçtiniz.");
        } else {
            System.out.println("Dersten kaldınız.");
        }
    }
}
