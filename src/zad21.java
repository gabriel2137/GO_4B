import java.util.Scanner;

public class zad21 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double kwotapocz, stopa, ileodsetek, lata;
        System.out.println("Podaj zdeponowaną kwotę: ");
        kwotapocz = klawiatura.nextDouble();
        System.out.println("Podaj roczną stopę oprocentowania: ");
        stopa = klawiatura.nextDouble();
        System.out.println("Podaj ile razy w roku odsetki są kapitalizowane: ");
        ileodsetek = klawiatura.nextDouble();
        System.out.println("Podaj liczbę lat, przez jakie środki będą znajdować się na koncie: ");
        lata = klawiatura.nextDouble();
        double B = Math.pow(1+stopa/ileodsetek,lata);
        double A = kwotapocz*B;
        System.out.println("Kwota po " + lata + " latach: " + A);
    }
}
