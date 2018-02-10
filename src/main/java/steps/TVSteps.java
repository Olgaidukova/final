package steps;

import pages.TVPage;
import ru.yandex.qatools.allure.annotations.Step;

public class TVSteps {
    @Step("Сравниваем на количество товаров на странице. Ожидаем {0}")
    public void checkCountProductOnPage(int count) {
        new TVPage().checkCountProductOnPage(count);
    }

    String expectedName;

    @Step("Выбираем элемент {0}(отсчет с 0)")
    public String getNameTv(int index) {
        return expectedName = new TVPage().getElement(index);
    }

    @Step("Вводим значение в поиск")
    public void sendKeyInputSearch() throws InterruptedException {
        new TVPage().sendKeysExpectedName(expectedName);
    }

    @Step("Нажимаем поиск")
    public void clickSearchButton() {
        new TVPage().clickSearchButton();
    }

    @Step("Проверяем на совпадение товара")
    public void checkProductTitle() {
        new TVPage().checkProductName(expectedName);
    }
}

