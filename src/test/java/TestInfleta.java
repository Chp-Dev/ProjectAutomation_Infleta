import helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInfleta {
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        DesiredCapabilities caps = new DesiredCapabilities();
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://infleta.com.ar/");
        Helpers helpers = new Helpers();
        helpers.SleepSeconds(4);
    }

    @org.testng.annotations.Test
    public void prueba(){
        driver.findElement(By.name("actualValue")).sendKeys("10000");
        driver.findElement(By.name("financiadoValue")).sendKeys("13000");
        driver.findElement(By.name("financiadoValue")).sendKeys(Keys.ENTER);
        Helpers helpers = new Helpers();
        helpers.SleepSeconds(4);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
