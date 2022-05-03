package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    /*1. create class "TopMenuTest"
            1.1 create method with name "selectMenu" it has one parameter name "menu" of  type string
	1.2 This method should click on the menu whatever name is passed as parameter.
	1.3. create the @Test method name verifyPageNavigation.use selectMenu method to select the Menu and click on it and verify the page navigation.*/

    By digitalDownloadsTab = By.linkText("Digital downloads");

    public void clickcomputerTab() {selectMenu("Computers");}
    public String verifycomputertext() {
        return getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
    }
    public void clickElectronicsTab(){
        selectMenu("Electronics");}
    public String verifyelectronics(){
        return getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
    }
    public void clickApparelTab(){
        selectMenu("Apparel");}
    public String verifyapparel() {
        return getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
    }
    public void clickOnDigitalDownloadsTab() {
        clickOnElement(digitalDownloadsTab);
    }

//   public void clickDigitalDownloadTab(){
//        selectMenu("Digital download");}
    public String verifyDigitalDownload() {
        return getTextFromElement(By.linkText("Digital downloads"));
    }
    public void clickBooksTab(){
        selectMenu("Books");}
    public String verifybooks() {
        return getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
    }
    public void clickJewelry(){
        selectMenu("Jewelry");}
    public String verifyjewelry() {
        return getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
    }
    public void clickGiftCards(){
        selectMenu("Gift Cards");}
    public String verifygiftCards() {
        return getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
    }
}

