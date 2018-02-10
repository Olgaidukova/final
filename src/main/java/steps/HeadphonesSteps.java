package steps;

import pages.HeadphonesPage;
import ru.yandex.qatools.allure.annotations.Step;

public class HeadphonesSteps {
    String expectedName;

    @Step("Сравниваем на количество товаров на странице. Ожидаем {0}")
    public void checkCountProductOnPage(int count) {
        new HeadphonesPage().checkCountProductOnPage(count);
    }

    @Step("Выбираем элемент {0}(отсчет с 0)")
    public String getNameEarPhone(int index) {
        return expectedName = new HeadphonesPage().getElement(index);
    }

    @Step("Вводим значение в поиск")
    public void sendKeyInputSearch() throws InterruptedException {
        new HeadphonesPage().sendKeysExpectedName(expectedName);
    }

    @Step("Нажимаем поиск")
    public void clickSearchButton() {
        new HeadphonesPage().clickSearchButton();
    }

    @Step("Проверяем на совпадение товара")
    public void checkProductTitle() {
        new HeadphonesPage().checkProductName(expectedName);
    }

    @Step("переход на первые наушники")
    public void clickFirstEarPhone(){
        new HeadphonesPage().clickFirstEarPhone();
    }
}

