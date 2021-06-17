package YNAP.com.PageObjects;

import YNAP.com.BaseClassPackage.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

import static net.bytebuddy.matcher.ElementMatchers.isEquals;
import static org.hamcrest.core.Is.is;

public class Homepage extends BaseClass {

    //For registration

    @FindBy(linkText = "Sign In")
    WebElement signInBtn;
    @FindBy(id = "logonId")
    WebElement emailBox;
    @FindBy(id = "hasAccount1")
    WebElement radiobtn;
    @FindBy(id = "registration.logonPassword")
    WebElement passwordBox;
    @FindBy(id = "registration.firstName")
    WebElement firstNameBox;
    @FindBy(id = "registration.lastName")
    WebElement lastNameBox;
    @FindBy(id = "registration.maMarketingConsent3")
    WebElement noThanksRadioButton;
    @FindBy(xpath = "//*[@id=\"loginRegistration\"]/div[4]/button")
    WebElement registerBtn;

    public void aseertHomepage(){
        String URL = driver.getCurrentUrl();
        Assert.assertThat(URL,is("https://www.theoutnet.com/en-gb/"));
    }
    public void clickSignInBtn(){
        signInBtn.click();
    }
    public void enterEmail(){
        emailBox.click();
        emailBox.sendKeys("test123@yahoo.co.uk");
    }
    public void clickRradioBtn(){
        radiobtn.click();
    }
    public void enterPassword(){
        passwordBox.click();
        passwordBox.sendKeys("test1234");
    }
    public void enterFAndLname(){
        firstNameBox.click();
        firstNameBox.sendKeys("Chirag");
        lastNameBox.click();
        lastNameBox.sendKeys("Patel");
    }
    public void noThanksRadioBtn(){
        noThanksRadioButton.click();
    }
    public void clickRegisterBtn(){
        registerBtn.click();
    }

    //For Superbrand

    @FindBy(xpath = "//*[@id=\"header\"]/div/nav/div/ul/li[1]/a")
    WebElement superbrandBtn;
    @FindBy(xpath = "//*[@id=\"header\"]/div/nav/div/ul/li[1]/span/div[1]/div/div[2]/div/div[1]/ul[1]/li[5]/a")
    WebElement coatBtn;
    @FindBy(xpath = "/html/body/main/div/div[2]/div[1]/div/div/div[1]/h2")
    WebElement coatPageHeading;

    public void clickOnAnySuperbrand(){

        Actions actions1 = new Actions(driver);
        actions1.moveToElement(superbrandBtn).perform();
        sleep(3000);
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(coatBtn).click().perform();
        sleep(3000);
    }

    public void assertforCoatPage(){
        String expectedCoatPageHeading = coatPageHeading.getText();
        Assert.assertThat(expectedCoatPageHeading,is("COATS"));
    }

} //End of Class
