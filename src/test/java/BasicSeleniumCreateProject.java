import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasicSeleniumCreateProject {
    ChromeDriver chromeDriver;
    @BeforeEach
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        //implicit wait
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        chromeDriver.manage().window().maximize();
        chromeDriver.get("http://todo.ly/");
    }

    @Test
    public void verifyCreateProject() throws InterruptedException {
        String projectName = "Project1";
        String projectNameUpdate = "Project1Update";
        // click img login
        chromeDriver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        // set text email
        chromeDriver.findElement(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$TextBoxEmail']")).sendKeys("webui@gmail.com");
        // set test pwd
        chromeDriver.findElement(By.xpath("//input[contains(@name,'LoginControl1$TextBoxPassword')]")).sendKeys("12345");
        // click boton login
        chromeDriver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();
        Thread.sleep(5000);

        // verificacion : para saber si el login fue satisfactorio
        Assertions.assertTrue( chromeDriver.findElement(By.xpath("//a[text()='Logout']")).isDisplayed(),"ERROR! no se pudo hacer el login");

        // CREATE
        // click create project
        chromeDriver.findElement(By.xpath("//div[@id='Div2']")).click();
        // set project name
        chromeDriver.findElement(By.xpath("//input[@id='NewProjNameInput']")).sendKeys(projectName);
        // click add button
        chromeDriver.findElement(By.xpath("//input[@id='NewProjNameButton']")).click();

        Thread.sleep(5000);
        //verificacion
        Assertions.assertTrue(chromeDriver.findElement(By.xpath("//div[@id='CurrentProjectTitle']")).getText().equals(projectName),"ERROR!");


        //UPDATE
        chromeDriver.findElement(By.xpath("//li[last()]//td[@class='ProjItemContent']"));
        chromeDriver.findElement(By.xpath("//div[@style='display: block;']/img[@src='/Images/dropdown.png']")).click();
        chromeDriver.findElement(By.xpath("//a[text()='Edit']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='ItemEditTextbox']")).clear();
        chromeDriver.findElement(By.xpath("//input[@id='ItemEditTextbox']")).sendKeys(projectNameUpdate);
        chromeDriver.findElement(By.xpath("//img[@id='ItemEditSubmit']")).click();

        Thread.sleep(5000);
        //verificacion
        Assertions.assertTrue(chromeDriver.findElement(By.xpath("//div[@id='CurrentProjectTitle']")).getText().equals(projectNameUpdate),"ERROR UPDATE!");

        //  DELETE
        chromeDriver.findElement(By.xpath("//li[last()]//td[text()='"+projectNameUpdate+"']")).click();
        chromeDriver.findElement(By.xpath("//div[@style='display: block;']/img")).click();
        chromeDriver.findElement(By.id("ProjShareMenuDel")).click();
        // ******* alerta   ***********
        chromeDriver.switchTo().alert().accept();
        Thread.sleep(2000);
        String currentName=chromeDriver.findElement(By.id("CurrentProjectTitle")).getText();
        Assertions.assertTrue(!currentName.equals(projectNameUpdate),"ERROR el projecto no se Elimino");
    }
}
