package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginModal;
import pages.MainPage;
import pages.MenuSection;
import pages.pagesDelete.OptionsDelete;
import singleton.Session;

public class DeleteTest {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    OptionsDelete optionsDelete = new OptionsDelete();

    @Test
    public void createProject() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("webui@gmail.com");
        loginModal.pwdTxtBox.setText("12345");
        loginModal.loginButton.click();

        optionsDelete.image.click();
        optionsDelete.buttonDelete.click();
        Session.getInstance().getDriver().switchTo().alert().accept();
        //Assertions.assertFalse(optionsDelete);
    }
}
