package drivers;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram przegladarke firefox");

    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element w przegladarce Firefox");

    }
}
