package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage {

    @FindBy(xpath = "//li[1]/div/use-animate/a/div/img[2]")
    WebElement firstItem;

    @FindBy(xpath = "//fieldset/label[1]")
    WebElement categoryChoose;

    @FindBy(name = "add")
    WebElement addToBtn;

    public void clicksOnFirstItem() {
        firstItem.click();
    }

    public void chooseCategory() {
        categoryChoose.click();
    }

    public void clickAddToButton() {
        addToBtn.click();
    }
}
