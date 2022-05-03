package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    DeskTopPage deskTopPage = new DeskTopPage();
    HomePage homePage = new HomePage();
    BuildYourOwnComputerPage buildPage = new BuildYourOwnComputerPage();
    ShoppingPage shoppingPage = new ShoppingPage();
    RegisterPage registerPage = new RegisterPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    ConfirmationPage confirmationPage = new ConfirmationPage();

    @Test
    public void Testname(){
        homePage.clickcomputerTab();
        homePage.clickDesktopTab();
        deskTopPage.clickOnAtoZText();

    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickcomputerTab();
        homePage.clickDesktopTab();
        deskTopPage.clickOnZtoAText();

        Thread.sleep(2000);
        deskTopPage.clickOnAddToCart();
        buildPage.getverifyBuildyourowncomputer();
        Assert.assertEquals("Build your own computer",buildPage.getverifyBuildyourowncomputer());
        buildPage.clickOnE2200();
        buildPage.clickOnGB8();
        buildPage.clickOnHDDradio();
        buildPage.clickOSradio();
        buildPage.clickOnMicroSoftTotal();
        buildPage.getverifyprice();
        buildPage.clickOnAddToCart();
        buildPage.gettopgreenbarVerify();
        Assert.assertEquals("The product has been added to your shopping cart",buildPage.gettopgreenbarVerify());
        buildPage.clickOnclosebarcrossbutton();
        buildPage.MouseHovertoShoppingcart();
        buildPage.cilckGoToCart();
        shoppingPage.getverifyShoppingcart();
        Assert.assertEquals("Shopping cart",shoppingPage.getverifyShoppingcart());
        shoppingPage.clickOnChangetheQTY2();
        shoppingPage.clickOnVerifyTotalQty2();
        shoppingPage.clickOnIagreewithtermsofservice();
        shoppingPage.clickOnCheckOut();

        registerPage.getverifywelCometext();
        registerPage.clickOncheckOutAsGuest();
        checkOutPage.enterFirstName("Krishna");
        checkOutPage.enterLastName("Patel");
        checkOutPage.enterEmailId("kag21@gmail.com");
        checkOutPage.enterCountryId("kag21@gmail.com");
        checkOutPage.enterCityName("London");
        checkOutPage.enterAddress("K P Road");
        checkOutPage.enterZipPostalCode("KR12 2PA");
        checkOutPage.enterPhoneNumber("07788665544");

        Thread.sleep(2000);
        checkOutPage.clickOnContinue();
        checkOutPage.clickOnRadioButton();
        checkOutPage.clickOnContiunue2();
        checkOutPage.clickOnRadioButtonCreditCard();

        Thread.sleep(2000);
        checkOutPage.clickOnMasterCard("Master card");
        checkOutPage.enterCardholderName("Krishna Patel");
        checkOutPage.enterCardNumber("5555 5555 5555 4444");
        checkOutPage.enterExpireMonth("02");
        checkOutPage.enterExpireYear("2024");
        checkOutPage.enterCardCode("1234");
        checkOutPage.clickOnContinue1();
        checkOutPage.getVerifyPaymentMethodCC();
        checkOutPage.getVerifyShippingMethodNDA();
        checkOutPage.getVerifyTotal();
        checkOutPage.clickOnConfirm();

        confirmationPage.getVerifyThankYou();
        confirmationPage.getVerifySuccessfullyProcessed();
        confirmationPage.clickOnContinue4();
        confirmationPage.getVerufyWelcometoourstore();
    }
}
