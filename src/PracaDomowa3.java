import java.util.Scanner;

/* Zapytaj użytkownika o wiek.
W przypadku gdy ma mniej niż 18 lat wypisz na ekranie informacje ze nie moze kupic alkoholu.
Gdy ma więcej niż 18 lat to podziekuj za zakupy
*/
public class PracaDomowa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj Swoj wiek");
        int number = scanner.nextInt();
        if (number<18 && number >=0) {
            System.out.println("Pzykro mi nie możesz kupić alkoholu");
        } else if (number<0) {
            System.out.println("Podaj wartośc poprawną");
        } else {
            System.out.println("Dziękuję za zakupy");

        }
        {

        }

    }
}
