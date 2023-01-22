import java.util.Scanner;

public class CustomScanner {
  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę, podaj swoje imię ");
       String name = scanner.nextLine();
        System.out.println("Cześć"+ name + "!");
    }
} */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę, podaj pierwsze liczby");
      int firstNumber = scanner.nextInt();

        System.out.println("Kwadrat tej liczby to:" +firstNumber*firstNumber);

    }
}