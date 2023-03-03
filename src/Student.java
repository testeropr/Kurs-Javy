public class Student {

    public String imię;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    public static String nazwaUczelni = "AGH po zmianie";



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

    public static void infoUczelnia(){
        System.out.println("Moja uczelnia to "+ nazwaUczelni);
        druga();

        }
        public static void druga(){
            System.out.println("Jestem drugą metodą");
    }


}
