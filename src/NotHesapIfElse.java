import java.util.Scanner;

public class NotHesapIfElse {
    public void NotHesapIfElse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Not gir: ");
        int not = scanner.nextInt();

        if (not >= 90) {
            System.out.println("AA");
        } else if (not >= 80) {
            System.out.println("BA");
        } else if (not >= 70) {
            System.out.println("BB");
        } else if (not >= 60) {
            System.out.println("CB");
        } else if (not >= 50) {
            System.out.println("CC");
        } else {
            System.out.println("FF");
        }
    }
}
