// stwórz 3 obiekty klassy student. Przypisz wartosci do pol. Stworz tablice i dodaj studentow w tablicy.
// przejdz przez studentow w tablicy i wywolaj wszystkie 4 metody.


import java.util.Scanner;

public class StudentChecker {


    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;

        Student Adam = new Student();
        Adam.imię = "Adam";
        Adam.nazwisko = "Adamski";
        Adam.numerIndeksu = 231321;
        Adam.email = "admski@gameil.com";
        Adam.nick = "AdamskiA";
        String uczelniaAdama = Adam.nazwaUczelni;
        Student.infoUczelnia();
        Adam.infoUczelnia();



        Student Kasia = new Student();
        Kasia.imię = "Kasia";
        Kasia.nazwisko = "Adamska";
        Kasia.numerIndeksu = 231322;
        Kasia.email = "kasiaadmska@gameil.com";
        Kasia.nick = "AdamskaK";
        Kasia.infoUczelnia();


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
        String imię= "Kasia";
        Scanner scanner = new Scanner(System.in);
        imię.strip();



    }
}
