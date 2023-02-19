package Project2;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteDriver extends WebDriver {
    void navigate();
    @Override
    void open();
    @Override
    void close();
    @Override
    String getTitle();
}
interface TakeScreenShot extends RemoteDriver{
    void getScreenShot();
}
class ChromeDriver implements RemoteDriver{
    @Override
    public void navigate() {
        System.out.println("navigate google chrome");
    }

    @Override
    public void open() {
        System.out.println("Open the Google Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing the Google Chrome");
    }

    @Override
    public String getTitle() {
        return "pass";
    }
}
class FirefoxDriver implements RemoteDriver{
    @Override
    public void navigate() {
        System.out.println("navigate Firefox");
    }

    @Override
    public void open() {
        System.out.println("Open the Firefox");
    }

    @Override
    public void close() {
        System.out.println("Closing the Firefox");
    }

    @Override
    public String getTitle() {
        return "pass";
    }
}
class Safari implements RemoteDriver{
    @Override
    public void navigate() {
        System.out.println("navigate Safari");
    }

    @Override
    public void open() {
        System.out.println("Open the Safari");
    }

    @Override
    public void close() {
        System.out.println("Closing the Safari");
    }

    @Override
    public String getTitle() {
        return "pass";
    }
}
class Main{
    public static void main(String[] args) {
        WebDriver []webDriver={new ChromeDriver(),new FirefoxDriver(),new Safari()};
        for (WebDriver web:webDriver){
            web.open();
            web.close();
            web.getTitle();
        }
    }
}