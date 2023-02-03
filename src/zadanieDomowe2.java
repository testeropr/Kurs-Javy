import java.util.Scanner;
//pobierz dwie liczby od klienta i wykonaj wszystkie porownania//
public class zadanieDomowe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę, podaj pierwsza liczbe ");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę, podaj drugą liczbę");
        int secondNumber =  scanner.nextInt();
        System.out.println("a>b:" + (firstNumber > secondNumber ));
        System.out.println("a<b:" + (firstNumber < secondNumber));
        System.out.println("a>=b:"+ (firstNumber >= secondNumber));
        System.out.println("a<=b:" + (firstNumber <= secondNumber));
        System.out.println("a==b:" + (firstNumber == secondNumber));
        System.out.println("a!=b:" + (firstNumber != secondNumber));
    }



}