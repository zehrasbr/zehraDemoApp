package carpimtablosu;

public class CarpimTablosu {
    public void CarpimTablosu() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (j * i));
            }
        }
    }
}
