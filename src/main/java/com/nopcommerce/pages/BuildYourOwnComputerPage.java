package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {
    By verifyBuildyourowncomputer = By.xpath("//h1[contains(text(),'Build your own computer')]");//2.5 Verify the Text "Build your own computer"
    By E2200 = By.xpath("//option[contains(text(),'2.2 GHz Intel Pentium Dual-Core E2200')]");//2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    By GB8 = By.xpath("//option[contains(text(),'8GB')]"); //2.7.Select "8GB [+$60.00]" using Select class.
    By HDDradio = By.xpath("//input[@id='product_attribute_3_7']"); //2.8 Select HDD radio "400 GB [+$100.00]"
    By OSradio = By.xpath("//input[@id='product_attribute_4_9']");  //2.9 Select OS radio "Vista Premium [+$60.00]"
    By MicroSotfTotal = By.xpath("//input[@id='product_attribute_5_12']");//2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    By verifyprice = By.xpath("//span[@id='price-value-1']");//2.11 Verify the price "$1,475.00"
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");//2.12 Click on "ADD TO CARD" Button.
    By topgreenbarVerify = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");//2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    By closebarcrossbutton  = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");//After that close the bar clicking on the cross button.
    By MouseHovertoShoppingcart = By.xpath("//span[contains(text(),'Shopping cart')]");//2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By cilckGoToCart = By.xpath("//button[contains(text(),'Go to cart')]");//2.15 Verify the message "Shopping cart"

    public String getverifyBuildyourowncomputer(){
        return getTextFromElement(verifyBuildyourowncomputer);
    }
    public void clickOnE2200(){
        clickOnElement(E2200);
    }
    public void clickOnGB8(){
        clickOnElement(GB8);
    }
    public void clickOnHDDradio(){
        clickOnElement(HDDradio);
    }
    public void clickOSradio(){
        clickOnElement(OSradio);
    }
    public void clickOnMicroSoftTotal(){
        clickOnElement(MicroSotfTotal);
    }
    public String getverifyprice(){
        return getTextFromElement(verifyprice);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String gettopgreenbarVerify(){
        return getTextFromElement(topgreenbarVerify);
    }
    public void clickOnclosebarcrossbutton(){
        clickOnElement(closebarcrossbutton);
    }
    public void MouseHovertoShoppingcart(){
        mouseHoverToElementAndClick(MouseHovertoShoppingcart);
    }
    public void cilckGoToCart(){
        clickOnElement(cilckGoToCart);
    }



}

