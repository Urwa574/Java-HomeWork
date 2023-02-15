package HomeWorkClass24;

public class WebDriverTester {
    public static void main(String[] args) {


        WebDriver[] webDrivers = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver w : webDrivers){
           w.openBrowser();
            w.closeBrowser();
            w.findElement();
            w.maximizeWindow();

        }
    }
}