package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.YandexSection;

public class ScenarioSteps {
    MainSteps mainSteps = new MainSteps();
    YandexSectionSteps yandexSectionSteps = new YandexSectionSteps();
    FilterSteps filterSteps = new FilterSteps();
    TVSteps tvSteps = new TVSteps();
    HeadphonesSteps headphonesSteps = new HeadphonesSteps();

    @When("^выбран пункт меню  \"(.+)\"$")
    public void clickToTab(String name) {
        mainSteps.clickToTab(name);
    }

    @Then("^наводим курсор на раздел \"(.+)\"$")

    public void moveCursorToMenu(String menuName) throws InterruptedException {
        yandexSectionSteps.moveCursorToMenu(menuName);
    }

    @When("^переходим на раздел \"(.+)\"$")
    public void clickToCategory(String subMenu) {
        yandexSectionSteps.clickToCategory(subMenu);
    }

    @Then("^нажимаем на фильтр \"(.+)\"$")
    public void clickFilter(String name) {
        filterSteps.clickFilter(name);
    }

    @When("^заполняем поле \"(.+)\" значением \"(.+)\"$")
    public void inputBoxFill(String name, String value) {
        filterSteps.inputFieldFill(name, value);
    }

    @When("^выбираем параметры фильтра \"(.+)\"$")
    public void choiceCheckField(String checkFieldName) throws InterruptedException {
        filterSteps.choiceCheckField(checkFieldName);
    }

    @Then("^нажимаем на кнопку \"(.+)\"$")
    public void clickButtonText(String nameButton) {
        filterSteps.clickButtonText(nameButton);
    }

    @When("^сравниваем количество товаров на странице, ожидаем \"(.+)$")
    public void checkCountProductOnPage(int count) {
        tvSteps.checkCountProductOnPage(count);
    }

    @Then("^выбираем элемент под номером \"(.+)\" из списка$")
    public void getNameTV(int index) {
        tvSteps.getNameTv(index);
    }


    @When("^ищем по запомненному значению$")
    public void setInputSearch() throws InterruptedException {
        tvSteps.sendKeyInputSearch();
    }

    @Then("^нажимаем поиск$")
    public void clickSearchButton() {
        tvSteps.clickSearchButton();
    }

    @Then("^проверяем на соответствие названия")
    public void checkProduct() {
        tvSteps.checkProductTitle();
    }

    @When("^выбран пункт \"(.+)\"$")
    public void clickTab(String name) {
        mainSteps.clickToTab(name);
    }

    @When("^появился элемент \"(.+)\"$")
    public void waitElement(String name){
        yandexSectionSteps.waitElements(name);
    }

    @Then("^выбран элемент \"(.+)\"$")
    public void clickOutOfGeo(String name){
        yandexSectionSteps.clickOutOfGeo(name);
    }


    @When("^наводим курсор на меню \"(.+)\"$")

    public void moveCursorMenu(String menuName) throws InterruptedException {
        yandexSectionSteps.moveCursorToMenu(menuName);
    }

    @When("^сравниваем количество элементов на странице, ожидаем \"(.+)$")
    public void checkCountProductOnPageEarPhone(int count) {
        headphonesSteps.checkCountProductOnPage(count);
    }

    @Then("^выбираем элемент под \"(.+)\" из списка$")
    public void getName(int index) {
        tvSteps.getNameTv(index);
    }

    @Then("^ищем по запомненному названию")
    public void setInputSearchEarPhone() throws InterruptedException {
        headphonesSteps.sendKeyInputSearch();
    }

    @When("^нажимаем поиск для наушников")
    public void clickSearchButtonEarPhone() {
        headphonesSteps.clickSearchButton();
    }

    @Then("^проверяем на соответствие")
    public void checkProductEarPhone() {
        headphonesSteps.checkProductTitle();
    }

    @When("^переходим на первые наушники по списку$")
    public  void clickFirstEarPhone(){
        headphonesSteps.clickFirstEarPhone();
    }
}




