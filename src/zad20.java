import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner( System.in);
        double cukier = 1.5/48;
        double maslo = 1.0/48;
        double maka = 2.75/48;
        int iloscCiastek;
        System.out.println("Podaj ilosc ciastek: ");
        iloscCiastek = klawiatura.nextInt();
        double cukierd = cukier * iloscCiastek;
        double maslod = maslo * iloscCiastek;
        double makad = maka * iloscCiastek;
        System.out.println("Do upieczenia " + iloscCiastek + " ciastek potrzeba: ");
        System.out.println(cukierd + " szklanek maki\n" + maslod + " szklanek masla\n" + makad + " szklanek maki");




    }
}
