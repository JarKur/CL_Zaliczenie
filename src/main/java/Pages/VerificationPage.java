package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerificationPage {
    private WebDriver driver;

    public VerificationPage(WebDriver driver) {this.driver=driver;}
    public void alertCheck(){
        WebElement alert = driver.findElement(By.className("alert alert-success"));
        alert.isDisplayed();
    }



}
