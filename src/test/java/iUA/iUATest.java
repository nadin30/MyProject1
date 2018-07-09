package iUA;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;



public class iUATest {
    public static WebDriver driver;
    public static iUA iUA;

    @BeforeClass
    public static void SetUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        iUA = new iUA(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.i.ua");
    }


    @Test
    public void Login() {
        iUA.Login();
    }

    @Test
    public void CheckName() {
        Assert.assertEquals(iUA.UserName, iUA.CheckUser());
    }

    @Test
    public void Create() {
        iUA.Login();
        iUA.Create_Mess();
        iUA.EnterTo();
        iUA.EnterText();
    }

    @Test
    public void CheckLetter() {
        iUA.Login();
        Assert.assertEquals(iUA.UserName, iUA.Check_Send());
    }

    @AfterClass
    public static void tearDown()
    {
        driver.quit();
    }




}