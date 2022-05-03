package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    //Computers
    By verifywelCometext = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"); //2.20 Verify the Text “Welcome, Please Sign In!”
    By checkOutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");//2.21Click on “CHECKOUT AS GUEST” Tab

    //Computers
    public String getverifywelCometext() {
        return getTextFromElement(verifywelCometext);
    }
    public void clickOncheckOutAsGuest() {
        clickOnElement(checkOutAsGuest);
    }

    //Electronics
    By VerifyWelComeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");//2.17 Verify the Text “Welcome, Please Sign In!”
    By RegisterTab = By.xpath("//button[contains(text(),'Register')]");// 2.18 Click on “REGISTER” tab
    By VerifyRegisterText = By.xpath("//h1[contains(text(),'Register')]");// 2.19 Verify the text “Register”
    By FirstName = By.xpath("//input[@id='FirstName']");//2.20 Fill the mandatory fields
    By LastName = By.xpath("//input[@id='LastName']");
    By Email = By.xpath("//input[@id='Email']");
    By Password = By.xpath("//input[@id='Password']");
    By ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By Register = By.xpath("//button[@id='register-button']");//2.21 Click on “REGISTER” Button
    By Verifyregistrationcompleted = By.xpath("//div[contains(text(),'Your registration completed')]");// 2.22 Verify the message “Your registration completed”
    By Continue5 = By.xpath("//a[contains(text(),'Continue')]");//2.23 Click on “CONTINUE” tab

    //Electronics
    public String getVerifyWelComeText() {
        return getTextFromElement(VerifyWelComeText);
    }
    public void clickOnRegisterTab(){
        clickOnElement(RegisterTab);
    }

    public String getVerifyRegisterText() {
        return getTextFromElement(VerifyRegisterText);
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(FirstName, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(LastName, lastName);
    }

    public void enterEmailId(String email) {
        sendTextToElement(Email, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(Password, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(ConfirmPassword, confirmPassword);
    }

    public void clickOnRegister() {
        clickOnElement(Register);
    }

    public String getVerifyregistrationcompleted() {
        return getTextFromElement(Verifyregistrationcompleted);
    }

    public void clickOnContinueTab() {
        clickOnElement(Continue5);
    }
}
