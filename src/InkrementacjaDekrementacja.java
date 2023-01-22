public class InkrementacjaDekrementacja {
    public static void main(String[] args) {

        int a = 0;
        System.out.println("wartość a:" +a); //0
        int b = ++a;
        System.out.println("wartość b:" +b); //1
        System.out.println("wartość a:" +a); //1
        int c = a++;
        System.out.println("wartość c" +c); //1
        System.out.println("wartość a" +a); //2

        // Dekrementacja zmniejszenie watości o jeden
        int d = 0;
        System.out.println("wartość d" +d); //0
        int e = d --;
        System.out.println("wartość e" +e); //0
        System.out.println("wartość d" +d); // -1
        int f = --d;
        System.out.println("wartość f" +f); //-2
        System.out.println("wartość d" +d); //-2



    }

}
