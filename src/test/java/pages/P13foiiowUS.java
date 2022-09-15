package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P13foiiowUS {
    WebDriver driver;
    public P13foiiowUS(WebDriver driver){
        this.driver= driver;
    }
    public WebElement facebookLogo(){
        By Faceboook = By.name("Facebook");
        WebElement Facebook = driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a"));
        return Facebook;
    }
    public void navhome() throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
    }
    public void navface() throws InterruptedException {
        driver.navigate().to("https://www.facebook.com/nopCommerce");
        Thread.sleep(3000);
    }
    public void current() throws InterruptedException {
        driver.navigate().to("https://www.facebook.com/nopCommerce");
        Thread.sleep(3000);
    }
    public void scrolll() throws InterruptedException {
        JavascriptExecutor jss =(JavascriptExecutor) driver;
        WebElement Element=driver.findElement(By.cssSelector("li[class='facebook']"));
        jss.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(3000);
    }
}
