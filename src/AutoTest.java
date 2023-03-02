public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto ("mercedes","klasa S",2021,1000 );


        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto("Audi","A5",2020,0);


        audi.jedz();
        audi.hamuj();
        audi.info();

        Auto noname = new Auto(null,null,0,0);
        noname.jedz();
        noname.hamuj();
        noname.info();

    }
}
