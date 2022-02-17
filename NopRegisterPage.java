package NopCommerceDemo.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NopRegisterPage {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.className("gender")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Neha");
        driver.findElement(By.id("LastName")).sendKeys("Brahmbhatt");

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
        Select select= new Select(day);
        select.selectByIndex(16);
        Select select1 = new Select(month);
        select1.selectByValue("2");
        Select select2 = new Select(year);
        select2.selectByVisibleText("2022");

        driver.findElement(By.id("Email")).sendKeys("abcd@abc.com");
        driver.findElement(By.id("Company")).sendKeys("unify");
        driver.findElement(By.id("Password")).sendKeys("1234abcd");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("1234abcd");
        driver.findElement(By.id("register-button")).submit();

        Thread.sleep(3000);
        
        driver.quit();

}}

