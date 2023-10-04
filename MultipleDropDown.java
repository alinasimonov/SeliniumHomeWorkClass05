package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement dd = driver.findElement(By.xpath("//Select[@id='multi-select']"));
        //create an obj of the select class
        Select sel=new Select(dd);
        //select
        sel.selectByVisibleText("Texas");
        sel.selectByValue("Florida");
        Thread.sleep(2000);
        //deselect
        sel.deselectByVisibleText("Texas");
        // check wether the dropdown is multiselect or not
        System.out.println( sel.isMultiple());


    }
}
