package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import static steps.BaseSteps.getDriver;

public class MainPage {
    Wait<WebDriver> wait = new WebDriverWait(getDriver(), 10, 1000);

    @FindBy(xpath = "//div[contains(@class,\"home-tabs stream-control\")]")
    WebElement yandexMarket;

    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void clickToTab(String subMenu) {
        yandexMarket.findElement(By.xpath("//a[contains(text(),'" + subMenu + "')]")).click();

    }
}
