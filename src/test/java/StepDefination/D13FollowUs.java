package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import pages.P01registerationpage;
import pages.P13foiiowUS;

import java.util.ArrayList;

import static StepDefination.Hooks.driver;

public class D13FollowUs {

    P13foiiowUS followUS = new P13foiiowUS(driver);
    SoftAssert softAssert;

    @When("user navigates to homepage to try follow us option")
    public void navigationToHome() throws InterruptedException{
        followUS.navhome();
        Thread.sleep(6000);
        followUS.scrolll();
    }
    @And("user clicks on facebook logo under follow us label")
    public void clickOnFacebookLogo() throws InterruptedException {
        followUS.facebookLogo().click();

        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
       // driver.close();
        //driver.findElement(By.className("bdao358l")).sendKeys(Keys.CONTROL,Keys.NUMPAD1);
     ;
    }
    @And("user clicks on twitter logo under follow us label")
    public void clickOntwitterLogo() throws InterruptedException {
        followUS.navhome();
        followUS.scrolll();

        followUS.twitterlogo().click();
        Thread.sleep(15000);
        ;
    }
    @And("user clicks on third logo under follow us label")
    public void clickOnthirdLogo() throws InterruptedException {
        //followUS.navhome();
        driver.close();

        followUS.thirdlogo().click();
        Thread.sleep(15000);

    }
    @And("user clicks on youtube logo under follow us label")
    public void clickOnyoutubeLogo() throws InterruptedException {
        //followUS.navhome();
        followUS.youtube().click();
        Thread.sleep(15000);
        ;
    }

    @Then("a new tab directing to facebook page should be opened")
    public void validFacebookRedirection(){
        String expectUrl = "https://www.facebook.com/nopCommerce";
        String actualUrl = driver.getCurrentUrl();
        softAssert = new SoftAssert();
        softAssert.assertEquals(expectUrl, actualUrl);
        softAssert.assertAll();
    }
    @Then("a new tab directing to twitter page should be opened")
    public void validtwitterRedirection(){
        String expectUrl = "https://twitter.com/nopCommerce";
        String actualUrl = driver.getCurrentUrl();
        softAssert = new SoftAssert();
        softAssert.assertEquals(expectUrl, actualUrl);
        softAssert.assertAll();
    }
    @Then("a new tab directing to third page should be opened")
    public void validthirdRedirection(){
        String expectUrl = "https://demo.nopcommerce.com/news/rss/1";
        String actualUrl = driver.getCurrentUrl();
        softAssert = new SoftAssert();
        softAssert.assertEquals(expectUrl, actualUrl);
        softAssert.assertAll();
    }
    @Then("a new tab directing to youtube page should be opened")
    public void validyoutubeRedirection(){
        String expectUrl = "https://www.youtube.com/user/nopCommerce1";
        String actualUrl = driver.getCurrentUrl();
        softAssert = new SoftAssert();
        softAssert.assertEquals(expectUrl, actualUrl);
        softAssert.assertAll();
    }

}
