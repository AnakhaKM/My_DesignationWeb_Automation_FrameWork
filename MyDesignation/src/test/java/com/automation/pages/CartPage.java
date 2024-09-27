package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(css = ".icon.icon-cart")
    WebElement cartIcon;

    @FindBy(xpath = "//h2[@class='upcart-header-text' and text()='Total Items • 1']")
    WebElement TotalItems;

    public void cartIconClick() throws InterruptedException {
        cartIcon.click();
        Thread.sleep(3000);
    }

    public String verifyItemAddedToCart() {
        return TotalItems.getText();
    }
}
