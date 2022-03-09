package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginModal;
import pages.MainPage;
import pages.MenuSection;
import pages.pagesCreate.MainPageCreate;
import pages.pagesCreate.NewProject;

public class CreateTest extends BaseTodoly {
    MainPageCreate mainPageCreate = new MainPageCreate();
    NewProject newProject = new NewProject();
    String projectName = "Project1";

    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();

    @Test
    public void createProject() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("webui@gmail.com");
        loginModal.pwdTxtBox.setText("12345");
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR no se pudo hacer el login");

        mainPageCreate.section.click();
        newProject.textBox.setText(projectName);
        newProject.button.click();
        Thread.sleep(3000);
        //Assertions.assertTrue(mainPageCreate.projectTitle.getTextControl().equals(projectName),"ERROR!");
        Assertions.assertEquals(mainPageCreate.projectTitle.getTextControl(),projectName,"ERROR");
    }
}
