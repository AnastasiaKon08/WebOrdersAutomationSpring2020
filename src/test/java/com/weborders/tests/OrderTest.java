package com.weborders.tests;

import com.weborders.pages.LoginPage;
import com.weborders.pages.SmartBear;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderTest extends TestBase{

    @Test(description = "Create random Order")
    public void createOrder(){
        LoginPage loginPage = new LoginPage();
        SmartBear orderPage = new SmartBear();

        loginPage.login();
        loginPage.clickOnOrder();

        orderPage.selectProduct("ScreenSaver");
        orderPage.enterQuantity("12");
        orderPage.enterPricePerUnit("28");
        orderPage.enterDiscount("10");
        orderPage.clickToCalculate();

        Assert.assertEquals(orderPage.getTotal(), "216", "Total is not matching");

        orderPage.enterCustomerName("Test User");
        orderPage.enterStreet("5th Ave");
        orderPage.enterCity("New York");
        orderPage.enterState("New York");
        orderPage.enterZip("130008");

        orderPage.selectCard("Visa");
        orderPage.enterCardNumber("123456789654333");
        orderPage.enterExpirationDate("04/23");

        orderPage.clickOnProcessButton();

















    }
}
