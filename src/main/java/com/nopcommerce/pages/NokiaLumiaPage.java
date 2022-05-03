package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class NokiaLumiaPage extends Utility {
    By VerifyText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");//2.6 Verify the text “Nokia Lumia 1020”
    By Verifyprice = By.className("price-value-20");//2.7 Verify the price “$349.00”
    By Quantity2 = By.xpath("//input[@id='product_enteredQuantity_20']");// 2.8 Change quantity to 2
    By Quantityupdate = By.xpath("//button[@id='add-to-cart-button-20']");
    By AddToCart = By.id("add-to-cart-button-20");//2.9 Click on “ADD TO CART” tab
    By VerifyMsg = By.xpath("//body/div[@id='bar-notification']/div[1]");// 2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    By CloseBarButton = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");//After that close the bar clicking on the cross button.
    By ShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");// 2.11 Then MouseHover on "Shopping cart"
    By GoToCart = By.xpath("//button[contains(text(),'Go to cart')]");//and Click on "GO TO CART" button.

    public String getVerifyText(){
        return getTextFromElement(VerifyText);
    }
    public String getVerifyprice(){
        return getTextFromElement(Verifyprice);
    }
    public void clickQuantity2(){
        clickOnElement(Quantity2);
        WebElement Qty=driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
        Qty.click();
        Qty.sendKeys(Keys.chord(Keys.CONTROL, "a"), "2");
    }
    public void clickupdateqty(){
         clickOnElement(Quantityupdate);   }

    public void clickOnAddToCart(){
        clickOnElement(AddToCart);
    }
    public String getVerifyMsg(){
        return getTextFromElement(VerifyMsg);
    }
    public void clickOnCloseBarButton(){
        clickOnElement(CloseBarButton);
    }
    public void clickOnShoppingCart(){
       mouseHoverToElement(ShoppingCart);
       clickOnElement(GoToCart);
    }

}
