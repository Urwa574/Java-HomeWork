package HomeWorkClass24;

public interface WebDriver {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(),
    maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
void openBrowser();
void closeBrowser();
void maximizeWindow();
void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("open google chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close Chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize window");
    }

    @Override
    public void findElement() {
        System.out.println("element");
    }
}
class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("open firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize window");
    }

    @Override
    public void findElement() {
        System.out.println("firefox ");
    }
}