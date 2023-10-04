package org.example.uitests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class FramesTests extends BaseTestClass {

    @Test(dataProvider = "dataProviderFrames")
    public void switchToFramHWCommon(String frameMain, String subFrame, String text) {
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        if (!frameMain.equals("")) {
            driver.switchTo().frame(frameMain);
        }

        driver.switchTo().frame(subFrame);
        String body = driver.findElement(By.xpath("//body")).getText();
        Assert.assertEquals(body, text);

    }

    @DataProvider
    public Object[] dataProviderFrames () {
        return new Object[][] {
                {"", "frame-bottom", "BOTTOM"},
                {"frame-top", "frame-left", "LEFT"},
                {"frame-top", "frame-middle", "MIDDLE"},
                {"frame-top", "frame-right", "RIGHT"}
        };
    }

}