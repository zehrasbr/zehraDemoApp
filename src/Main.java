public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        double s1 = scanner.nextDouble();
        System.out.println("İkinci sayıyı giriniz: ");
        double s2 = scanner.nextDouble();
        System.out.println("Üçüncü sayıyı giriniz: ");
        double s3 = scanner.nextDouble();
        double ort = (s1 + s2 + s3) / 3.0;
        System.out.println("Sayıların ortalaması: " + ort);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Vize notunu giriniz: ");
        double vizeNot = scanner2.nextDouble();
        System.out.println("Final notunu giriniz: ");
        double finalNot = scanner2.nextDouble();
        double ort2 = (vizeNot * 0.4) + (finalNot * 0.6);
        if (ort2 >= 50) {
            System.out.println("Dersi geçtiniz");
        } else {
            System.out.println("Dersi geçemediniz");
        }
    }
}
