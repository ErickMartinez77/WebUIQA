package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginModal;
import pages.MainPage;
import pages.MenuSection;
import pages.pagesUpdate.MainPageUpdate;
import pages.pagesUpdate.OptionsModal;

public class UpdateTest extends BaseTodoly{
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();
    String projectNameUpdate = "Project1Update";

    MainPageUpdate mainPageUpdate = new MainPageUpdate();
    OptionsModal optionsModal = new OptionsModal();

    @Test
    public void updateProject() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("webui@gmail.com");
        loginModal.pwdTxtBox.setText("12345");
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR no se pudo hacer el login");

        mainPageUpdate.section.click();
        optionsModal.image.click();
        optionsModal.button.click();
        optionsModal.textBox.clearSetText("");
        optionsModal.textBoxSet.setText(projectNameUpdate);
        optionsModal.image2.click();
        Thread.sleep(3000);
        Assertions.assertTrue(mainPageUpdate.projectTitle.getTextControl().equals(projectNameUpdate),"ERROR!");

    }
}
