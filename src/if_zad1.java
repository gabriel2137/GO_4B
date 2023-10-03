import java.util.Scanner;

public class if_zad1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner( System.in);
        int liczba;
        System.out.println("Podaj liczbe z przedzialu od 1 do 10: ");
        liczba = klawiatura.nextInt();
        if (liczba > 10 || liczba < 1){
            System.out.println("Nieprawodlowa liczba");
        }
        switch (liczba){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
        }
    }
}
