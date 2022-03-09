package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class SettingsFullNamePage {
    public Button buttonSettings = new Button(By.xpath("//div[@id='ctl00_HeaderTopControl1_PanelHeaderButtons']/a[@href='javascript:OpenSettingsDialog();']"));
    public TextBox textBoxFullName = new TextBox(By.xpath("//input[@id='FullNameInput']"));
    public Button buttonOk = new Button(By.xpath("//span[text()='Ok']"));
}
