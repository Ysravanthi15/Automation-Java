package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://maya.adityauniversity.in/");

        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Login']")).click();
        Thread.sleep(4000);
        JavascriptExecutor raju=(JavascriptExecutor) driver;
        raju.executeScript("window.scrollBy(0,200)");
        driver.findElement(By.name("roll_no")).sendKeys("Sravanthi");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abc");

        driver.quit();
    }
}


