package pages.pagesDelete;

import control.Alert;
import control.Button;
import control.Image;
import org.openqa.selenium.By;

public class OptionsDelete {
    public Image image = new Image(By.xpath("//div[@style='display: block;']/img"));
    public Button buttonDelete = new Button(By.id("ProjShareMenuDel"));
}
