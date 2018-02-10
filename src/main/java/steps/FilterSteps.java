package steps;

import pages.FilterPage;
import ru.yandex.qatools.allure.annotations.Step;

public class FilterSteps {

    @Step("Нажимаем на расширенный фильтр")
    public void clickFilter(String name) {
        new FilterPage().clickFilter(name);
    }

    @Step("Выбираем параметры {0}")
    public void choiceCheckField(String checkFieldName) {
        new FilterPage().choiceCheckField(checkFieldName);
    }

    @Step("Заполняем поле {0} значением {1}")
    public void inputFieldFill(String name, String value) {
        new FilterPage().inputFieldFill(name, value);
    }

    @Step("Нажать на кнопку с текстом {0}")
    public void clickButtonText(String nameButton) {
        new FilterPage().clickButtonText(nameButton);
    }
}
