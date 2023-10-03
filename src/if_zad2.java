import java.util.Scanner;

public class if_zad2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner( System.in);
        int dzien, miesiac, rok;
        System.out.println("Podaj dzien: ");
        dzien = klawiatura.nextInt();
        System.out.println("Podaj miesiac (w formie liczby): ");
        miesiac = klawiatura.nextInt();
        System.out.println("Podaj rok (dwie ostatnie cyfry): ");
        rok = klawiatura.nextInt();
        int iloczyn = dzien * miesiac;
        if (iloczyn == rok){
            System.out.println("Data jest magiczna.");
        }else {
            System.out.println("Data nie jest magiczna.");
        }
    }
}
