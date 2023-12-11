import java.util.Scanner;

public class Fonksiyon {
    public void Fonksiyon(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("x gir: ");
        double x = scanner.nextDouble();
        System.out.print("y gir: ");
        double y = scanner.nextDouble();
        double sonuc=0;

        if(x>0 && y<0)
        {
            sonuc = (4*x)+(2*y)+4;
            System.out.print("f(x,y)= "+"(4 * "+x+")"+" + "+"(2 * "+y+")"+" + 4 = " + sonuc);
        }
        else if (x>0 && y==0)
        {
            sonuc = (2*x)-y-3;
            System.out.print("f(x,y)= " + "(2 * "+x+")"+" - "+ y +" - 3 = "+sonuc);
        }
        else if (x<0 && y>0)
        {
            sonuc = (3*x)+(4*y)+3;
            System.out.print("f(x,y)= "+"(3 * "+x+")"+" + "+"(4 * "+y+")"+" + 3 = "+sonuc);
        }
    }
}
