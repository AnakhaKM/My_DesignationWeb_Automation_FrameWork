package com.automation.steps;

import com.automation.pages.CartPage;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CartSteps {
    CartPage cartPage=new CartPage();
    @Then("verify items is added on cart")
    public void verify_items_is_added_on_cart() throws InterruptedException {
      cartPage.cartIconClick();
        ReportManager.log("cart page");
        ReportManager.attachScreenshot();
        Assert.assertEquals(cartPage.verifyItemAddedToCart(),"Total Items • 1");

    }
}
