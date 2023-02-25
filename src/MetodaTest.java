public class MetodaTest {

    public static void main(String[] args) {
        metody metody = new metody();
      /*  metody.pobierzWynik();
        int result = metody.pobierzWynik();
        int result2= result*2;
        System.out.println("Rezultat przed mnozeniem to: " + result);
        System.out.println("Rezultat po mnozeniu to: "+ result2);*/
     /*   metody.policzWynikPara(2);
        metody.policzWynikPara(100);
        metody.policzWynikPara(23);
*/
        int result = metody.add(2,3, "Hello" );
        System.out.println(metody.add(2,6, "Hello2"));
        System.out.println(result);


    }
}
