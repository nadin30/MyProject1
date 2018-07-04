package iUA;

import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class iUA {

    public WebDriver driver;

    public iUA(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
    }

    @FindBy(name = "login")
    private WebElement LoginField;

    @FindBy(name = "pass")
    private WebElement PasswordField;

    @FindBy(className = "sn_menu_title")
    private WebElement UserNAme;

    private WebElement LogButton;

    public String UserName = "futuretest@i.ua";

    public void Login()
    {
        LogButton = driver.findElement(By.cssSelector("div.content.clear > form > p > input[type=\"submit\"]"));
        LoginField.sendKeys(this.UserName);
        PasswordField.sendKeys("qwerty123456");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LogButton.click();
    }

    public String CheckUser() {
        return  UserNAme.getText();
    }


}
