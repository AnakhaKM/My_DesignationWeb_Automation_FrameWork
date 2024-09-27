package com.automation.test;

import com.automation.utils.AllureReportManager;
import com.automation.utils.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{

    @Test
    public void userCanSearchItem(){
        homePage.openWebsite();
        Assert.assertTrue(homePage.verifyUserIsOnHomePage());
        homePage.searchIconClick();
        homePage.chooseOnamSpecialDrops();
        Assert.assertTrue(homePage.verifyUserIsOnItem());
    }
    @Test(dataProvider ="Search data",dataProviderClass = DataProviderClass.class)
    public void userCanSearchItemBySendValue(String key){
        homePage.openWebsite();
        Assert.assertTrue(homePage.verifyUserIsOnHomePage());
        homePage.searchIconClick();
        homePage.searchValue(key);
    }
}
