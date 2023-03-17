package drivers;

public class WebDriverTest {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = getDriver(DriverType.FIREFOX);
        } catch (NoValidBrowserName noValidBrowserName) {
            noValidBrowserName.printStackTrace();
        }

        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

        /*Driver chromeDriver = new ChromeDriver();
        chromeDriver.get();
        chromeDriver.findElementBy();
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get();
        firefoxDriver.findElementBy();*/
    }

        private static WebDriver getDriver (DriverType type) throws NoValidBrowserName {
            if (type==DriverType.CHROME) {
                return new ChromeDriver();

            } else if (type==DriverType.FIREFOX) {
                return new FirefoxDriver();

            }
            throw new NoValidBrowserName();
        }

}

