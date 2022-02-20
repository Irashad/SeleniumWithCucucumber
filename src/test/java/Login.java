import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
    @Test
    public void login()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\resha\\gitpul\\SeleniumWithCucucumber\\driver\\chromedriver97469271.exe");
        var chromeDriver = new ChromeDriver();
        chromeDriver.get("https://amazon.in");
    }
}
