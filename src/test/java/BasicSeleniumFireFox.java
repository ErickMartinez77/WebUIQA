import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSeleniumFireFox {
    FirefoxDriver firefoxDriver;
    @BeforeEach
    public void openFireFox(){
        System.setProperty("webdriver.gecko.driver","src/test/resources/driver/geckodriver.exe");
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("http://todo.ly/");
    }

    @Test
    public void goToGoogle() throws InterruptedException{
        // img login
        firefoxDriver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img")).click();
        // set text email
        firefoxDriver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("upb_api@api.com");
        // set test pwd
        firefoxDriver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("12345");
        // click boton login
        firefoxDriver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();
        Thread.sleep(5000);
    }

    @AfterEach
    public void closeFireFox(){
        firefoxDriver.quit();
    }
}
