package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAdressPage {
    private WebDriver driver;

    public NewAdressPage(WebDriver driver){

        this.driver=driver;
    }
    public void fillNewAdress(String alias,String address,String city,String postalcode,String phone) {
        driver.findElement(By.cssSelector("#footer_account_list > li:nth-child(4) > a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/a")).click();

        WebElement aliasInput = driver.findElement(By.name("alias"));
        WebElement addressInput = driver.findElement(By.name("address1"));
        WebElement cityInput = driver.findElement(By.name("city"));
        WebElement postalcodeInput = driver.findElement(By.name("postcode"));
        WebElement phoneInput = driver.findElement(By.name("phone"));

        aliasInput.sendKeys(alias);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        postalcodeInput.sendKeys(postalcode);
        phoneInput.sendKeys(phone);

        WebElement selectCountry = driver.findElement(By.name("id_country"));
        selectCountry.click();
        WebElement chooseUK = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/section/div[10]/div[1]/select/option[2]"));
        chooseUK.click();


    }
}
