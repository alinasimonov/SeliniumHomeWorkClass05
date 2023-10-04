package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
            driver.manage().window().maximize();
            WebElement selectDream= driver.findElement(By.xpath("//div[@class='btn btn-primary dropdown-toggle']"));
            selectDream.click();
            WebElement selectDestination = driver.findElement(By.linkText("japan"));
            selectDestination.click();
            Thread.sleep(2000);
            driver.close();
    }
}
