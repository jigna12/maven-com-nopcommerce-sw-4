package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    HomePage homePage = new HomePage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    ShoppingPage shoppingPage = new ShoppingPage();
    RegisterPage registerPage = new RegisterPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    ConfirmationPage confirmationPage = new ConfirmationPage();


    @Test
    public void testnametextverified(){
        homePage.clickOnElectronics();
        homePage.clickOnCellPhone();
        homePage.getVerifyMessageCellPhone();
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException{
        homePage.clickOnElectronics();
        homePage.clickOnCellPhone();
        homePage.getVerifyMessageCellPhone();
        Assert.assertEquals("Cell phones",homePage.getVerifyMessageCellPhone());
        cellPhonePage.clickonListViewTab();
        cellPhonePage.clickOnNokiaLumia1020(Keys.ENTER + "1");

        Assert.assertEquals("Nokia Lumia 1020",nokiaLumiaPage.getVerifyText());
        Assert.assertEquals("$349.00",nokiaLumiaPage.getVerifyprice());
        nokiaLumiaPage.clickQuantity2();
        //nokiaLumiaPage.(Keys.chord(Keys.CONTROL, "a")), "2");
        nokiaLumiaPage.clickupdateqty();
        nokiaLumiaPage.clickOnAddToCart();
        Assert.assertEquals("The product has been added to your shopping cart", nokiaLumiaPage.getVerifyMsg());
        nokiaLumiaPage.clickOnCloseBarButton();
        nokiaLumiaPage.clickOnShoppingCart();

        Thread.sleep(3000);
        Assert.assertEquals("Shopping cart",shoppingPage.getVerifyMsgShoppingCart());
        Assert.assertEquals("(2)",shoppingPage.getVerifyQty2());
        Assert.assertEquals("$698.00", shoppingPage.getVerifyTotal());
        shoppingPage.clickOnCheckBoxMsg();
        shoppingPage.clockOnCheckBox();

        Assert.assertEquals("Welcome, Please Sign In!",registerPage.getverifywelCometext());
        registerPage.clickOnRegisterTab();
        Assert.assertEquals("Register",registerPage.getVerifyRegisterText());
        registerPage.enterFirstName("Krishna");
        registerPage.enterLastName("Patel");
        registerPage.enterEmailId("kag44@gmail.com");
        registerPage.enterPassword("kag123");
        registerPage.enterConfirmPassword("kag123");
        registerPage.clickOnRegister();
        Assert.assertEquals("Your registration completed",registerPage.getVerifyregistrationcompleted());
        registerPage.clickOnContinueTab();

        Assert.assertEquals("Shopping cart",shoppingPage.getVerifyShoppingcartText());
        shoppingPage.clickOnCheckBoxTab();
        shoppingPage.clickOnCheckOutTab();

        checkOutPage.enterCountryId1("United Kingdom");
        checkOutPage.enterCityName2("London");
        checkOutPage.enterAddress3("K P Road");
        checkOutPage.enterZipPostalCodea("KR12 2PA");
        checkOutPage.enterPhoneNumberb("07788665544");
        checkOutPage.clickOnContinueTab();
        checkOutPage.clickOnRadioButton2DA();
        checkOutPage.clickOnContinueTab1();
        checkOutPage.clickOnRadioButton1();
        checkOutPage.clickOnRadioButton2();
        checkOutPage.clickOnVisacreditcarddropdown();
        checkOutPage.enterCardholderName1("Krishna Patel");
        checkOutPage.enterCardNumber1("5555 5555 5555 4444");
        checkOutPage.enterExpireMonth1("02");
        checkOutPage.enterExpireYear1("2024");
        checkOutPage.enterCardCode1("1234");
        checkOutPage.clickOnContinueCheckOut();
        Assert.assertEquals("Payment Method: Credit Card",checkOutPage.getPaymentMethod());
        Assert.assertEquals("2nd Day Air",checkOutPage.getVerifyShippingMethod());
        Assert.assertEquals("$698.00",checkOutPage.getVerifyTotal1());
        checkOutPage.clickOnConfirm1();

        Assert.assertEquals("Thank you",confirmationPage.getVerifyTextThankYou());
        Assert.assertEquals("Your order has been successfully processed!",confirmationPage.getVerifyordersuccessfully());
        confirmationPage.clickOnContinue();
        Assert.assertEquals("Welcome to our store",homePage.getVerifytextWelcomestore());
        homePage.clickOnLogoutLink();
    }
}
