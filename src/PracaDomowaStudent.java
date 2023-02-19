// stwórz 3 obiekty klassy student. Przypisz wartosci do pol. Stworz tablice i dodaj studentow w tablicy.
// przejdz przez studentow w tablicy i wywolaj wszystkie 4 metody.


public class PracaDomowaStudent {

    public static void main(String[] args) {
        Student Adam = new Student();
        Adam.imię = "Adam";
        Adam.nazwisko = "Adamski";
        Adam.numerIndeksu = 231321;
        Adam.email = "admski@gameil.com";
        Adam.nick = "AdamskiA";

        Student Kasia = new Student();
        Kasia.imię = "Kasia";
        Kasia.nazwisko = "Adamska";
        Kasia.numerIndeksu = 231322;
        Kasia.email = "kasiaadmska@gameil.com";
        Kasia.nick = "AdamskaK";


        Student Piotr = new Student();
        Piotr.imię = "Piotr";
        Piotr.nazwisko = "Kowalski";
        Piotr.numerIndeksu = 231323;
        Piotr.email = "piotrkowalski@gameil.com";
        Piotr.nick = "KowalskiP";

        Student [] students = new Student [3];
        students[0]= Adam;
        students[1] = Kasia;
        students[2]=Piotr;

        for (int i =0; i < students.length; i ++) {
            students[i].PodajEmail();
            students[i].PodajNrIndeksu();
            students[i].PrzedstawSię();
            students[i].ZalogujSię();

        }



    }
}
