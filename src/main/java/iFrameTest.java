import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameTest {

    @Test
    public void TestGoAndBackInAFrame(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e");
        int total=driver.findElements(By.xpath("html/body/a/img")).size();
        System.out.println(total);
        // this command answer the question number 2
        driver.switchTo().defaultContent();
        driver.close();
    }
}
