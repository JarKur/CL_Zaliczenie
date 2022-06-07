package ObjectPattern;

import Pages.LandingPage;
import Pages.LoginPage;
import Pages.NewAdressPage;
import Pages.VerificationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyStoreSteps {
    WebDriver driver;

    @ Given ("an open browser mystore-testlab.coderslab.pl")
    public void setUp()  {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        
    }
    @When ("Click on signin button")
    public void click_on_signin_button() {
        LandingPage onLandingPage = new LandingPage(driver);
        onLandingPage.clickOnSingIn();
    }
    @And    ("user loggs in with email {string} and password {string}")
    public void user_loggs_in_with_email_and_password(String string, String string2){
       LoginPage onLoginPage = new LoginPage(driver);
       onLoginPage.fillLoginPage(string, string2);
        }
    @Then       ("fill in formula address with {string} {string} {string} {string} {string} {string}")
    public void fill_in_formula_address_with(String string, String string2, String string3, String string4, String string5, String string6)  {
    NewAdressPage onNewAdressPage = new NewAdressPage(driver);
    onNewAdressPage.fillNewAdress(string,string2,string3,string4,string5,string6);
        }
    @And ("verify if your address has been added")
    public void AddressAdded(){
        VerificationPage onVeryficationPage = new VerificationPage(driver);
        onVeryficationPage.alertCheck();
    }


}