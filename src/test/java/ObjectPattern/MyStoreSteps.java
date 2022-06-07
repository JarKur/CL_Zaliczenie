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

public class MyStoreSteps {
    WebDriver driver;

    @Given ("an open browser {string}")
    public void setUp(String url) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @When ("Click on signin button")
    public void LandingPage() {
        LandingPage onLandingPage = new LandingPage(driver);
        onLandingPage.clickOnSingIn();
    }
    @And    ("user loggs in with email {string} and password {string}")
    public void LoginPage(String email, String password){
       LoginPage onLoginPage = new LoginPage(driver);
       onLoginPage.fillLoginPage(email, password);
        }
    @Then       ("fill in formula address with {string} {string} {string} {string} {string} {string}")
    public void NewAdressPage(String alias,String address,String city,String postalcode,String phone)  {
    NewAdressPage onNewAdressPage = new NewAdressPage(driver);
    onNewAdressPage.fillNewAdress(alias,address,city,postalcode,phone);
        }
    @And ("verify if your address has been added")
    public void AddressAdded(){
        VerificationPage onVeryficationPage = new VerificationPage(driver);
        onVeryficationPage.alertCheck();
    }


}