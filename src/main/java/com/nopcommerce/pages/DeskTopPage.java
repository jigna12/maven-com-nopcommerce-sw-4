package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class DeskTopPage extends Utility {

    By nameZtoA = By.xpath("//option[contains(text(),'Name: Z to A')]");
    By nameAtoZ = By.xpath("//option[contains(text(),'Name: A to Z')]");//2.3 Select Sort By position "Name: A to Z
    By addtocart = By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]"); //2.4 Click on "Add To Cart"


    public void clickOnZtoAText() {
         clickOnElement(nameZtoA);
    }
    public void clickOnAtoZText(){
         clickOnElement(nameAtoZ);
    }
    public void clickOnAddToCart(){
        clickOnElement(addtocart);
    }

}
