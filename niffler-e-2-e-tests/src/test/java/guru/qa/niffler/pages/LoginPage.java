package guru.qa.niffler.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private  SelenideElement loginInput = $(By.xpath("//input[@name='username']"));
    private  SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));
    private  SelenideElement sighInButton = $(By.xpath("//button[@type='submit']"));

    private LoginPage setUserName(String username) {
        loginInput.setValue(username);
        return this;
    }

    private LoginPage setPassword(String password) {
        passwordInput.setValue(password);
        return this;
    }

    private void clickSignInButton() {
        sighInButton.click();
    }

    public void signInUser(String login, String password) {
                 setUserName(login)
                .setPassword(password)
                .clickSignInButton();
    }
}
