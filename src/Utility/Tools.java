package Utility;

import org.openqa.selenium.*;

import java.util.List;

public class Tools {
    public static void Wait(int sn) {

        try {
            Thread.sleep(sn * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void JScriptClick(WebElement e) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.driver;
        js.executeScript("arguments[0].click();", e); // js click : sayfanın içinden click
    }

    public static void JScriptScrool(WebElement e) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.driver;
        js.executeScript("arguments[0].scrollIntoView(true);", e);
    }


    public static int randomGenerator(int sinir) {
        return (int) (Math.random() * sinir);
    }

    public static boolean ListContainsString(List<WebElement> list, String wordToSearch) {
        boolean foundIn = false;

        for (WebElement element : list) {

            if (element.getText().toLowerCase().equals(wordToSearch.toLowerCase())) {
                foundIn = true;
            }
        }
        return foundIn;
    }


}
