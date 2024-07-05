package com.appium.example.test;

import com.appium.example.annotation.Feature;
import org.testng.annotations.Test;

import static com.appium.example.constant.Feature.SWIPE;

public class SwipeTest extends BaseTest {
    @Feature(SWIPE)
    @Test(description = "Verify that 'You found me!!!' log can be found at the bottom of the screen'")
    public void testYouFoundMeLogo() {
        screen().getNavigationBarScreen()
                .tapOnSwipeIcon();
        screen().getSwipeScreen()
                .scrollToFindMeLogo();
    }
}
