import java.util.Scanner;

public class CalkulatorTest {

        // napisz program, ktory poprosi użytkownika 2 liczb, a następnie wykonana na nich podstawowe operacje matematyczne //

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Proszę, podaj pierwszą liczbę");
            int firstNumber = scanner.nextInt();
            System.out.println("Proszę podaj drugą liczbę");
            int secondNumber = scanner.nextInt();

            Calkulator calkulator=new Calkulator();


            System.out.println("Wynik dodawania:" + calkulator.addition(firstNumber,secondNumber));
            System.out.println("Wynik odejmowania:" +calkulator.subtraction(firstNumber,secondNumber) );
            System.out.println("Wynik mnożenia:" + calkulator.multiplication(firstNumber,secondNumber) );
            System.out.println("Wynik dzielenia:" + calkulator.division(firstNumber,secondNumber));
            System.out.println("Wynik modulo:" + calkulator.mod(firstNumber,secondNumber));

        }

    }



