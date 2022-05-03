package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingPage extends Utility {
    //Computers
    By verifyShoppingcart = By.xpath("//h1[contains(text(),'Shopping cart')]"); //2.15 Verify the message "Shopping cart"
    By ChangetheQTY2 = By.className("qty-input");//2.16 Change the Qty to "2" and Click on "Update shopping cart"
    By VerifyTotalQty2 = By.xpath("//button[@id='updatecart']");//2.17 Verify the Total
    By Iagreewithtermsofservice = By.xpath("//label[contains(text(),'I agree with the terms of service and I adhere to ')]");//2.18 click on checkbox “I agree with the terms of service”
    By CheckOut = By.xpath("//button[@id='checkout']"); //2.19 Click on “CHECKOUT”

    //Computers
    public String getverifyShoppingcart(){
        return getTextFromElement(verifyShoppingcart);
    }
    public void clickOnChangetheQTY2(){
        clickOnElement(ChangetheQTY2);
    }
    public void clickOnVerifyTotalQty2(){
        clickOnElement(VerifyTotalQty2);
    }
    public void clickOnIagreewithtermsofservice(){
        clickOnElement(Iagreewithtermsofservice);
    }
    public void clickOnCheckOut(){
        clickOnElement(CheckOut);
    }

    //Electronics
    By VerifyMsgShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");//2.12 Verify the message "Shopping cart"
    By VerifyQty2 = By.xpath("//span[contains(text(),'2')]");// 2.13 Verify the quantity is 2
    By VerifyTotal = By.xpath("//span[contains(text(),'$698.00') and @class='product-subtotal']");// 2.14 Verify the Total $698.00
    By CheckBoxMsg = By.xpath("//input[@id='termsofservice']");// 2.15 click on checkbox “I agree with the terms of service”
    By CheckBox = By.xpath("//button[@id='checkout']");//2.16 Click on checkout
    By VerifyShoppingcartText = By.xpath("//h1[contains(text(),'Shopping cart')]");//2.24 Verify the text “Shopping cart”
    By checkBox = By.xpath("//input[@id='termsofservice']");//2.25 click on checkbox “I agree with the terms of service”
    By checkOut = By.xpath("//button[@id='checkout']");// 2.26 Click on “CHECKOUT”

    //Electronics
    public String getVerifyMsgShoppingCart(){
        return getTextFromElement(VerifyMsgShoppingCart);
    }
    public String getVerifyQty2(){
        return getTextFromElement(VerifyQty2);
    }
    public String getVerifyTotal(){
        return getTextFromElement(VerifyTotal);
    }
    public void clickOnCheckBoxMsg(){
        clickOnElement(CheckBoxMsg);
    }
    public void clockOnCheckBox(){
        clickOnElement(CheckBox);
    }
    public String getVerifyShoppingcartText(){
        return getTextFromElement(VerifyShoppingcartText);
    }
    public void clickOnCheckBoxTab(){
        clickOnElement(checkBox);
    }
    public void clickOnCheckOutTab(){
        clickOnElement(checkOut);
    }
}
