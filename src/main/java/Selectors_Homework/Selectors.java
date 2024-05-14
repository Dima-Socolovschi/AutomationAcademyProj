package Selectors_Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectors {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        WebElement bulletCat = driver.findElement(By.xpath("//img[@name = 'bullet-cat']"));
        WebElement seriousCat = driver.findElement(By.xpath("//img[contains(@src, 'images/serious_cat.jpg') ]"));
        WebElement leninCat = driver.findElement(By.xpath("//img[contains(@src, 'images/lenin_cat.jpg') ]"));
        WebElement goldButton = driver.findElement(By.xpath("//button[text()='Gold']"));
        // Blocked site : https://the-internet.herokuapp.com/status_codes
        WebElement enableButton = driver.findElement(By.xpath("//button[text()='Enable']"));
        WebElement editButton = driver.findElement(By.xpath("//span[@class='tox-mbtn__select-label' and text()='Edit']"));
        WebElement submitButton = driver.findElement(By.xpath("//button[@value='Submit']"));
        WebElement youtubeChanel = driver.findElement(By.xpath("//a[text()='Find out how to automate these controls without XPath']"));
        WebElement firstCrush = driver.findElement(By.xpath("//input[@title='Enter your first crush name']"));
        WebElement johnSmith = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_2']"));
        WebElement yesRadio = driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']"));

        WebElement selector = driver.findElement(By.xpath("//select[@id='cars']"));
        Select sel = new Select(selector);
        sel.deselectByVisibleText("Saab");

        //Correct answers
        WebElement ansOne = driver.findElement(By.xpath("//input[@title='Search']"));
        WebElement ansTwo = driver.findElement(By.xpath("//input[@id='pass']/div/"));

        WebElement personalDataInputField = driver.findElement(By.xpath("//input[@placeholder='Verify your personal details']"));
        WebElement cityField = driver.findElement(By.xpath("//input[@placeholder='City']"));

    }
}
