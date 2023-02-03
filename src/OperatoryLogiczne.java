public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = 2 > 1;
        boolean secondValue = 2 < 1;
        boolean thirdValue =  false;
        boolean fourthValue = true;
    // && -> true wtedy gdy wyrazenia skladowe sa rowne true
        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && fourthValue); // true
        System.out.println(secondValue && thirdValue); // false
        // || lub -> true gdy jedno wyrazenie skladowe jest rowne true
        System.out.println(firstValue || secondValue); // true
        System.out.println(firstValue || fourthValue); // true
        System.out.println(secondValue || thirdValue); // false
        // ! negacja - zwraca wartosc przeciwna do wyrazenia przed ktorym sie znajduje
        System.out.println(!firstValue); // zwroci nam wartosc odwrtona false
        System.out.println(!thirdValue); // true
        System.out.println(!(firstValue && secondValue)); // true
    }
}
