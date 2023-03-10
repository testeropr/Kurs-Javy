package drivers;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram przegladarke chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Zanjduje element w przegladarce Chrome");

    }
}
