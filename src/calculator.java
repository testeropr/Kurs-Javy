import java.util.Scanner;

public class calculator {
    // napisz program, ktory poprosi użytkownika 2 liczb, a następnie wykonana na nich podstawowe operacje matematyczne //

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę, podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber/secondNumber;
        int mod = firstNumber%secondNumber;
        System.out.println("Wynik dodawania:" + addition);
        System.out.println("Wynik odejmowania:" + subtraction);
        System.out.println("Wynik mnożenia:" + multiplication);
        System.out.println("Wynik dzielenia:" + division);
        System.out.println("Wynik modulo:" + mod);

    }

    }


