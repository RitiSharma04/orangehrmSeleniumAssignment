//package com.natwest;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.concurrent.TimeUnit; // Import TimeUnit class for implicit wait
//
//public class orangehrmSelenium {
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Desktop\\Natwest\\orangehrmSeleniumAssignment\\src\\test\\java\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//
//        // Set implicit wait time to 10 seconds
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//        // Find the username field and enter the username
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//
//        // Find the password field and enter the password
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
//
//        // Find and click the submit button
//        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//
//        // Maximize the window
//        driver.manage().window().maximize();
////        driver.findElement(By.className("oxd-main-menu-item")).click();
//        driver.findElement(By.xpath("//span[contains(text(), 'Claim')]")).click();
//    }
//}
package com.natwest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit; // Import TimeUnit class for implicit wait

public class orangehrmSelenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Desktop\\Natwest\\orangehrmSeleniumAssignment\\src\\test\\java\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // Set implicit wait time to 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Find the username field and enter the username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

        // Find the password field and enter the password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");

        // Find and click the submit button
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        // Maximize the window
        driver.manage().window().maximize();
//        driver.findElement(By.className("oxd-main-menu-item")).click();
        // Find the element using XPath and click on it
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Mayank");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Sharma");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@class, 'oxd-input')][contains(@class, 'oxd-input--active')]")).sendKeys("0408");
        driver.findElement(By.xpath("//span[contains(@class, 'oxd-switch-input')][contains(@class, 'oxd-switch-input--active')][contains(@class, '--label-right')][@data-v-8e4757dc='']"))
                .click();
        driver.findElement(By.xpath("//span[text()='Claim']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Mayank Sharma");

    }
}
