package phase2.lesson1.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class redbusdemo {

    public static void main(String[] args) {
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the bus booking app
        driver.get("https://www.redbus.in/");
        
        // Find the elements for the source and destination fields
        WebElement source = driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/div/div"));
        WebElement destination = driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/div/div"));
        
        // Enter the source and destination values
        source.sendKeys("Hyderabad");
        destination.sendKeys("Danthalapalle");
        
        // Find the element for the date field
        WebElement date = driver.findElement(By.id("date"));
        
        // Enter the date value
        date.sendKeys("18/01/2024");
        
        // Find the element for the search button
        WebElement search = driver.findElement(By.id("search"));
        
        // Click on the search button
        search.click();
        
        // Wait for the results to load
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        // Find the element for the first available bus
        WebElement bus = driver.findElement(By.xpath("//*[@id=\"22219032\"]/div/div[2]/div[1]"));
        
        // Click on the bus
        bus.click();
        
        // Find the element for the seat selection
        WebElement seat = driver.findElement(By.xpath("//*[@id=\"rt_22219032\"]/div/div/div/div[2]/div[3]/div[2]/canvas"));
        
        // Select a seat from the dropdown
        Select seatSelect = new Select(seat);
        seatSelect.selectByIndex(1);
        
        
        // Find the element for the book button
        WebElement book = driver.findElement(By.id(""));
        
        // Click on the book button
        book.click();
        
        // Find the elements for the passenger details
        WebElement name = driver.findElement(By.id("name"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement phone = driver.findElement(By.id("phone"));
        
        // Enter the passenger details
        name.sendKeys("Test User");
        email.sendKeys("testuser@example.com");
        phone.sendKeys("1234567890");
        
        // Find the element for the payment button
        WebElement payment = driver.findElement(By.id("payment"));
        
        // Click on the payment button
        payment.click();
        
        // Close the browser
        driver.quit();
    }
}
