// porownuja elementy rownania i zwaracaja logiczna wartosc (true/false)//
public class OperatoryPorownania {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        boolean result = secondNumber > firstNumber; // true

        System.out.println(result);
        System.out.println(firstNumber > secondNumber); //false
        System.out.println(firstNumber < secondNumber); //true
        System.out.println(firstNumber >= secondNumber); // false
        System.out.println(firstNumber <= secondNumber); // true
        System.out.println(firstNumber == secondNumber); // false
        System.out.println(firstNumber != secondNumber); // true


    }
}
