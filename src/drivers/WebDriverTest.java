package drivers;

public class WebDriverTest {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get();
        chromeDriver.findElementBy();
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get();
        firefoxDriver.findElementBy();
    }

        private static WebDriver getDriver (String name) throws NoValidBrowserName {
            if (name.equals("Chrome")) {
                return new ChromeDriver();

            } else if (name.equals("Firefox")) {
                return new FirefoxDriver();

            }
            throw new NoValidBrowserName();
        }

}

