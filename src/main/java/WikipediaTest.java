import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class WikipediaTest {

    @Test
    public void TestVoyager1(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.click();
        searchInput.sendKeys("Voyager 1");
        searchInput.sendKeys(Keys.ENTER);
        Wait<WebDriver> wait = new FluentWait(driver);
        // Question 10. The element should not be visible yet
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstHeading")));
        Assert.assertEquals("Voyager 1", driver.findElement(By.id("firstHeading")).getText());
        driver.close();
    }
}
