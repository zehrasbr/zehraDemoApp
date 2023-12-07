import java.util.Scanner;

public class NotHesaplama {
    public void NotHesaplama(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Not gir: ");
        int not = scanner.nextInt();

        switch (not/10)
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
