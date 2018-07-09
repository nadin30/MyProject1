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

    @FindBy(id = "to")
    private WebElement To;

    @FindBy(className = "sn_menu_title")
    private WebElement UserNAme;

    @FindBy(name = "subject")
    private WebElement SubjectField;

    @FindBy(id = "text")
    private WebElement TextLetter;

    @FindBy(name = "send")
    private WebElement Send_button;



    private WebElement LogButton;
    private WebElement CreateButton;
    private WebElement Inbox;
    private WebElement OpenLetter;
    private WebElement FromWho;

    public String UserName = "miroshka_n@i.ua";



    public void Login()
    {
        LogButton = driver.findElement(By.cssSelector("div.content.clear > form > p > input[type=\"submit\"]"));
        LoginField.sendKeys(this.UserName);
        PasswordField.sendKeys("nadin123");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LogButton.click();
    }

    public void Create_Mess() {
        CreateButton = driver.findElement(By.cssSelector("div.Left > p > a"));
        CreateButton.click();
    }

    public void EnterTo() {
        To.sendKeys("miroshka_n@i.ua");
        SubjectField.sendKeys("NewLetter");

    }

    public void EnterText() {

        TextLetter.sendKeys("Hello!");
        Send_button.click();

    }

    public String Check_Send() {
        Inbox = driver.findElement(By.cssSelector("div.content.clear > ul > li.new > a"));
        Inbox.click();
        OpenLetter = driver.findElement(By.cssSelector("div:nth-child(20) > a > span.frm"));
        OpenLetter.click();
        FromWho = driver.findElement(By.cssSelector("div.from > div.field_value > a"));
        return FromWho.getText();


    }




    public String CheckUser() {
        return  UserNAme.getText();
    }


}
