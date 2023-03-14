import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args)  {
        try {
            System.out.println("Before reading file");
            readFiles ("C:\\Users\\Daria\\Desktop\\Java\\src\\testsssst.txt");

        } catch (FileNotFoundException e) {
            System.out.println("wyjatek zostal wyrzucony");
            System.out.println(e.getMessage());;
        } finally {
            System.out.println("Closing file");

        }
    }

    public static void readFiles(String path) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
