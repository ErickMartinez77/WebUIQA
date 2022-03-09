package pages.pagesDelete;

import control.Section;
import org.openqa.selenium.By;

public class MainPageDelete {
    public Section section = new Section(By.xpath("//li[last()]//td[text()='"+"Project1Update"+"']"));
}
