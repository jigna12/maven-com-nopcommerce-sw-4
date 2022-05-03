package com.nopcommerce.testsuite;

import com.nopcommerce.pages.TopMenuPage;
import com.nopcommerce.testbase.TestBase;
import com.nopcommerce.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenuPage topmenu = new TopMenuPage();

    @Test
    public void verifyPageNavigation() {
        topmenu.clickcomputerTab();
        Assert.assertEquals("Computers", topmenu.verifycomputertext());

        topmenu.clickElectronicsTab();
        Assert.assertEquals("Electronics", topmenu.verifyelectronics());

        topmenu.clickApparelTab();
        Assert.assertEquals("Apparel",topmenu.verifyapparel());

        topmenu.clickOnDigitalDownloadsTab();
        Assert.assertEquals("Digital downloads",topmenu.verifyDigitalDownload());

        topmenu.clickBooksTab();
        Assert.assertEquals("Books",topmenu.verifybooks());

        topmenu.clickJewelry();
        Assert.assertEquals("Jewelry",topmenu.verifyjewelry());

        topmenu.clickGiftCards();
        Assert.assertEquals("Gift Cards",topmenu.verifygiftCards());
    }
}