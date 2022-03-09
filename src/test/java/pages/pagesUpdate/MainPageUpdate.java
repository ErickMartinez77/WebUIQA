package pages.pagesUpdate;

import control.ProjectTitle;
import control.Section;
import org.openqa.selenium.By;

public class MainPageUpdate {
    public Section section = new Section(By.xpath("//li[last()]//td[@class='ProjItemContent']"));
    public ProjectTitle projectTitle = new ProjectTitle(By.xpath("//div[@id='CurrentProjectTitle']"));
}
