package com.automation.steps;

import com.automation.pages.ItemPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ItemSteps {
    ItemPage itemPage=new ItemPage();
    @And("user clicks on first item")
    public void userClicksOnFirstItem() {
        itemPage.clicksOnFirstItem();
    }

    @When("choose the category options")
    public void choose_the_category_options() {
       itemPage.chooseCategory();
    }

    @When("user clicks on add to cart button")
    public void user_clicks_on_add_to_cart_button() {
      itemPage.clickAddToButton();
    }

}
