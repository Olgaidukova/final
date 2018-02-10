package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class FilterPage {

    @FindBy(xpath = "//div[@class='n-filter-panel-aside__show-more']")
    WebElement filter;

    @FindBy(xpath = "//div[contains(@class,'n-filter-block__item')]")
    WebElement title;

    @FindBy(xpath = "//span[@class='input__box']")
    WebElement inputField;

    @FindBy(xpath = "//div[contains(@class,'n-filter-panel-extend')]")
    WebElement buttonText;

    public FilterPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    public void clickFilter(String name) {
        filter.click();
    }


    public void choiceCheckField(String checkBoxName){
        title.findElement(By.xpath("//label[text()='" + checkBoxName + "']")).click();
    }

    public void inputFieldFill(String name, String value){
        switch (name){
            case("Цена от"):
                inputField.findElement(By.xpath("//input[@name='glf-pricefrom-var']")).sendKeys(value);
                break;
            case ("Цена до"):
                inputField.findElement(By.xpath("//input[@name='glf-priceto-var']")).sendKeys(value);
                break;
            default:
                throw new AssertionError("Поле '"+ name + "' не найдено на странице");
        }
    }

    public void clickButtonText(String nameButton){
        buttonText.findElement(By.xpath("//a[contains(@class,'button button_size_l')]")).click();
    }


}
