import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealLoginVerification {
    public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();

        
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.snapdeal.com");

        
        WebElement signInButton = driver.findElement(By.xpath("//div[contains(@class, 'accountInner')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(signInButton).perform();
        signInButton.click();

       
        WebElement emailField = driver.findElement(By.id("userName"));
        emailField.sendKeys("sample@gmail.com"); 
        WebElement continueButton = driver.findElement(By.id("checkUser"));
        continueButton.click();

        WebElement passwordField = driver.findElement(By.id("j_password"));
        passwordField.sendKeys("snap@123");  
        WebElement loginButton = driver.findElement(By.id("submitLogin"));
        loginButton.click();

        
            Thread.sleep(5000);  
        }

        
        
        if (driver.getPageSource().contains(verificationMessage)) {
            System.out.println("Login successful. Verification message found.");
        } else {
            System.out.println("Login failed. Verification message not found.");
        }

     
        driver.quit();
    }
}
