package pages.pagesUpdate;

import control.Button;
import control.Image;
import control.TextBox;
import org.openqa.selenium.By;

public class OptionsModal {
    public Image image = new Image(By.xpath("//div[@style='display: block;']/img[@src='/Images/dropdown.png']"));
    public Button button = new Button(By.xpath("//a[text()='Edit']"));
    public TextBox textBox = new TextBox(By.xpath("//input[@id='ItemEditTextbox']"));
    public TextBox textBoxSet = new TextBox(By.xpath("//input[@id='ItemEditTextbox']"));
    public Image image2 = new Image(By.xpath("//img[@id='ItemEditSubmit']"));

}
