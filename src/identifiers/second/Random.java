package identifiers.second;

import identifiers.first.Parent;

public class Random {
    // klasa  w innej paczce nie ma dostepu do pol i metod private oraz domyslne deafult bez identyfikatora oraz protectec
    public void testIdentifier(){
        Parent parent= new Parent();
        System.out.println(parent.first);
        parent.firstMethod();


    }
}
