package terstenyazim;

import java.util.Scanner;

public class TerstenYazim {
    public void TerstenYazim(){
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime yazınız: ");
        String metin = scanner.nextLine();
        String tersten = "";
        for(i = metin.length() - 1; i >= 0; i--)
        {
            tersten += metin.charAt(i);
        }
        System.out.print("Kelimenin tersi: " + tersten);
    }
}
