package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ConfirmationPage extends Utility {
    //Computers
    By VerifyThankYou = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"); //2.35 Verify the Text “Thank You”
    By VerifySuccessfullyProcessed = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"); //2.36 Verify the message “Your order has been successfully processed!”
    By Continue4 = By.xpath("//button[contains(text(),'Continue')]");//2.37 Click on “CONTINUE”
    By VerufyWelcometoourstore = By.xpath("//h2[contains(text(),'Welcome to our store')]"); //2.37 Verify the text “Welcome to our store”

    //Computers
    public String getVerifyThankYou(){
        return getTextFromElement(VerifyThankYou);
    }
    public String getVerifySuccessfullyProcessed(){
        return getTextFromElement(VerifySuccessfullyProcessed);
    }
    public void clickOnContinue4(){
        clickOnElement(Continue4);
    }
    public String getVerufyWelcometoourstore(){
        return getTextFromElement(VerufyWelcometoourstore);
    }


    //Electronics
    By VerifyTextThankYou = By.xpath("//h1[contains(text(),'Thank you')]");//2.39 Verify the Text “Thank You”
    By Verifyordersuccessfully = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");//2.40 Verify the message “Your order has been successfully processed!”
    By Continue = By.xpath("//button[contains(text(),'Continue')]");//2.41 Click on “CONTINUE”

    //Electronics
    public String getVerifyTextThankYou(){
        return getTextFromElement(VerifyTextThankYou);
    }
    public String getVerifyordersuccessfully(){
        return getTextFromElement(Verifyordersuccessfully);
    }
    public void clickOnContinue(){
        clickOnElement(Continue);
    }
}
