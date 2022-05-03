package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {
    By ListTab = By.xpath("//a[contains(text(),'List')]");//2.4 Click on List View Tab
    //2.5 Click on product name “Nokia Lumia 1020” link
    By NokiaLumia1020 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]");

    public void clickonListViewTab(){
        clickOnElement(ListTab);
    }
    public void clickOnNokiaLumia1020(String nokialumia1020){
       sendTextToElement(NokiaLumia1020,nokialumia1020);
    }
}
