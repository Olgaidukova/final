package steps;

import pages.YandexSection;
import ru.yandex.qatools.allure.annotations.Step;

public class YandexSectionSteps {

    @Step("Наводим курсор на меню {0}")
    public void moveCursorToMenu(String menuName) throws InterruptedException {
        YandexSection yandexSection  = new YandexSection();
        yandexSection.moveCursorToMenuList(menuName);
    }

    @Step("Переходим на раздел {0}")
    public void clickToCategory(String subMenu) {
        new YandexSection().clickTopMenuSub(subMenu);
    }

    @Step("Ожидаем элемент {0}")
    public void waitSubMenuElement(String subMenuName) {
        new YandexSection().waitSubMenuElement(subMenuName);
    }

    @Step("Выбор геолокации {0}")
    public void clickOutOfGeo(String name){
        new YandexSection().clickGeo(name);
    }

    @Step("Ожидание элемента {0}")
    public void waitElements(String name){
        new YandexSection().waitElement(name);
    }


}
