import java.util.Scanner;

public class NotHesaplama {
    public void NotHesaplama(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Not gir: ");
        int not = scanner.nextInt();

        switch (not/10)
        {
                case 9:
                System.out.println( "AA");
                break;
            case 8:
                System.out.println( "BA");
                break;
            case 7:
                System.out.println( "BB");
                break;
        }
    }
}
