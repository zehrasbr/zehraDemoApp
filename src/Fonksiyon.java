import java.util.Scanner;

public class Fonksiyon {
    public void Fonksiyon(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi gir: ");
        int x = scanner.nextInt();
        System.out.print("Sayi gir: ");
        int y = scanner.nextInt();
        int sonuc=0;
        if(x>0 && y<0)
        {
            System.out.print("f(x,y)= ");
            sonuc = (4*x)+(2*y)+4;
        }
        if(x>0 && y==0)
        {
            System.out.print("f(x,y)= ");
            sonuc = (2*x)-y-3;
        }
        if(x<0 && y>0)
        {
            System.out.print("f(x,y)= ");
            sonuc = (3*x)+(4*y)+3;
        }
    }
}
