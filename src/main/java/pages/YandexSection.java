package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import static steps.BaseSteps.getDriver;

public class YandexSection {

    Actions actions;

    @FindBy(xpath = "//ul[@class=\"topmenu__list\"]")
    WebElement menulist;

    @FindBy(xpath = "//div[@class = \"topmenu__subwrap\"]")
    WebElement subMenu;

    @FindBy(xpath = "//div[contains(@class,'n-region-notification')]//span[contains(text(),'Да, спасибо')]")
    WebElement geo;

    public YandexSection() {
        PageFactory.initElements(getDriver(), this);
        actions = new Actions(getDriver());
    }

    public void moveCursorToMenuList(String menuName) throws InterruptedException {
        actions.moveToElement(menulist.findElement(
                By.xpath("//a[text()='" + menuName + "']")
        )).build().perform();
        Thread.sleep(500);
    }

    public void clickTopMenuSub(String subName) {
        subMenu.findElement(By.xpath("//a[contains(text(),'" + subName + "')]")).click();
    }

    public void waitSubMenuElement(String subName) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf
                (subMenu.findElement(By.xpath("//a[text()='" + subName + "']"))));
    }

     public void clickGeo(String geoName) {
         geo.click();
    }


     public void waitElement(String name){
        Wait<WebDriver> wait = new WebDriverWait(getDriver(), 30, 1000);
        wait.until(ExpectedConditions.visibilityOf(geo));
    }


}
