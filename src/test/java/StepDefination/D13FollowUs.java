package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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


}
