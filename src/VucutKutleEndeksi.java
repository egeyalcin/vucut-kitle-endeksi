import java.util.Scanner;

public class VucutKutleEndeksi {
    public static void main(String[] args) {
        double boy,kilo;
        double endeks;
        Scanner inp = new Scanner(System.in);

        System.out.println("Metre cinsinden boy giriniz");
        boy = inp.nextDouble();
        System.out.println("Kilo giriniz");
        kilo = inp.nextInt();
        endeks = kilo / (boy * boy);
        System.out.println("endeks" + endeks);


    }
}
