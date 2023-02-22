public class Student {

    public String imię;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    public void PrzedstawSię () {
        System.out.println("Przedstaw się: " + imię + " " + nazwisko);
    }
    public void ZalogujSię () {
        System.out.println("Zaloguj się za pomoca" + nick);
    }
    public void PodajNrIndeksu () {
        System.out.println("Moj numer indeksu to: " + numerIndeksu);
    }
    public void PodajEmail () {
        System.out.println("Moj email to: " + email);
    }


}
