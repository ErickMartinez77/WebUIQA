package pages.pagesCreate;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class NewProject {
    public TextBox textBox = new TextBox(By.xpath("//input[@id='NewProjNameInput']"));
    public Button button = new Button(By.xpath("//input[@id='NewProjNameButton']"));
}
