package pages.pagesCreate;

import control.ProjectTitle;
import control.Section;
import org.openqa.selenium.By;

public class MainPageCreate {
    public Section section = new Section(By.xpath("//div[@id='Div2']"));
    public ProjectTitle projectTitle = new ProjectTitle(By.xpath("//div[@id='CurrentProjectTitle']"));
}
