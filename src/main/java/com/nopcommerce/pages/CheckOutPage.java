package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    //Computers
    By FirstName = By.xpath("//input[@id='BillingNewAddress_FirstName']"); //2.22 Fill the all mandatory field
    By LastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By Email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By CountryId = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By City = By.xpath("//input[@id='BillingNewAddress_City']");
    By Address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By ZipPostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By PhoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By Continue1 = By.xpath("//button[@class='button-1 new-address-next-step-button']");  //2.23 Click on “CONTINUE”
    By RadioButton = By.xpath("//label[contains(text(),'Next Day Air ($0.00)')]");//2.24 Click on Radio Button “Next Day Air($0.00)”
    By Continue2 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");  // 2.25 Click on “CONTINUE”
    By RabutCreditCard1 = By.xpath("//label[contains(text(),'Credit Card')]");// 2.26 Select Radio Button “Credit Card”
    By RabutCreditCard2 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By MasterCard = By.xpath("//select[@id='CreditCardType']");// 2.27 Select “Master card” From Select credit card dropdown
    By CardholderName = By.xpath("//input[@id='CardholderName']");// 2.28 Fill all the details
    By CardNumber = By.xpath("//input[@id='CardNumber']");
    By ExpireMonth = By.xpath("//select[@id='ExpireMonth']");
    By ExpireYear = By.xpath("//select[@id='ExpireYear']");
    By CardCode = By.id("CardCode");
    By Continue3 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");// 2.29 Click on “CONTINUE”
    //2.30 Verify “Payment Method” is “Credit Card”
    By VerifyPaymentMethodCC = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]");
    //2.32 Verify “Shipping Method” is “Next Day Air”
    By VerifyShippingMethodNDA = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]");
    By VerifyTotal = By.xpath("//tbody/tr[1]/td[6]/span[1]");//2.33 Verify Total is “$2,950.00”
    By Confirm = By.xpath("//button[contains(text(),'Confirm')]");// 2.34 Click on “CONFIRM”

    //Computers
    public void enterFirstName(String firstName){
        sendTextToElement(FirstName,firstName);
    }
    public void enterLastName(String lastName) {
        sendTextToElement(LastName, lastName);
    }
    public void enterEmailId(String email){
        sendTextToElement(Email,email);
    }
    public void enterCountryId(String countryId){
        sendTextToElement(CountryId, countryId);
    }
    public void enterCityName(String city){
        sendTextToElement(City,city);
    }
    public void enterAddress(String address){
        sendTextToElement(Address,address);
    }
    public void enterZipPostalCode(String zipPostalCode){
        sendTextToElement(ZipPostalCode,zipPostalCode);
    }
    public void enterPhoneNumber(String phonenumber){
        sendTextToElement(PhoneNumber,phonenumber);
    }
    public void clickOnContinue(){
        clickOnElement(Continue1);
    }
    public void clickOnRadioButton(){
        clickOnElement(RadioButton);
    }
    public void clickOnContiunue2(){
        clickOnElement(Continue2);
    }
    public void clickOnRadioButtonCreditCard(){
        clickOnElement(RabutCreditCard1);
        clickOnElement(RabutCreditCard2);
    }
    public void clickOnMasterCard(String mcard){
        selectByVisibleTextFromDropDown(MasterCard,mcard);
    }
    public void enterCardholderName(String cardholderName){
        sendTextToElement(CardholderName,cardholderName);
    }
    public void enterCardNumber(String cardNumber){
        sendTextToElement(CardNumber,cardNumber);
    }
    public void enterExpireMonth(String expireMonth){
        sendTextToElement(ExpireMonth,expireMonth);
    }
    public void enterExpireYear(String expireYear){
        sendTextToElement(ExpireYear, expireYear);
    }
    public void enterCardCode(String cardCode){
        sendTextToElement(CardCode,cardCode);
    }
    public void clickOnContinue1(){
        clickOnElement(Continue3);
    }
    public String getVerifyPaymentMethodCC(){
        return getTextFromElement(VerifyPaymentMethodCC);
    }
    public String getVerifyShippingMethodNDA(){
        return getTextFromElement(VerifyShippingMethodNDA);
    }
    public String getVerifyTotal(){
        return getTextFromElement(VerifyTotal);
    }
    public void clickOnConfirm() {
        clickOnElement(Confirm);}

    //Electronics
    By CountryIdx = By.xpath("//select[@id='BillingNewAddress_CountryId']");//2.27 Fill the Mandatory fields
    By Cityy = By.xpath("//input[@id='BillingNewAddress_City']");
    By Addressz = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By ZipPostalCodea = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By PhoneNumberb = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By ContinueTab = By.xpath("//button[@onclick='Billing.save()']");
    By RadioButton2DA = By.xpath("//label[contains(text(),'2nd Day Air ($0.00)')]");
    By ContinueTab1 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");//2.28 Click on “CONTINUE”
    By RadioButton1 = By.xpath("//label[contains(text(),'Credit Card')]");//2.29 Click on Radio Button “2nd Day Air ($0.00)”
    By RadioButton2 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");// 2.30 Click on “CONTINUE”
    By Visacreditcard = By.xpath("//select[@id='CreditCardType']");//2.31 Select Radio Button “Credit Card”
    By CardholderName1 = By.xpath("//input[@id='CardholderName']");//2.32 Select “Visa” From Select credit card dropdown
    By CardNumber1 = By.xpath("//input[@id='CardNumber']");// 2.33 Fill all the details
    By ExpireMonth1 = By.xpath("//select[@id='ExpireMonth']");
    By ExpireYear1 = By.xpath("//select[@id='ExpireYear']");
    By CardCode1 = By.id("CardCode");
    By ContinueCheckOut = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");//2.34 Click on “CONTINUE”CHECKOUT”
    //2.35 Verify “Payment Method” is “Credit Card”
    By PaymentMethod = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]");
    //2.36 Verify “Shipping Method” is “2nd Day Air”
    By VerifyShippingMethod = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]");
    By VerifyTotal1 = By.xpath("//tbody/tr[1]/td[6]/span[1]");//2.37 Verify Total is “$698.00”
    By Confirm1 = By.xpath("//button[contains(text(),'Confirm')]");// 2.38 Click on “CONFIRM”

    //Electronics
    public void enterCountryId1(String countryIdx){
        sendTextToElement(CountryIdx, countryIdx);
    }
    public void enterCityName2(String cityy){
        sendTextToElement(Cityy,cityy);
    }
    public void enterAddress3(String addressz){
        sendTextToElement(Addressz,addressz);
    }
    public void enterZipPostalCodea(String zipPostalCodea){
        sendTextToElement(ZipPostalCodea,zipPostalCodea);
    }
    public void enterPhoneNumberb(String phonenumberb){
        sendTextToElement(PhoneNumberb,phonenumberb);
    }
    public void clickOnContinueTab(){ clickOnElement(ContinueTab);}
    public void clickOnRadioButton2DA(){ clickOnElement(RadioButton2DA);}
    public void clickOnContinueTab1(){ clickOnElement(ContinueTab1);}
    public void clickOnRadioButton1(){ clickOnElement(RadioButton1);}
    public void clickOnRadioButton2(){ clickOnElement(RadioButton2);}
    public void clickOnVisacreditcarddropdown(){ selectByVisibleTextFromDropDown(Visacreditcard,"Visa");}
    public void enterCardholderName1(String cardholderName1){ sendTextToElement(CardholderName1,cardholderName1);}
    public void enterCardNumber1(String cardNumber1){ sendTextToElement(CardNumber1,cardNumber1);}
    public void enterExpireMonth1(String expireMonth1){ sendTextToElement(ExpireMonth1,expireMonth1);}
    public void enterExpireYear1(String expireYear1){ sendTextToElement( ExpireYear1,expireYear1);}
    public void enterCardCode1(String cardCode1){ sendTextToElement(CardCode1,cardCode1);}
    public void clickOnContinueCheckOut(){ clickOnElement(ContinueCheckOut);}
    public String getPaymentMethod(){ return getTextFromElement(PaymentMethod);}
    public String getVerifyShippingMethod(){ return getTextFromElement(VerifyShippingMethod);}
    public String getVerifyTotal1(){ return getTextFromElement(VerifyTotal1);}
    public void clickOnConfirm1(){ clickOnElement(Confirm1);}
}
