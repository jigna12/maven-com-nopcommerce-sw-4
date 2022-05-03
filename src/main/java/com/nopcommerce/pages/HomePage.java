package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //Computers
    By computers = By.linkText("Computers");//Click on Computer Menu
    By desktop = By.linkText("Desktops");//Click on Desktop
    By electronics = By.linkText("Electronics");//1.1 Mouse Hover on “Electronics”Tab
    By cellPhone = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"); // 1.2 Mouse Hover on “Cell phones” and click
    By VerifyMessage = By.linkText("Cell phones"); // 1.3 Verify the text “Cell phones”

    public void clickcomputerTab(){
        clickOnElement(computers);
    }
    public void clickDesktopTab(){
        clickOnElement(desktop);
    }
    public void clickOnElectronics() {
        mouseHoverToElement(electronics);
    }
    public void clickOnCellPhone(){
        mouseHoverToElementAndClick(cellPhone);
    }
    public String getVerifyMessageCellPhone() {
        return getTextFromElement(VerifyMessage);
    }

    //Electronics
    By VerifytextWelcomestore = By.xpath("//h2[contains(text(),'Welcome to our store')]");//2.42 Verify the text “Welcome to our store”
    By LogoutLink = By.xpath("//a[contains(text(),'Log out')]");//2.43 Click on “Logout” link

    public String getVerifytextWelcomestore(){
        return getTextFromElement(VerifytextWelcomestore);
    }
    public void clickOnLogoutLink(){
        clickOnElement(LogoutLink);
    }
    }





