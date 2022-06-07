package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
    private static WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillLoginPage(String email, String password) {
        WebElement emailInput= driver.findElement(By.className("form-control"));
        WebElement passwordInput =driver.findElement(By.name("password"));
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        driver.findElement(By.id("submit-login")).click();
        WebElement clickOnAddresses = driver.findElement(By.cssSelector("[title=Addresses]"));
        clickOnAddresses.click();
        WebElement clickOnCreateNewAddress = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/a"));
        clickOnCreateNewAddress.click();
    }

}


