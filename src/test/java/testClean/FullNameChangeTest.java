package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginModal;
import pages.MainPage;
import pages.MenuSection;
import pages.SettingsFullNamePage;

public class FullNameChangeTest extends BaseTodoly{
    SettingsFullNamePage settingsFullNamePage = new SettingsFullNamePage();
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();

    String fullNameUpdate="erick2@gmail.com";

    @Test
    public void changeFullName() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("webui@gmail.com");
        loginModal.pwdTxtBox.setText("12345");
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR no se pudo hacer el login");

        settingsFullNamePage.buttonSettings.click();
        Thread.sleep(3000);
        settingsFullNamePage.textBoxFullName.clearSetText("");
        settingsFullNamePage.textBoxFullName.setText(fullNameUpdate);
        settingsFullNamePage.buttonOk.click();
        Thread.sleep(3000);
        settingsFullNamePage.buttonSettings.click();
        Thread.sleep(3000);
        Assertions.assertTrue(settingsFullNamePage.textBoxFullName.getTextAttributeControl("value").equals(fullNameUpdate),"ERROR!");
    }

}
