import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

public class Pay {

 @Test
    public void BuyStripe(){

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Derek\\Desktop\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    driver.get("https://dev.netpeaksoftware.com/login");
    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    driver.manage().window().fullscreen();
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/form/div/label/span[2]/input")).sendKeys("derek.netpeak@gmail.com");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/form/label/span[2]/input")).sendKeys("sniper666ghost");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/form/button")).click();
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"dashboard-view\"]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[1]")));
driver.get("https://dev.netpeaksoftware.com/buy");

driver.findElement(By.xpath("/html/body/div[4]/form/section[4]/div/div[1]/button")).click();
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/section[2]/div[5]/div/form/section/button")));
driver.findElement(By.xpath("/html/body/div[4]/section[2]/div[5]/div/form/section/button")).click();
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/section/p[3]/img")));
driver.findElement(By.xpath("//*[@id=\"header-menu\"]/a")).click();
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header-menu\"]/div[2]/ul/li[4]/a")));
driver.findElement(By.xpath("//*[@id=\"header-menu\"]/div[2]/ul/li[4]/a")).click();

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/form/section[4]/div/div[1]/button")));
  driver.findElement(By.xpath("/html/body/div[4]/form/section[4]/div/div[1]/button")).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/span/a")));
  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/span/a")).click();}

@Test
public static  void BuyPaypal(){

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Derek\\Desktop\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    driver.get("https://dev.netpeaksoftware.com/login");
    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    driver.manage().window().fullscreen();
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/form/div/label/span[2]/input")).sendKeys("derek.netpeak@gmail.com");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/form/label/span[2]/input")).sendKeys("sniper666ghost");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/form/button")).click();
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"dashboard-view\"]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[1]")));
    driver.get("https://dev.netpeaksoftware.com/buy");

    driver.findElement(By.xpath("/html/body/div[4]/form/section[4]/div/div[1]/button")).click();
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"pf-method-block\"]/div/div[2]/label")));
driver.findElement(By.xpath("//*[@id=\"pf-method-block\"]/div/div[2]/label")).click();

wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/section[2]/div[5]/div/form/section/button")));
    long original = System.currentTimeMillis();
    while (true) {
        if (System.currentTimeMillis() - original >= 4000) {
            break;
        }
    }

driver.findElement(By.xpath("/html/body/div[4]/section[2]/div[5]/div/form/section/button")).click();
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]")));
    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("snickers.netpeak-buyer@gmail.com");
driver.findElement(By.xpath("//*[@id=\"btnNext\"]")).click();

}

}
