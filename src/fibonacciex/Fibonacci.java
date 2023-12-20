package fibonacciex;

import java.util.Scanner;

public class Fibonacci {
    public void FibonacciHesapla() {
        int a = 1;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);

        for (int i = 1; i < 100; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
