package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".icon.icon-hamburger")
    WebElement hamburger;

    @FindBy(xpath = "//span[text()='Kids']")
    WebElement kidsLink;

    @FindBy(xpath = "//span[text()='Printed T-shirts']")
    WebElement printTshirt;

    //    @FindBy(xpath = "//sticky-header/header/div[2]/search-modal/details/summary")
    @FindBy(xpath = "//summary[@aria-label='Search our site']")
    WebElement searchIcon;

    //    @FindBy(xpath = "//input[@id='Search-In-Modal-193']")
    @FindBy(xpath = "//input[@name='q']")
    WebElement searchField;

    @FindBy(xpath = "//ul//li[@class='menu-item is-parent']//ul//li[1]")
    WebElement chooseOnam;

    @FindBy(xpath = "//span[@class='small-hide']")
    WebElement filterOption;

    @FindBy(xpath = "//span[text()='Sort by']")
    WebElement sortField;

    @FindBy(xpath = "//div[@id='predictive-search-option-search-keywords']//button")
    WebElement searchBtn;

    public void openWebsite() {
        driver.get("https://www.mydesignation.com");
    }

    public boolean verifyUserIsOnHomePage() {
        return hamburger.isDisplayed();
    }

    public void clicksOnMenuBar() {
        hamburger.click();
    }

    public void kidsOption() {
        kidsLink.click();
        printTshirt.click();
    }

    public void searchIconClick() {
        searchIcon.click();

    }

    public void searchValue(String key) {
        searchField.sendKeys(key);
        searchBtn.click();

    }

    public void chooseOnamSpecialDrops() {
        chooseOnam.click();
    }

    public boolean verifyUserIsOnItem() {
        return filterOption.isDisplayed() && sortField.isDisplayed();
    }
}
