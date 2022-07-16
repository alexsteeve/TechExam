import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class MultipleTablesTest {

    @Test
    public void OpenTabsAndLookForImage(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        Actions action=new Actions(driver);
        action.keyDown(Keys.COMMAND)
                .click(driver.findElement(By.id("js-link-box-pt")))
                .keyUp(Keys.COMMAND)
                .build()
                .perform();
        action.keyDown(Keys.COMMAND)
                .click(driver.findElement(By.id("js-link-box-ja")))
                .keyUp(Keys.COMMAND)
                .build()
                .perform();
        action.keyDown(Keys.COMMAND)
                .click(driver.findElement(By.id("js-link-box-de")))
                .keyUp(Keys.COMMAND)
                .build()
                .perform();
        action.keyDown(Keys.COMMAND)
                .click(driver.findElement(By.id("js-link-box-fr")))
                .keyUp(Keys.COMMAND)
                .build()
                .perform();
        action.keyDown(Keys.COMMAND)
                .click(driver.findElement(By.id("js-link-box-zh")))
                .keyUp(Keys.COMMAND)
                .build()
                .perform();
        action.keyDown(Keys.COMMAND)
                .click(driver.findElement(By.id("js-link-box-ru")))
                .keyUp(Keys.COMMAND)
                .build()
                .perform();
        action.keyDown(Keys.COMMAND)
                .click(driver.findElement(By.id("js-link-box-es")))
                .keyUp(Keys.COMMAND)
                .build()
                .perform();
        action.keyDown(Keys.COMMAND)
                .click(driver.findElement(By.id("js-link-box-it")))
                .keyUp(Keys.COMMAND)
                .build()
                .perform();
        action.keyDown(Keys.COMMAND)
                .click(driver.findElement(By.id("js-link-box-pl")))
                .keyUp(Keys.COMMAND)
                .build()
                .perform();
        ArrayList<String> tabs2 = new ArrayList<> (driver.getWindowHandles());
        boolean imageFound = false;
        for (int i = 0; i <= 9; i++) {
            driver.switchTo().window(tabs2.get(i));
            try {
                driver.findElement(By.cssSelector("img[src='https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/WLE_BR.svg/80px-WLE_BR.svg.png']"));
                imageFound = true;
            } catch (NoSuchElementException e) {
            }
        }
        System.out.println(imageFound);
        for (int i = 0; i <= 9; i++) {
            driver.switchTo().window(tabs2.get(i));
            driver.close();
        }
    }
}
