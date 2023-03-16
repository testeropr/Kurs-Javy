package exceptions;

import java.util.Scanner;

public class ExceptionsCheck {
    //pobierz wiek od uzytkownika jezeli bedzie mniejszy od 0 to wyrzuci wyjatek InvalidAgeException
    // jezeli mamy 18 >= to mozemy wypisac ze jestes pelnoletni
    public static void main(String[] args) throws InvalidAgeException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        if (age<0){
            throw new InvalidAgeException("your age is no valid");
        }
        if (age>=18){
            System.out.println("Jestes pelnoletni");
        } else{
            System.out.println("Nie jestes pelnoletni ");
        }

    }
}
